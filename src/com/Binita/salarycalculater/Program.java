/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Binita.salarycalculater;

import com.Binita.SalaryCalculator.controller.EmployeeController;
import com.Binita.salarycalculater.DAO.EmployeeDAO;
import com.Binita.salarycalculater.DAO.Impl.EmployeeDAOImpl;
import com.Binita.salarycalculater.entity.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Bini
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
           
            EmployeeDAO employeeDAO=new EmployeeDAOImpl();
            Scanner input=new Scanner(System.in);
            EmployeeController sc=new EmployeeController(input, employeeDAO);
            sc.process();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
