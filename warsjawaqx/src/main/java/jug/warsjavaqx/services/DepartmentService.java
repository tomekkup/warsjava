package jug.warsjavaqx.services;

import java.util.List;
import jug.warsjavaqx.model.Department;
import jug.warsjavaqx.model.DeptEmp;

public interface DepartmentService {

    Department getById(String id);

    List<Department> list(String orderBy, boolean ascending);

    List<DeptEmp> listEmployees(String depid, int from, int maxRows, String orderBy, boolean ascending);

    int getDepartmentsCount();
    
    int getEmployedCount(String id);
}
