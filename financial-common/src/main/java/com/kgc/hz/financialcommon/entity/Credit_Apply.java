package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 信用卡申请记录表
 */
public class Credit_Apply implements Serializable {

    private Integer ca_Id;

    private Integer ca_Order;

    private Date ca_State;

    private Date ca_Time;

    private Integer ca_Type;

    private Integer ca_Client;

    public Integer getCa_Id() {
        return ca_Id;
    }

    public void setCa_Id(Integer ca_Id) {
        this.ca_Id = ca_Id;
    }

    public Integer getCa_Order() {
        return ca_Order;
    }

    public void setCa_Order(Integer ca_Order) {
        this.ca_Order = ca_Order;
    }

    public Date getCa_State() {
        return ca_State;
    }

    public void setCa_State(Date ca_State) {
        this.ca_State = ca_State;
    }

    public Date getCa_Time() {
        return ca_Time;
    }

    public void setCa_Time(Date ca_Time) {
        this.ca_Time = ca_Time;
    }

    public Integer getCa_Type() {
        return ca_Type;
    }

    public void setCa_Type(Integer ca_Type) {
        this.ca_Type = ca_Type;
    }

    public Integer getCa_Client() {
        return ca_Client;
    }

    public void setCa_Client(Integer ca_Client) {
        this.ca_Client = ca_Client;
    }
}
