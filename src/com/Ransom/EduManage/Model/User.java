package com.Ransom.EduManage.Model;

public class User {
    private String firstName;
    private String LastName;
    private String Email;
    private String Password;

    public  User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.Password = password;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;    }

    public void setPassword(String password) {
        Password = password;
    }
}
