package jug.warsjavaqx.services.impl;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import java.util.List;
import jug.warsjavaqx.model.DeptEmp;
import jug.warsjavaqx.model.Employee;
import jug.warsjavaqx.services.EmployeeService;
import org.springframework.stereotype.Component;

@Component("employeeService")
public class DefaultEmployeeService extends AbstractEbeanService implements EmployeeService {

    public DefaultEmployeeService() {
        super();
    }
    
    @Override
    public Employee getById(@JsonRpcParam("id") Integer id) {
        return ebeanServer.find(Employee.class, id);
    }

    @Override
    public List<Employee> getByLastname(@JsonRpcParam("lastname") String lastname) {
        return ebeanServer.find(Employee.class).where().eq("lastName", lastname).findList();
    }
    
    @Override
    public List<DeptEmp> getEmploymentHistory(Integer id) {
        return ebeanServer.find(DeptEmp.class).where().eq("emp_no", id).orderBy("fromDate desc").findList();
    }

    @Override
    public List<Employee> list(@JsonRpcParam("from") int from,@JsonRpcParam("maxRows") int maxRows,@JsonRpcParam("orderBy") String orderBy,@JsonRpcParam("ascending") boolean ascending) {
        return ebeanServer.find(Employee.class).orderBy(orderBy + " " + (ascending ? "asc" : "desc")).setFirstRow(from).setMaxRows(maxRows).findList();
    }
    
    @Override
    public int getCount() {
        return ebeanServer.find(Employee.class).findRowCount();
    }
}
