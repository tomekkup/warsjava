package jug.warsjavaqx.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
@Table(name = "departments")
public class Department implements Serializable {

    @Id()
    @Column(name="dept_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String deptNo;
    
    @Column(name = "dept_name", nullable = false, length = 40, unique = true)
    private String deptName;
    
    @JsonBackReference
    @OneToMany(mappedBy = "deptNo")
    private Set<DeptEmp> deptEmpCollection = new HashSet<DeptEmp>();

    public Department() {
        super();
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Set<DeptEmp> getDeptEmpCollection() {
        return this.deptEmpCollection;
    }

    public void setDeptEmpCollection(Set<DeptEmp> deptEmpCollection) {
        this.deptEmpCollection = deptEmpCollection;
    }
}
