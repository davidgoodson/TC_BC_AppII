/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker_classes;

import java.util.Date;

/**
 *
 * @author david
 */
public class Student {
    private String name;
    private String address;
    private Date dob;
    private String gender;
    
    public Student(){}

    public Student(String name, String address, Date dob, String gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
