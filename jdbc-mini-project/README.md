# JDBC Mini Project - Student Result Management System (SRMS)

Project: jdbc-mini-project

Overview
--------
This is a small console-based Student Result Management System (SRMS) implemented in Java 17 using plain JDBC. It demonstrates Clean Architecture with Model, DAO, and Service layers. The project supports either MySQL or SQLite. Use MySQL for a production-like setup or SQLite for quick local testing.

Features
--------
- Create and manage Courses and Subjects
- Create and manage Students
- Enter student marks for subjects
- Generate a result card for a student (total, percentage, pass/fail)

Requirements
------------
- Java 17+
- MySQL server (optional) or SQLite (no server)
- JDBC driver (MySQL Connector/J) if using MySQL

Project structure
-----------------
```
jdbc-mini-project/
└─ src/
   └─ com/example/srms/
       ├─ Main.java
       ├─ models/
       │    ├─ Student.java
       │    ├─ Course.java
       │    └─ Subject.java
       ├─ dao/
       │    ├─ DatabaseManager.java
       │    ├─ StudentDAO.java
       │    ├─ CourseDAO.java
       │    └─ SubjectDAO.java
       └─ service/
            └─ SRMSService.java
└─ sql/
      └─ schema.sql
└─ README.md
```

Database setup
--------------
Two options are provided below.

MySQL (recommended for full features)
1. Create a database (example name: srms)

   CREATE DATABASE srms CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

2. Run the SQL in `sql/schema.sql` against the `srms` database to create tables.
3. Update the DB connection details in `DatabaseManager` or provide them via environment variables:
   - DB_URL (jdbc:mysql://localhost:3306/srms)
   - DB_USER
   - DB_PASSWORD
4. Ensure MySQL Connector/J is on the classpath (e.g., add dependency in your build tool or place the jar in the classpath).

SQLite (quick local testing)
1. No server required. The default `DatabaseManager` will detect a sqlite JDBC URL if you set DB_URL to something like `jdbc:sqlite:srms.db`.
2. Run `sql/schema.sql` using the sqlite3 CLI or the program will create tables if they do not exist (SQLite tolerates many DDL differences; use sqlite3 to execute the file).

How to compile and run
----------------------
From the project root (`jdbc-mini-project`) compile and run with javac/java (ensure classpath includes JDBC driver if using MySQL):

```bash
# from project root
javac -d out $(find src -name "*.java")
java -cp out:./lib/* com.example.srms.Main
```

Notes:
- If you use MySQL you'll need the Connector/J JAR in `./lib` or your build classpath.
- For SQLite, add `sqlite-jdbc` to `./lib` or your classpath.

Sample output (abridged)
-----------------------
```
Welcome to SRMS
1. Add Student
2. Add Course
3. Add Subject
4. Enter Marks
5. Generate Result
6. View All Students
7. Exit
Choose: 2
Enter course name: B.Sc Computer Science
Enter course code: BSC-CS
Course added with ID: 1
```

Next steps and improvements
---------------------------
- Add unit tests and more validation
- Add proper dependency management with Maven/Gradle
- Add transactional behavior for multi-step operations

License
-------
MIT-style (feel free to adapt)
