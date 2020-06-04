package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;

/**
 * 部门表
 */
public class Department implements Serializable {

    private Integer department_Id;

    private String department_Name;

    private String depadescribe;

    public Integer getDepartment_Id() {
        return department_Id;
    }

    public void setDepartment_Id(Integer department_Id) {
        this.department_Id = department_Id;
    }

    public String getDepartment_Name() {
        return department_Name;
    }

    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }

    public String getDepadescribe() {
        return depadescribe;
    }

    public void setDepadescribe(String depadescribe) {
        this.depadescribe = depadescribe;
    }
}
