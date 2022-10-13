package com.mck.dgs.department_dgs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsEntityFetcher;
import com.netflix.graphql.dgs.DgsQuery;

@DgsComponent
public class DepartmentDataFetcher {

    private final List<Department> departmentData = Arrays.asList(
   new Department("Finance", 1 , 100),
   new Department("O2C", 2, 101),
   new Department("ERP Platform",3,103)
);

@DgsQuery
public List<Department> Departments(){
    return departmentData;
}

@DgsData(parentType = "Employee", field = "belongsIn")
public Department departmentFetcher(DgsDataFetchingEnvironment dataFetchingEnvironment)  {
    Employee emp = dataFetchingEnvironment.getSource();
    return departmentData.stream()
    .filter(d-> d.getemployeeId().equals(emp.getId())).findFirst().orElse(new Department("null", 0, 0));
}
@DgsData(parentType = "Department", field = "employees")
public Employee empFetcher(DgsDataFetchingEnvironment dataFetchingEnvironment)  {
    Department dept = dataFetchingEnvironment.getSource();
    return new Employee(dept.getEmployeeId(),null,null );
}

@DgsEntityFetcher(name = "Employee")
public Employee employee(Map<String, Object> values) {
   int empid=  Integer.parseInt((String) values.get("id"));
        return new Employee(  empid ,(String) values.get("job_title"),(String) values.get("employee_name"));
}
    
}
