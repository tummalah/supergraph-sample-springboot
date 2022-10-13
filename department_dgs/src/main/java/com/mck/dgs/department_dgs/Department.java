package com.mck.dgs.department_dgs;

public class Department {
    private Integer id;
    private Integer employeeId;
    private String department_name;


    public Department(String department, Integer employeeId, Integer id){
        this.id = id;
        this.department_name= department;
        this.employeeId=employeeId;
        
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    

    public Integer getId() {
        return id;
    }

    public Integer getemployeeId() {
        return employeeId;
    }

    public String getDepartment_name() {
        return department_name;
    }

    

    
}
