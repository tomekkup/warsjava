/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jug.warsjavaqx.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonManagedReference;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

    @Id
    @Column(name="emp_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empNo;
    
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;
    
    @Column(name = "first_name", nullable = false, length = 14)
    private String firstName;
    
    @Column(name = "last_name", nullable = false, length = 16)
    private String lastName;
    
    @Column(name = "gender", nullable = false, length = 1)
    private String gender;
    
    @Column(name = "hire_date", nullable = false)
    private Date hireDate;
    
    @OneToMany(mappedBy="empNo",fetch= FetchType.EAGER)
    @JsonBackReference
    private Set<DeptEmp> deptEmpCollection;
    
    public Employee() {
        super();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public Set<DeptEmp> getDeptEmpCollection() {
        return deptEmpCollection;
    }

    public void setDeptEmpCollection(Set<DeptEmp> deptEmpCollection) {
        this.deptEmpCollection = deptEmpCollection;
    }
}
