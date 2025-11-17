package com.example;
import java.time.LocalDateTime;

public class Exams {
    private int id;
    private String title;
    private Subject subject;
    private LocalDateTime examDateTime;
    private int coefficient;

    public Exams(int id, String title, Subject subject, LocalDateTime examDateTime, int coefficient) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.examDateTime = examDateTime;
        this.coefficient = coefficient;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public Subject getSubject() { return subject; }
    public LocalDateTime getExamDateTime() { return examDateTime; }
    public int getCoefficient() { return coefficient; }
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setSubject(Subject subject) { this.subject = subject; }
    public void setExamDateTime(LocalDateTime examDateTime) { this.examDateTime = examDateTime; }
    public void setCoefficient(int coefficient) { this.coefficient = coefficient; }
    

}
