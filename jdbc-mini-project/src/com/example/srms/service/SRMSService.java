package com.example.srms.service;

import com.example.srms.dao.CourseDAO;
import com.example.srms.dao.DatabaseManager;
import com.example.srms.dao.StudentDAO;
import com.example.srms.dao.SubjectDAO;
import com.example.srms.models.Course;
import com.example.srms.models.Student;
import com.example.srms.models.Subject;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class SRMSService {
    private final DatabaseManager dbManager;
    private final CourseDAO courseDAO;
    private final SubjectDAO subjectDAO;
    private final StudentDAO studentDAO;
    private final Scanner scanner = new Scanner(System.in);

    public SRMSService(DatabaseManager dbManager) {
        this.dbManager = dbManager;
        this.courseDAO = new CourseDAO(dbManager);
        this.subjectDAO = new SubjectDAO(dbManager);
        this.studentDAO = new StudentDAO(dbManager);
    }

    public void addNewStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine().trim();

        System.out.println("Enter email:");
        String email = scanner.nextLine().trim();

        System.out.println("Enter phone:");
        String phone = scanner.nextLine().trim();

        System.out.println("Enter DOB (YYYY-MM-DD) or leave blank:");
        String dobInput = scanner.nextLine().trim();
        LocalDate dob = null;
        if (!dobInput.isBlank()) {
            try { dob = LocalDate.parse(dobInput); } catch (DateTimeParseException ex) { System.out.println("Invalid date, ignoring."); }
        }

        System.out.println("Enter gender:");
        String gender = scanner.nextLine().trim();

        System.out.println("Enter semester (number):");
        int sem = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Enter address:");
        String address = scanner.nextLine().trim();

        // choose course
        List<Course> courses = courseDAO.getAllCourses();
        Course chosen = null;
        if (courses.isEmpty()) {
            System.out.println("No courses found. Add a course first.");
            return;
        }
        System.out.println("Available courses:");
        for (Course c : courses) {
            System.out.printf("%d: %s (%s)\n", c.getCourseId(), c.getCourseName(), c.getCourseCode());
        }
        System.out.println("Enter course id for the student:");
        Long courseId = Long.parseLong(scanner.nextLine().trim());
        chosen = courseDAO.getCourseById(courseId);
        if (chosen == null) {
            System.out.println("Invalid course id.");
            return;
        }

        Student s = new Student();
        s.setName(name);
        s.setEmail(email);
        s.setPhone(phone);
        s.setDob(dob);
        s.setGender(gender);
        s.setSemester(sem);
        s.setAddress(address);
        s.setCourse(chosen);

        Long id = studentDAO.addStudent(s);
        if (id != null) System.out.println("Student added with ID: " + id);
        else System.out.println("Failed to add student.");
    }

    public void addCourse() {
        System.out.println("Enter course name:");
        String name = scanner.nextLine().trim();
        System.out.println("Enter course code:");
        String code = scanner.nextLine().trim();
        Course c = new Course();
        c.setCourseName(name);
        c.setCourseCode(code);
        Long id = courseDAO.addCourse(c);
        if (id != null) System.out.println("Course added with ID: " + id);
        else System.out.println("Failed to add course.");
    }

    public void addSubjectToCourse() {
        List<Course> courses = courseDAO.getAllCourses();
        if (courses.isEmpty()) { System.out.println("No courses present. Add a course first."); return; }
        System.out.println("Available courses:");
        for (Course c : courses) System.out.printf("%d: %s (%s)\n", c.getCourseId(), c.getCourseName(), c.getCourseCode());
        System.out.println("Enter course id to add subject to:");
        Long courseId = Long.parseLong(scanner.nextLine().trim());
        Course chosen = courseDAO.getCourseById(courseId);
        if (chosen == null) { System.out.println("Invalid course id."); return; }

        System.out.println("Enter subject name:");
        String name = scanner.nextLine().trim();
        System.out.println("Enter subject code:");
        String code = scanner.nextLine().trim();
        System.out.println("Enter max marks (default 100):");
        int max = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Enter pass marks (default 35):");
        int pass = Integer.parseInt(scanner.nextLine().trim());

        Subject subj = new Subject();
        subj.setSubjectName(name);
        subj.setSubjectCode(code);
        subj.setMaxMarks(max);
        subj.setPassMarks(pass);
        Long id = subjectDAO.addSubject(subj, courseId);
        if (id != null) System.out.println("Subject added with ID: " + id);
        else System.out.println("Failed to add subject.");
    }

    public void enterStudentMarks() {
        System.out.println("Enter student id:");
        Long sid = Long.parseLong(scanner.nextLine().trim());
        Student s = studentDAO.getStudentById(sid);
        if (s == null) { System.out.println("Student not found."); return; }
        Course c = s.getCourse();
        if (c == null) { System.out.println("Student has no course assigned."); return; }
        List<Subject> subs = c.getSubjects();
        if (subs == null || subs.isEmpty()) { System.out.println("No subjects for student's course."); return; }
        System.out.println("Entering marks for student: " + s.getName());
        for (Subject sub : subs) {
            System.out.printf("Subject %s (%s) - Max %d, Pass %d\n", sub.getSubjectName(), sub.getSubjectCode(), sub.getMaxMarks(), sub.getPassMarks());
            System.out.println("Enter marks obtained:");
            int marks = Integer.parseInt(scanner.nextLine().trim());
            boolean ok = studentDAO.setStudentSubjectMark(sid, sub.getSubjectId(), marks);
            System.out.println(ok ? "Saved." : "Failed to save marks.");
        }
    }

    public void generateResultCard(Long studentId) {
        Student s = studentDAO.getStudentById(studentId);
        if (s == null) { System.out.println("Student not found."); return; }
        System.out.println("----- Result Card -----");
        System.out.println("Student: " + s.getName());
        System.out.println("Course: " + (s.getCourse() != null ? s.getCourse().getCourseName() : "N/A"));
        if (s.getCourse() == null) { System.out.println("No course assigned.\n"); return; }
        List<Subject> subs = s.getCourse().getSubjects();
        if (subs == null || subs.isEmpty()) { System.out.println("No subjects found for course."); return; }
        int totalObtained = 0;
        int totalMax = 0;
        boolean allPass = true;
        System.out.println("Subject-wise:");
        for (Subject sub : subs) {
            int mo = sub.getMarksObtained();
            System.out.printf("%s (%s): %d/%d (Pass %d)\n", sub.getSubjectName(), sub.getSubjectCode(), mo, sub.getMaxMarks(), sub.getPassMarks());
            totalObtained += mo;
            totalMax += sub.getMaxMarks();
            if (mo < sub.getPassMarks()) allPass = false;
        }
        double percent = totalMax == 0 ? 0.0 : (totalObtained * 100.0 / totalMax);
        System.out.println("Total: " + totalObtained + " / " + totalMax);
        System.out.printf("Percentage: %.2f%%\n", percent);
        System.out.println("Result: " + (allPass ? "PASS" : "FAIL"));
    }

    public void listAllStudents() {
        List<Student> list = studentDAO.getAllStudents();
        if (list.isEmpty()) { System.out.println("No students found."); return; }
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
