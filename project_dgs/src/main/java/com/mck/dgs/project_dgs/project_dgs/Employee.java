package com.mck.dgs.project_dgs.project_dgs;

public class Employee {
    private Integer id;
    private String job_title;
    private String employee_name;

    public Employee(Integer id, String jobTitle, String EName){
        this.id = id;
        this.employee_name= EName;
        this.job_title=jobTitle;

    }
    public Employee(String EName, Integer id){
        this.id = id;
        this.employee_name= EName;
       

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
