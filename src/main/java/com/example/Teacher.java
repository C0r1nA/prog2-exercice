package com.example;
import java.time.LocalDate;

public class Teacher extends Person {
    private Speciality speciality;

    public Teacher(int id, String lastName, String firstName, LocalDate birthdate, String email, String phoneNumber, Speciality speciality) {
        super(id, lastName, firstName, birthdate, email, phoneNumber);
        this.speciality = speciality;
    }

    public Speciality getSpeciality() { return speciality; }
    public void setSpeciality(Speciality speciality) { this.speciality = speciality; }

    

}
