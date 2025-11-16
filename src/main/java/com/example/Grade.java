package com.example;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Grade {
    private Student student;
    private Exams exam;
    private double value;
    private List<GradeHistory> history;

    public Grade(double value) {
        this.value = value;
        this.history = new ArrayList<>();
    }

    public double getValue() { return value; }
    public Etudiant getStudent() { return student; }
    public Exam getExam() { return exam; }
    public List<GradeHistory> getHistory() { return history; }

    public void setValue(double newValue, String reason) {
        GradeHistory gradeHistory = new GradeHistory(this.value, newValue, LocalDateTime.now(), reason);
        this.history.add(gradeHistory);
        this.value = newValue;
    }

}
