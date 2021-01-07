package com.wmt.avani;

public class User {
    private String fname,lname ,email,dob;

    public User(String fname, String lname, String email, String dob) {

        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.dob = dob;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }
}
