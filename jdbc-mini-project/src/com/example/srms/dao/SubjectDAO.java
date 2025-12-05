package com.example.srms.dao;

import com.example.srms.models.Subject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SubjectDAO {
    private final DatabaseManager dbManager;

    public SubjectDAO(DatabaseManager dbManager) {
        this.dbManager = dbManager;
    }

    public Long addSubject(Subject subject, Long courseId) {
        String sql = "INSERT INTO subjects (subject_name, subject_code, max_marks, pass_marks, course_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, subject.getSubjectName());
            ps.setString(2, subject.getSubjectCode());
            ps.setInt(3, subject.getMaxMarks());
            ps.setInt(4, subject.getPassMarks());
            ps.setLong(5, courseId);
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    long id = rs.getLong(1);
                    subject.setSubjectId(id);
                    return id;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error adding subject: " + e.getMessage());
        }
        return null;
    }

    public List<Subject> getSubjectsByCourseId(Long courseId) {
        String sql = "SELECT subject_id, subject_name, subject_code, max_marks, pass_marks FROM subjects WHERE course_id = ?";
        List<Subject> list = new ArrayList<>();
        try (Connection conn = dbManager.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, courseId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Subject s = new Subject();
                    s.setSubjectId(rs.getLong("subject_id"));
                    s.setSubjectName(rs.getString("subject_name"));
                    s.setSubjectCode(rs.getString("subject_code"));
                    s.setMaxMarks(rs.getInt("max_marks"));
                    s.setPassMarks(rs.getInt("pass_marks"));
                    list.add(s);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching subjects: " + e.getMessage());
        }
        return list;
    }
}
