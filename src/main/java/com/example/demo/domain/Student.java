package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String session;

    private String department;

    private String roll;

    private String mobile;

    public Student() {
    }

    public Student(String name, String session, String department, String roll, String mobile) {
        this.name = name;
        this.session = session;
        this.department = department;
        this.roll = roll;
        this.mobile = mobile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", session='" + session + '\'' +
                ", department='" + department + '\'' +
                ", roll='" + roll + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
