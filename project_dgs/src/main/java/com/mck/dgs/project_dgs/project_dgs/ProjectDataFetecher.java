package com.mck.dgs.project_dgs.project_dgs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsEntityFetcher;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class ProjectDataFetecher {

    private List<Project> projects_data =  Arrays.asList(
        new Project (1001,"Cybersource" , 1 , 100  ),
        new Project (1002,"Regulatory" , 2 , 101  )
    );

@DgsQuery
public List<Project> Projects(){
    return projects_data;
}

@DgsData(parentType = "Employee", field = "workingInProject")
public Project projectFetcher(DgsDataFetchingEnvironment dataFetchingEnvironment)  {
    Employee emp = dataFetchingEnvironment.getSource();
    return projects_data.stream()
    .filter(p-> p.getEmployee_id().equals(emp.getId())).findFirst().orElse(new Project(0,"null",0,0));
}

@DgsEntityFetcher(name = "Employee")
public Employee employee(Map<String, Object> values) {
   int empid=  Integer.parseInt((String) values.get("id"));
        return new Employee(  empid ,(String) values.get("job_title"),(String) values.get("employee_name"));
}
    
}
