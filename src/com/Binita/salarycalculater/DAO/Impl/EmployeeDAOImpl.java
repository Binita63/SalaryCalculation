/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.salarycalculater.DAO.Impl;

import com.Binita.salarycalculater.DAO.EmployeeDAO;
import com.Binita.salarycalculater.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bini
 */
public class EmployeeDAOImpl implements EmployeeDAO{
    Scanner input=new Scanner(System.in);
     List<Employee> employelist = new ArrayList<>();
    EmployeeDAO employeeDAO;

   

    @Override
    public boolean insert(Employee e) {
        return employelist.add(e);
   
    
    }

    @Override
    public List<Employee> getAll() {
       return employelist;
    }
    
    
}
