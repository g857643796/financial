package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 借贷表
 */
public class Debit implements Serializable {

    private Integer debit_Id;

    private String debit_Type;

    private Integer debit_Way;

    private Double debit_Money;

    private Double debit_Payment;

    private Double repaymentMoney;

    private Double debit_Rate;

    private Date debit_BorrowTime;

    private Date debit_DueTime;

    private Integer debit_PayTime;

    public Integer getDebit_Id() {
        return debit_Id;
    }

    public void setDebit_Id(Integer debit_Id) {
        this.debit_Id = debit_Id;
    }

    public String getDebit_Type() {
        return debit_Type;
    }

    public void setDebit_Type(String debit_Type) {
        this.debit_Type = debit_Type;
    }

    public Integer getDebit_Way() {
        return debit_Way;
    }

    public void setDebit_Way(Integer debit_Way) {
        this.debit_Way = debit_Way;
    }

    public Double getDebit_Money() {
        return debit_Money;
    }

    public void setDebit_Money(Double debit_Money) {
        this.debit_Money = debit_Money;
    }

    public Double getDebit_Payment() {
        return debit_Payment;
    }

    public void setDebit_Payment(Double debit_Payment) {
        this.debit_Payment = debit_Payment;
    }

    public Double getRepaymentMoney() {
        return repaymentMoney;
    }

    public void setRepaymentMoney(Double repaymentMoney) {
        this.repaymentMoney = repaymentMoney;
    }

    public Double getDebit_Rate() {
        return debit_Rate;
    }

    public void setDebit_Rate(Double debit_Rate) {
        this.debit_Rate = debit_Rate;
    }

    public Date getDebit_BorrowTime() {
        return debit_BorrowTime;
    }

    public void setDebit_BorrowTime(Date debit_BorrowTime) {
        this.debit_BorrowTime = debit_BorrowTime;
    }

    public Date getDebit_DueTime() {
        return debit_DueTime;
    }

    public void setDebit_DueTime(Date debit_DueTime) {
        this.debit_DueTime = debit_DueTime;
    }

    public Integer getDebit_PayTime() {
        return debit_PayTime;
    }

    public void setDebit_PayTime(Integer debit_PayTime) {
        this.debit_PayTime = debit_PayTime;
    }
}
