/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Binita.SalaryCalculator.controller;

import com.Binita.salarycalculater.DAO.EmployeeDAO;
import com.Binita.salarycalculater.entity.Employee;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class EmployeeController {

    private Scanner input;
    EmployeeDAO employeeDAO;
    List<Employee> employelist = new ArrayList<>();

    public EmployeeController() {
    }

    public EmployeeController(Scanner input, EmployeeDAO employeeDAO) {
        this.input = input;
        this.employeeDAO = employeeDAO;
    }

    private void menu() {

        System.out.println("1.add Employee");

        System.out.println("2.show all Employee detail");
        System.out.println("3.write to file");
        System.out.println("4.exit");
        System.out.println("5.enter your choice from[1-5]");
    }

    public void add() {

        Employee e = new Employee();
        System.out.println("enter id");
        e.setId(input.nextInt());
        System.out.println("enter first name");
        e.setFname(input.next());
        System.out.println("enter last name");
        e.setLname(input.next());
        System.out.println("enter salary");
        e.setSalary(input.nextDouble());
        employeeDAO.insert(e);

    }

    public void showAll() {
        employeeDAO.getAll().forEach(e -> {
            System.out.println("id:" + e.getId());
            System.out.println("firstname:" + e.getFname());
            System.out.println("lastname:" + e.getLname());
            System.out.println("salary:" + e.getSalary());
        });

    }

    public void writeToFile() throws IOException {

        FileWriter writer = new FileWriter("c:/users/bini/desktop/file.txt");
        employeeDAO.getAll().forEach(e -> {
            try {
                writer.write(e.getId() + "" + e.getFname() + "" + e.getLname() + "" + (e.getSalary() + e.getSalary() * 0.2));
                System.out.println("witten successfully");
                writer.close();
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        });
    }

    public void process() throws IOException {
        while (true) {
            menu();
            int ch = input.nextInt();
            switch (ch) {

                case 1:
                    add();
                    break;
                case 2:
                    showAll();
                    break;
                case 3:
                    writeToFile();
                    break;

                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
