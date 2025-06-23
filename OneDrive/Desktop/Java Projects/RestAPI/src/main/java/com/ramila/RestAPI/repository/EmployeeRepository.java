package com.ramila.RestAPI.repository;

import com.ramila.RestAPI.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    List<Employee> employees = new ArrayList<>();

    public String addEmployee(Employee employee) {
        employees.add(employee);
        return "Employee added";
    }

    public List getEmployee(){

    }
}
