/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jug.warsjavaqx.services;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import java.util.List;
import jug.warsjavaqx.model.Department;
import jug.warsjavaqx.model.DeptEmp;
import jug.warsjavaqx.model.Employee;

/**
 *
 * @author tomek
 */
public interface DepartmentService {

    Department getById(String id);

    List<Department> list(String orderBy, boolean ascending);

    List<DeptEmp> listEmployees(String depid, int from, int maxRows, String orderBy, boolean ascending);

    int getDepartmentsCount();
    
    int getEmployedCount(String id);
}
