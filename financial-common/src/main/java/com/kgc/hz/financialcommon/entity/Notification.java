package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;

/**
 * 消息推送表
 */
public class Notification implements Serializable {

    private Integer ntf_Id;

    private String ntf_Name;

    private String ntf_Content;

    private String ntf_Describe;

    public Integer getNtf_Id() {
        return ntf_Id;
    }

    public void setNtf_Id(Integer ntf_Id) {
        this.ntf_Id = ntf_Id;
    }

    public String getNtf_Name() {
        return ntf_Name;
    }

    public void setNtf_Name(String ntf_Name) {
        this.ntf_Name = ntf_Name;
    }

    public String getNtf_Content() {
        return ntf_Content;
    }

    public void setNtf_Content(String ntf_Content) {
        this.ntf_Content = ntf_Content;
    }

    public String getNtf_Describe() {
        return ntf_Describe;
    }

    public void setNtf_Describe(String ntf_Describe) {
        this.ntf_Describe = ntf_Describe;
    }
}
