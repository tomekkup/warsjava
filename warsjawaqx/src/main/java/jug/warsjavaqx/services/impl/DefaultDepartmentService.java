package jug.warsjavaqx.services.impl;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import java.util.List;
import jug.warsjavaqx.model.Department;
import jug.warsjavaqx.model.DeptEmp;
import jug.warsjavaqx.model.Employee;
import jug.warsjavaqx.services.DepartmentService;
import jug.warsjavaqx.services.EmployeeService;
import org.springframework.stereotype.Component;

/**
 *
 * @author tomek
 */
@Component("departmentService")
public class DefaultDepartmentService extends AbstractEbeanService implements DepartmentService {

    public DefaultDepartmentService() {
        super();
    }

    @Override
    public Department getById(@JsonRpcParam("id") String id) {
        return ebeanServer.find(Department.class, id);
    }

    @Override
    public List<Department> list(@JsonRpcParam("orderBy") String orderBy, @JsonRpcParam("ascending") boolean ascending) {
        return ebeanServer.find(Department.class).orderBy(orderBy +" " + (ascending ? "asc" : "desc")).findList();
    }
    
    @Override
    public List<DeptEmp> listEmployees(@JsonRpcParam("id") String id, @JsonRpcParam("from") int from, @JsonRpcParam("maxRows") int maxRows,@JsonRpcParam("orderBy") String orderBy, @JsonRpcParam("ascending") boolean ascending) {
        return ebeanServer.find(DeptEmp.class).orderBy("empNo." + orderBy + " " + (ascending ? "asc" : "desc")).setFirstRow(from).setMaxRows(maxRows).where().eq("dept_no", id).findList();
    }
    
    @Override
    public int getEmployedCount(@JsonRpcParam("id") String id) {
        return ebeanServer.find(DeptEmp.class).where().eq("dept_no", id).findRowCount();
    }
    
    @Override
    public int getDepartmentsCount() {
        return ebeanServer.find(Department.class).findRowCount();
    }
}
