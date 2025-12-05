package com.example.srms.dao;

import com.example.srms.models.Course;
import com.example.srms.models.Student;
import com.example.srms.models.Subject;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private final DatabaseManager dbManager;
    private final CourseDAO courseDAO;

    public StudentDAO(DatabaseManager dbManager) {
        this.dbManager = dbManager;
        this.courseDAO = new CourseDAO(dbManager);
    }

    public Long addStudent(Student student) {
        String sql = "INSERT INTO students (name, email, phone, dob, gender, semester, address, course_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPhone());
            ps.setDate(4, student.getDob() == null ? null : Date.valueOf(student.getDob()));
            ps.setString(5, student.getGender());
            ps.setInt(6, student.getSemester());
            ps.setString(7, student.getAddress());
            ps.setObject(8, student.getCourse() != null ? student.getCourse().getCourseId() : null);
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    long id = rs.getLong(1);
                    student.setStudentId(id);
                    return id;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error adding student: " + e.getMessage());
        }
        return null;
    }

    public Student getStudentById(Long id) {
        String sql = "SELECT student_id, name, email, phone, dob, gender, semester, address, course_id FROM students WHERE student_id = ?";
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Student s = new Student();
                    s.setStudentId(rs.getLong("student_id"));
                    s.setName(rs.getString("name"));
                    s.setEmail(rs.getString("email"));
                    s.setPhone(rs.getString("phone"));
                    Date d = rs.getDate("dob");
                    if (d != null) s.setDob(d.toLocalDate());
                    s.setGender(rs.getString("gender"));
                    s.setSemester(rs.getInt("semester"));
                    s.setAddress(rs.getString("address"));
                    Long courseId = rs.getObject("course_id") == null ? null : rs.getLong("course_id");
                    if (courseId != null) {
                        Course c = courseDAO.getCourseById(courseId);
                        s.setCourse(c);
                        // load marks for each subject
                        if (c != null && c.getSubjects() != null) {
                            loadMarksForStudent(s);
                        }
                    }
                    return s;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching student: " + e.getMessage());
        }
        return null;
    }

    public List<Student> getAllStudents() {
        String sql = "SELECT student_id, name, email, phone, dob, gender, semester, address, course_id FROM students";
        List<Student> list = new ArrayList<>();
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Student s = new Student();
                s.setStudentId(rs.getLong("student_id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));
                Date d = rs.getDate("dob");
                if (d != null) s.setDob(d.toLocalDate());
                s.setGender(rs.getString("gender"));
                s.setSemester(rs.getInt("semester"));
                s.setAddress(rs.getString("address"));
                Long courseId = rs.getObject("course_id") == null ? null : rs.getLong("course_id");
                if (courseId != null) {
                    Course c = courseDAO.getCourseById(courseId);
                    s.setCourse(c);
                }
                list.add(s);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching students: " + e.getMessage());
        }
        return list;
    }

    public boolean updateStudent(Student student) {
        String sql = "UPDATE students SET name=?, email=?, phone=?, dob=?, gender=?, semester=?, address=?, course_id=? WHERE student_id=?";
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setString(3, student.getPhone());
            ps.setDate(4, student.getDob() == null ? null : Date.valueOf(student.getDob()));
            ps.setString(5, student.getGender());
            ps.setInt(6, student.getSemester());
            ps.setString(7, student.getAddress());
            ps.setObject(8, student.getCourse() != null ? student.getCourse().getCourseId() : null);
            ps.setLong(9, student.getStudentId());
            int updated = ps.executeUpdate();
            return updated > 0;
        } catch (SQLException e) {
            System.err.println("Error updating student: " + e.getMessage());
        }
        return false;
    }

    public boolean deleteStudent(Long id) {
        String sql = "DELETE FROM students WHERE student_id = ?";
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            int deleted = ps.executeUpdate();
            return deleted > 0;
        } catch (SQLException e) {
            System.err.println("Error deleting student: " + e.getMessage());
        }
        return false;
    }

    // Additional helper: set or update marks for a student & subject
    public boolean setStudentSubjectMark(Long studentId, Long subjectId, int marks) {
        String updateSql = "UPDATE student_subject_marks SET marks_obtained = ? WHERE student_id = ? AND subject_id = ?";
        String insertSql = "INSERT INTO student_subject_marks (student_id, subject_id, marks_obtained) VALUES (?, ?, ?)";
        try (Connection conn = dbManager.getConnection(); PreparedStatement psUpdate = conn.prepareStatement(updateSql)) {
            psUpdate.setInt(1, marks);
            psUpdate.setLong(2, studentId);
            psUpdate.setLong(3, subjectId);
            int updated = psUpdate.executeUpdate();
            if (updated > 0) return true;
            try (PreparedStatement psInsert = conn.prepareStatement(insertSql)) {
                psInsert.setLong(1, studentId);
                psInsert.setLong(2, subjectId);
                psInsert.setInt(3, marks);
                int inserted = psInsert.executeUpdate();
                return inserted > 0;
            }
        } catch (SQLException e) {
            System.err.println("Error setting marks: " + e.getMessage());
        }
        return false;
    }

    private void loadMarksForStudent(Student s) {
        if (s.getStudentId() == null || s.getCourse() == null) return;
        String sql = "SELECT s.subject_id, s.subject_name, s.max_marks, s.pass_marks, COALESCE(sm.marks_obtained,0) AS marks_obtained FROM subjects s LEFT JOIN student_subject_marks sm ON sm.subject_id = s.subject_id AND sm.student_id = ? WHERE s.course_id = ?";
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, s.getStudentId());
            ps.setLong(2, s.getCourse().getCourseId());
            try (ResultSet rs = ps.executeQuery()) {
                List<Subject> subs = new ArrayList<>();
                while (rs.next()) {
                    Subject subj = new Subject();
                    subj.setSubjectId(rs.getLong("subject_id"));
                    subj.setSubjectName(rs.getString("subject_name"));
                    subj.setMaxMarks(rs.getInt("max_marks"));
                    subj.setPassMarks(rs.getInt("pass_marks"));
                    subj.setMarksObtained(rs.getInt("marks_obtained"));
                    subs.add(subj);
                }
                s.getCourse().setSubjects(subs);
            }
        } catch (SQLException e) {
            System.err.println("Error loading marks for student: " + e.getMessage());
        }
    }
}
