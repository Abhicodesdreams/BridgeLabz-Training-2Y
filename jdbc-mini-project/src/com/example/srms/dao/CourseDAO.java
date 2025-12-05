package com.example.srms.dao;

import com.example.srms.models.Course;
import com.example.srms.models.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
    private final DatabaseManager dbManager;
    private final SubjectDAO subjectDAO;

    public CourseDAO(DatabaseManager dbManager) {
        this.dbManager = dbManager;
        this.subjectDAO = new SubjectDAO(dbManager);
    }

    public Long addCourse(Course course) {
        String sql = "INSERT INTO courses (course_name, course_code) VALUES (?, ?)";
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, course.getCourseName());
            ps.setString(2, course.getCourseCode());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    long id = rs.getLong(1);
                    course.setCourseId(id);
                    return id;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error adding course: " + e.getMessage());
        }
        return null;
    }

    public Course getCourseById(Long id) {
        String sql = "SELECT course_id, course_name, course_code FROM courses WHERE course_id = ?";
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Course c = new Course();
                    c.setCourseId(rs.getLong("course_id"));
                    c.setCourseName(rs.getString("course_name"));
                    c.setCourseCode(rs.getString("course_code"));
                    List<Subject> subjects = subjectDAO.getSubjectsByCourseId(id);
                    c.setSubjects(subjects);
                    return c;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching course: " + e.getMessage());
        }
        return null;
    }

    public List<Course> getAllCourses() {
        List<Course> result = new ArrayList<>();
        String sql = "SELECT course_id, course_name, course_code FROM courses";
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Course c = new Course();
                long id = rs.getLong("course_id");
                c.setCourseId(id);
                c.setCourseName(rs.getString("course_name"));
                c.setCourseCode(rs.getString("course_code"));
                c.setSubjects(subjectDAO.getSubjectsByCourseId(id));
                result.add(c);
            }
        } catch (SQLException e) {
            System.err.println("Error fetching courses: " + e.getMessage());
        }
        return result;
    }
}
