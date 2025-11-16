package com.example;
import java.time.LocalDate;

public class Tutor extends Person {
    private String tutorStudentRelationship;
    
    public Tutor(int id, String lastName, String firstName, LocalDate birthdate, String email, String phoneNumber, String tutorStudentRelationship) {
        super(id, lastName, firstName, birthdate, email, phoneNumber);
        this.tutorStudentRelationship = tutorStudentRelationship;
    }

    public String getTutorStudentRelationship() { return tutorStudentRelationship; }
    public void setTutorStudentRelationship(String tutorStudentRelationship) { this.tutorStudentRelationship =
    tutorStudentRelationship; }

    
}
