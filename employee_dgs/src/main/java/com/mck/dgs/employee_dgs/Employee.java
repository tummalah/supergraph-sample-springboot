package com.mck.dgs.employee_dgs;

public class Employee {
    private Integer id;
    private String job_title;
    private String employee_name;

    public Employee(String jobTitle, String EName, Integer id){
        this.id = id;
        this.employee_name= EName;
        this.job_title=jobTitle;

    }

    public Integer getId() {
        return id;
    }

    public String getJob_title() {
        return job_title;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    
}
