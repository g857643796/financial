package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 转账流水表
 */
public class ClientBill implements Serializable {

    private String bill_Id;

    private Date bill_Date;

    private Double bill_Int;

    private Double bill_Out;

    private String bill_Describe;

    public String getBill_Id() {
        return bill_Id;
    }

    public void setBill_Id(String bill_Id) {
        this.bill_Id = bill_Id;
    }

    public Date getBill_Date() {
        return bill_Date;
    }

    public void setBill_Date(Date bill_Date) {
        this.bill_Date = bill_Date;
    }

    public Double getBill_Int() {
        return bill_Int;
    }

    public void setBill_Int(Double bill_Int) {
        this.bill_Int = bill_Int;
    }

    public Double getBill_Out() {
        return bill_Out;
    }

    public void setBill_Out(Double bill_Out) {
        this.bill_Out = bill_Out;
    }

    public String getBill_Describe() {
        return bill_Describe;
    }

    public void setBill_Describe(String bill_Describe) {
        this.bill_Describe = bill_Describe;
    }
}
