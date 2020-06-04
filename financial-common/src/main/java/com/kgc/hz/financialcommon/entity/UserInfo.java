package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 员工表
 */
public class UserInfo implements Serializable {

    private Integer user_Id;

    private String userName;

    private String password;

    private String user_Phone;

    private String user_Number;

    private String user_Site;

    private Integer user_Sex;

    private Integer user_State;

    private Date entryDate;

    public Integer getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(Integer user_Id) {
        this.user_Id = user_Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_Phone() {
        return user_Phone;
    }

    public void setUser_Phone(String user_Phone) {
        this.user_Phone = user_Phone;
    }

    public String getUser_Number() {
        return user_Number;
    }

    public void setUser_Number(String user_Number) {
        this.user_Number = user_Number;
    }

    public String getUser_Site() {
        return user_Site;
    }

    public void setUser_Site(String user_Site) {
        this.user_Site = user_Site;
    }

    public Integer getUser_Sex() {
        return user_Sex;
    }

    public void setUser_Sex(Integer user_Sex) {
        this.user_Sex = user_Sex;
    }

    public Integer getUser_State() {
        return user_State;
    }

    public void setUser_State(Integer user_State) {
        this.user_State = user_State;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}
