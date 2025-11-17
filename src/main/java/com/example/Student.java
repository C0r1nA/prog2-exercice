package com.example;

public class Student extends Person {
    private Group group;
    private Tutor tutor;

    public Student(int id, String lastName, String firstName, java.time.LocalDate birthdate, String email, String phoneNumber, Group group, Tutor tutor) {
        super(id, lastName, firstName, birthdate, email, phoneNumber);
        this.group = group;
        this.tutor = tutor;
    }

    public Group getGroup() { return group; }
    public Tutor getTutor() { return tutor; }
    public void setTutor(Tutor tutor) { this.tutor = tutor; }
    public void setGroup(Group group) { this.group = group; }  

    
} 
    

