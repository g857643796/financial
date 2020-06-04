package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;

/**
 * 客户信息表
 */
public class ClientMassage implements Serializable {

    private Integer client_Id;

    private String client_UserName;

    private String client_Sex;

    private String client_Phone;

    private String client_Number;

    private String client_Age;

    private String client_Address;

    public Integer getClient_Id() {
        return client_Id;
    }

    public void setClient_Id(Integer client_Id) {
        this.client_Id = client_Id;
    }

    public String getClient_UserName() {
        return client_UserName;
    }

    public void setClient_UserName(String client_UserName) {
        this.client_UserName = client_UserName;
    }

    public String getClient_Sex() {
        return client_Sex;
    }

    public void setClient_Sex(String client_Sex) {
        this.client_Sex = client_Sex;
    }

    public String getClient_Phone() {
        return client_Phone;
    }

    public void setClient_Phone(String client_Phone) {
        this.client_Phone = client_Phone;
    }

    public String getClient_Number() {
        return client_Number;
    }

    public void setClient_Number(String client_Number) {
        this.client_Number = client_Number;
    }

    public String getClient_Age() {
        return client_Age;
    }

    public void setClient_Age(String client_Age) {
        this.client_Age = client_Age;
    }

    public String getClient_Address() {
        return client_Address;
    }

    public void setClient_Address(String client_Address) {
        this.client_Address = client_Address;
    }
}
