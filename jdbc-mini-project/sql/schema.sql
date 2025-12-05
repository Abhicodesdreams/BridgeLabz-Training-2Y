-- Schema for Student Result Management System (SRMS)
-- Works with MySQL. For SQLite minor adjustments may be required (AUTOINCREMENT -> AUTOINCREMENT and engine/charset omitted)

CREATE TABLE IF NOT EXISTS courses (
  course_id BIGINT PRIMARY KEY AUTO_INCREMENT,
  course_name VARCHAR(255) NOT NULL,
  course_code VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS subjects (
  subject_id BIGINT PRIMARY KEY AUTO_INCREMENT,
  subject_name VARCHAR(255) NOT NULL,
  subject_code VARCHAR(100) NOT NULL,
  max_marks INT NOT NULL DEFAULT 100,
  pass_marks INT NOT NULL DEFAULT 35,
  course_id BIGINT NOT NULL,
  FOREIGN KEY (course_id) REFERENCES courses(course_id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS students (
  student_id BIGINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) UNIQUE,
  phone VARCHAR(50),
  dob DATE,
  gender VARCHAR(20),
  semester INT,
  address VARCHAR(500),
  course_id BIGINT,
  FOREIGN KEY (course_id) REFERENCES courses(course_id) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS student_subject_marks (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  student_id BIGINT NOT NULL,
  subject_id BIGINT NOT NULL,
  marks_obtained INT NOT NULL DEFAULT 0,
  UNIQUE KEY uniq_student_subject (student_id, subject_id),
  FOREIGN KEY (student_id) REFERENCES students(student_id) ON DELETE CASCADE,
  FOREIGN KEY (subject_id) REFERENCES subjects(subject_id) ON DELETE CASCADE
);
