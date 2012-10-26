package jug.warsjavaqx.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class Evaluation implements Serializable {

    @Id
    private Integer id;
    
    @Column(nullable = false)
    private String employeeName;
    
    @Column(nullable = false)
    private Long employeeId;
    
    @Column(nullable = false)
    private int targetA;
    
    @Column(nullable = false)
    private int targetB;
    
    @Column(nullable = false)
    private int targetC;
    
    @Column(nullable = false)
    private int year;
    
    @Column(nullable = false)
    private Date creationDate;
    
    @Column(nullable = false)
    private boolean accepted;
    
    public Evaluation() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public int getTargetA() {
        return targetA;
    }

    public void setTargetA(int targetA) {
        this.targetA = targetA;
    }

    public int getTargetB() {
        return targetB;
    }

    public void setTargetB(int targetB) {
        this.targetB = targetB;
    }

    public int getTargetC() {
        return targetC;
    }

    public void setTargetC(int targetC) {
        this.targetC = targetC;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}
