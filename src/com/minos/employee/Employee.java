package com.minos.employee;

public class Employee {
    private Integer empNo;
    private String eName;
    private String department;
    private String job;
    private Float salary;

    public Employee() {
    }

    public Employee(Integer empNo, String eName, String department, String job, Float salary) {
        this.empNo = empNo;
        this.eName = eName;
        this.department = department;
        this.job = job;
        this.salary = salary;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
