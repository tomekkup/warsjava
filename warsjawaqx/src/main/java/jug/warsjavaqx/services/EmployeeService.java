package jug.warsjavaqx.services;

import java.util.List;
import jug.warsjavaqx.model.DeptEmp;
import jug.warsjavaqx.model.Employee;

public interface EmployeeService {
    
    Employee getById(Integer id);
    List<Employee> getByLastname(String lastname);
    
    List<DeptEmp> getEmploymentHistory(Integer id);
    
    List<Employee> list(int from, int maxRows, String orderBy, boolean ascending);
    
    int getCount();
}
