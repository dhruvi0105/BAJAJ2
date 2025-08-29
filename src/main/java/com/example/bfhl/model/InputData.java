package com.example.bfhl.model;

import java.util.List;

public class InputData {
    private String full_name;
    private String dob;
    private String email_id;
    private String college_roll_number;
    private List<Object> array;

    // Getters and setters
    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail_id() {
        return email_id;
    }
    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getCollege_roll_number() {
        return college_roll_number;
    }
    public void setCollege_roll_number(String college_roll_number) {
        this.college_roll_number = college_roll_number;
    }

    public List<Object> getArray() {
        return array;
    }
    public void setArray(List<Object> array) {
        this.array = array;
    }
}
