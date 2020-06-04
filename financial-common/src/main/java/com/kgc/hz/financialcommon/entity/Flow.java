package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 审核流程表
 */
public class Flow implements Serializable {

    private Integer flow_Id;

    private Integer flow_Name;

    private Integer flow_Type;

    private Date flow_Time;

    private Integer flow_State;

    public Integer getFlow_Id() {
        return flow_Id;
    }

    public void setFlow_Id(Integer flow_Id) {
        this.flow_Id = flow_Id;
    }

    public Integer getFlow_Name() {
        return flow_Name;
    }

    public void setFlow_Name(Integer flow_Name) {
        this.flow_Name = flow_Name;
    }

    public Integer getFlow_Type() {
        return flow_Type;
    }

    public void setFlow_Type(Integer flow_Type) {
        this.flow_Type = flow_Type;
    }

    public Date getFlow_Time() {
        return flow_Time;
    }

    public void setFlow_Time(Date flow_Time) {
        this.flow_Time = flow_Time;
    }

    public Integer getFlow_State() {
        return flow_State;
    }

    public void setFlow_State(Integer flow_State) {
        this.flow_State = flow_State;
    }
}
