/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Binita.salarycalculater.DAO;

import com.Binita.salarycalculater.entity.Employee;
import java.util.List;

/**
 *
 * @author Bini
 */
public interface EmployeeDAO {
  
    boolean insert (Employee e);
     List <Employee> getAll ();
}
