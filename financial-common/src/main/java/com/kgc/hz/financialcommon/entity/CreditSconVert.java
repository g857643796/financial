package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;

/**
 * 积分兑换表
 */
public class CreditSconVert implements Serializable {

    private Integer cv_Id;

    private String cv_Name;

    private String cv_Describe;

    private String cv_Picture;

    private Integer cv_Number;

    private String cv_Man;

    private Integer cv_Amount;

    public Integer getCv_Id() {
        return cv_Id;
    }

    public void setCv_Id(Integer cv_Id) {
        this.cv_Id = cv_Id;
    }

    public String getCv_Name() {
        return cv_Name;
    }

    public void setCv_Name(String cv_Name) {
        this.cv_Name = cv_Name;
    }

    public String getCv_Describe() {
        return cv_Describe;
    }

    public void setCv_Describe(String cv_Describe) {
        this.cv_Describe = cv_Describe;
    }

    public String getCv_Picture() {
        return cv_Picture;
    }

    public void setCv_Picture(String cv_Picture) {
        this.cv_Picture = cv_Picture;
    }

    public Integer getCv_Number() {
        return cv_Number;
    }

    public void setCv_Number(Integer cv_Number) {
        this.cv_Number = cv_Number;
    }

    public String getCv_Man() {
        return cv_Man;
    }

    public void setCv_Man(String cv_Man) {
        this.cv_Man = cv_Man;
    }

    public Integer getCv_Amount() {
        return cv_Amount;
    }

    public void setCv_Amount(Integer cv_Amount) {
        this.cv_Amount = cv_Amount;
    }
}
