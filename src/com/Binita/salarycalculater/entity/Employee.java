/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.salarycalculater.entity;

/**
 *
 * @author Bini
 */
public class Employee {
    private int id;
    private String fname,lname;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String fname, String lname, double salary) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toCSV() {
      return id + "," + fname + "," + lname + "," + salary + "\r\n";
    }
    
    
}
