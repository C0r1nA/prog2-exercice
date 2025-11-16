package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class GradeCalcul {
    
    public static double getExamGrade(Exam exam, Student student, LocalDateTime t, List<Grade> grades) {
        for (Grade g : grades) {
            if (g.getExam().equals(exam) && g.getStudent().equals(student)) {
                double val = g.getValue();
                for (GradeHistory h : g.getHistory()) {
                    if (!h.getTimestamp().isAfter(t)) {
                        val = h.getNewValue();
                    } else {
                        break;
                    }
                }
                return val;
            }
        }
        return 0;
    }

    public static double getCourseGrade(Subject subject, Student student, LocalDateTime t, List<Grade> grades, List<Exam> exams) {
        double sumWeighted = 0;
        int sumCoeffs = 0;

        for (Exam exam : exams) {
            if (exam.getCourse().equals(course)) {
                double note = getExamGrade(exam, student, t, grades);
                sumWeighted += note * exam.getCoefficient();
                sumCoeffs += exam.getCoefficient();
            }
        }
        return sumCoeffs == 0 ? 0 : sumWeighted / sumCoeffs;
    }
}
