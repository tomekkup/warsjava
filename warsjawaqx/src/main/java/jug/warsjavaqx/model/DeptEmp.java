package jug.warsjavaqx.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name = "dept_emp")
public class DeptEmp implements Serializable {

    @JsonIgnore
    @EmbeddedId
    private DeptEmpPK pk;
    
    @Column(name = "from_date")
    private Date fromDate;
    
    @Column(name = "to_date")
    private Date toDate;
    
    @JsonManagedReference
    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn(name = "emp_no", insertable = false, updatable = false)
    private Employee empNo;
    
    @ManyToOne
    @JoinColumn(name = "dept_no", insertable = false, updatable = false)
    @JsonManagedReference
    private Department deptNo;
    
    public DeptEmp() {
        super();
    }

    public DeptEmpPK getPk() {
        return this.pk;
    }

    public void setPk(DeptEmpPK pk) {
        this.pk = pk;
    }

    public Date getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return this.toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Employee getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(Employee empNo) {
        this.empNo = empNo;
    }

    public Department getDeptNo() {
        return this.deptNo;
    }

    public void setDeptNo(Department deptNo) {
        this.deptNo = deptNo;
    }
}
