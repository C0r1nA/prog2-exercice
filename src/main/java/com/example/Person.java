package com.example;
import java.time.LocalDate;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;

    public Person(int id, String lastName, String firstName, LocalDate birthDate, String email, String phoneNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() { return id; }
    public String getlastName() {return lastName; }
    public String getfirstName() { return firstName; }
    public LocalDate getbirthDate() { return birthDate; }
    public String getEmail() { return email; }
    public String getphoneNumber() { return phoneNumber; }

    public void setId(int id) { this.id = id; }
    public void setlastName(String lastName) { this.lastName = lastName; }
    public void setfirstName(String firstName) { this.firstName = firstName; }
    public void setbirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public void setEmail(String email) { this.email = email; }
    public void setphoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    
}
