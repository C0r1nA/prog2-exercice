package com.example;

public class Subject {
    private int id;
    private String label;
    private int credit;
    private Teacher teacher;

    private Subject(int id, String label, int credit, Teacher teacher) {
        this.id = id;
        this.label = label;
        this.credit = credit;
        this.teacher = teacher;
    }

    public int getId() { return id; }
    public String getLabel() { return label; }
    public int getCredit() { return credit; }
    public Teacher getTeacher() { return teacher; }
    public void setId(int id) { this.id = id; }
    public void setLabel(String label) { this.label = label; }
    public void setCredit(int credit) { this.credit = credit; }
    public void setTeacher(Teacher teacher) { this.teacher = teacher; }
    
}
