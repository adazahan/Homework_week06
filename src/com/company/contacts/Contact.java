package com.company.contacts;

public class Contact {
    private static int globalId =0;
    private int id;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contact(){}

    public Contact(String phoneNumber, String firstName, String lastName) {
        this.id = globalId++;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return '\n' + id + ", numar de telefon:" + phoneNumber + ", prenume contact: " + firstName + ", nume contact: " + lastName;
    }
}
