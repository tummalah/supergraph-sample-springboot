package com.mck.dgs.employee_dgs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsEntityFetcher;
//import com.netflix.graphql.dgs.DgsEntityFetcher;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class EmployeeDataFetcher {

private final List<Employee> employeeData = Arrays.asList(
    new Employee( "Finance Architect", "Krishna", 1),
    new Employee( "O2C Architect", "Vijay", 2),
    new Employee( "ERP Platforms Manager", "Ravi", 3)

);
    
@DgsQuery
public List<Employee> Employees(){
    return employeeData;
}

@DgsEntityFetcher(name = "Employee")
public Employee employee(Map<String, Object> values) {
    Employee temp = new Employee( "none", "none", 0);
    int empid=  Integer.parseInt((String) values.get("id"));
    // for (Employee emp : employeeData){
    //     if (emp.getId().equals(empl.getId())){

    //     temp= emp;
              
    //     } 
    //  }
   return employeeData.stream().filter(emp-> emp.getId().equals(empid)).findFirst().orElse(temp);
   
}
}
