package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;

/**
 * 理财产品表
 */
public class ManageProduct implements Serializable {

    private Integer product_Id;

    private String product_Name;

    private Integer product_Company;

    private Double product_Rate;

    private Double product_Money;

    private Double product_Earnings;

    private String product_Picture;

    private String product_Explain;

    private Integer product_Assess;

    public Integer getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(Integer product_Id) {
        this.product_Id = product_Id;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public Integer getProduct_Company() {
        return product_Company;
    }

    public void setProduct_Company(Integer product_Company) {
        this.product_Company = product_Company;
    }

    public Double getProduct_Rate() {
        return product_Rate;
    }

    public void setProduct_Rate(Double product_Rate) {
        this.product_Rate = product_Rate;
    }

    public Double getProduct_Money() {
        return product_Money;
    }

    public void setProduct_Money(Double product_Money) {
        this.product_Money = product_Money;
    }

    public Double getProduct_Earnings() {
        return product_Earnings;
    }

    public void setProduct_Earnings(Double product_Earnings) {
        this.product_Earnings = product_Earnings;
    }

    public String getProduct_Picture() {
        return product_Picture;
    }

    public void setProduct_Picture(String product_Picture) {
        this.product_Picture = product_Picture;
    }

    public String getProduct_Explain() {
        return product_Explain;
    }

    public void setProduct_Explain(String product_Explain) {
        this.product_Explain = product_Explain;
    }

    public Integer getProduct_Assess() {
        return product_Assess;
    }

    public void setProduct_Assess(Integer product_Assess) {
        this.product_Assess = product_Assess;
    }
}
