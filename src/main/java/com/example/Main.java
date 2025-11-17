package com.example;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main( String[] args ) {
        Promotion L1 = new Promotion("L1", null);
        Group N1 = new Group("N1", L1);
        Group N2 = new Group("N2", L1);
        Group N3 = new Group("N3", L1);
        L1.setGroup(List.of(N1, N2, N3));

        Promotion L2 = new Promotion("L2", null);
        Group K1 = new Group("K1", L2);
        Group K2 = new Group("K2", L2);
        Group K3 = new Group("K3", L2);
        L2.setGroup(List.of(K1, K2, K3));

        Promotion L3 = new Promotion("L3", null);
        Group J1 = new Group("J1", L3);
        Group J2 = new Group("J2", L3);
        L3.setGroup(List.of(J1, J2));

        Tutor tutor1 = new Tutor(1, "Ramasamy", "Eulalie", LocalDate.of(1980, 5, 15), "eulalie@gmail.com", "034567890", "Mother");
        Tutor tutor2 = new Tutor(2, "Rakoto", "Jean", LocalDate.of(1975, 8, 22), "rakjean@gmail.com", "034123456", "Father");

        Teacher teacher1 = new Teacher(1, "Hanta", "Alice", LocalDate.of(1990, 2, 28), "hanta@gmail.com", "0312345678", Speciality.BACKEND);
        Teacher teacher2 = new Teacher(2, "Andria", "Mirija", LocalDate.of(1985, 12, 12), "mirija@gmail.com", "0318765432", Speciality.FRONTEND);

        Subject PROG2 = new Subject(1, "PROG2", 6, teacher1);

        Exams PROG2_Midterm = new Exams(1, null, PROG2, LocalDateTime.of(2024, 04, 14, 0, 0), );
        Exams PROG2_Final = new Exams(2, "PROG2 Final", PROG2, LocalDateTime.of(2024, 8, 20, 0, 0), 3);

        Student student1 = new Student(1, "Andrianina", "Hery", LocalDate.of(2006, 3, 10), "hery@gmail.com", "0323456789", K2, tutor1);
        Student student2 = new Student(2, "Rasoa", "Lala", LocalDate.of(2003, 11, 5), "lala@gmail.com", "0329876543", J2, tutor2);

        List<Grade> grades = new java.util.ArrayList<>();

        Grade grade1 = new Grade(14);

        Grade grade2 = new Grade(12);

        grades.add(grade1);
        grades.add(grade2);

        LocalDateTime now = LocalDateTime.now();

        double PROG2_MidtermNote = GradeCalcul.getExamGrade(PROG2_Midterm, student1, now, grades);
        double PROG2_FinalNote = GradeCalcul.getExamGrade(PROG2_Final, student1, now, grades);

        double PROG2_CourseNote = GradeCalcul.getCourseGrade(PROG2, student1, now, grades, List.of(PROG2_Midterm, PROG2_Final));

        System.out.println("Notes of student: " + student1.getfirstName() + " " + student1.getlastName() + " ===");
        System.out.println("PROG2 Midterm: " + PROG2_MidtermNote);
        System.out.println("PROG2 Final: " + PROG2_FinalNote);
        System.out.println("PROG2 Course Note: " + PROG2_CourseNote);
    }
}
