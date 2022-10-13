package com.mck.dgs.project_dgs.project_dgs;

public class Project {

    private Integer id;
    private String project_name;
    private Integer employee_id;
    private Integer department_id;

    public Project(Integer id, String ProjectName, Integer Eid, Integer Did){
        this.department_id=Did;
        this.employee_id=Eid;
        this.project_name=ProjectName;
        this.id=id;

    }

    public Integer getId() {
        return id;
    }

    public String getProject_name() {
        return project_name;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    
}
