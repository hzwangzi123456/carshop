package com.alibaba.edas.carshop.itemcenter.model;

import java.io.Serializable;

/**
 * @author
 */
public class Employee implements Serializable {
    /**
     * 河长姓名
     */
    private String name;

    /**
     * 河长账号
     */
    private String username;

    /**
     * 河长密码
     */
    private String password;

    /**
     * 河长工号
     */
    private int id;

    /**
     * 河长所属部门
     */
    private String department;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}