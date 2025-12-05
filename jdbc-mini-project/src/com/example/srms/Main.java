package com.example.srms;

import com.example.srms.dao.DatabaseManager;
import com.example.srms.service.SRMSService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to SRMS");

        // Configure DB via environment variables for convenience
        String dbUrl = System.getenv().getOrDefault("DB_URL", "jdbc:sqlite:srms.db");
        String dbUser = System.getenv().getOrDefault("DB_USER", "");
        String dbPassword = System.getenv().getOrDefault("DB_PASSWORD", "");

        DatabaseManager dbManager = new DatabaseManager(dbUrl, dbUser, dbPassword);
        SRMSService service = new SRMSService(dbManager);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Add Subject");
            System.out.println("4. Enter Marks");
            System.out.println("5. Generate Result");
            System.out.println("6. View All Students");
            System.out.println("7. Exit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine().trim();
            try {
                int c = Integer.parseInt(choice);
                switch (c) {
                    case 1 -> service.addNewStudent();
                    case 2 -> service.addCourse();
                    case 3 -> service.addSubjectToCourse();
                    case 4 -> service.enterStudentMarks();
                    case 5 -> {
                        System.out.println("Enter student id:");
                        Long sid = Long.parseLong(scanner.nextLine().trim());
                        service.generateResultCard(sid);
                    }
                    case 6 -> service.listAllStudents();
                    case 7 -> {
                        System.out.println("Bye");
                        System.exit(0);
                    }
                    default -> System.out.println("Unknown option");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice");
            }
            System.out.println();
        }
    }
}
