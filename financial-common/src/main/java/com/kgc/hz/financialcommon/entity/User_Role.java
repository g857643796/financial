package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色表
 */
public class User_Role implements Serializable {

    private Integer ru_Id;

    private Integer user_Id;

    private String role_Id;

    private Date ru_CreateDate;

    private Date ru_ModifyCationDate;

    public Integer getRu_Id() {
        return ru_Id;
    }

    public void setRu_Id(Integer ru_Id) {
        this.ru_Id = ru_Id;
    }

    public Integer getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }

    public String getRole_Id() {
        return role_Id;
    }

    public void setRole_Id(String role_Id) {
        this.role_Id = role_Id;
    }

    public Date getRu_CreateDate() {
        return ru_CreateDate;
    }

    public void setRu_CreateDate(Date ru_CreateDate) {
        this.ru_CreateDate = ru_CreateDate;
    }

    public Date getRu_ModifyCationDate() {
        return ru_ModifyCationDate;
    }

    public void setRu_ModifyCationDate(Date ru_ModifyCationDate) {
        this.ru_ModifyCationDate = ru_ModifyCationDate;
    }
}
