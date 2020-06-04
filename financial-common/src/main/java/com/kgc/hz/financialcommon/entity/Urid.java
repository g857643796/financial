package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色权限部门对照表
 */
public class Urid implements Serializable {

    private Integer uir_Id;

    private String uer_Id;

    private Integer auth_Id;

    private Integer dep_Id;

    private Integer role_Id;

    private Integer menu_Id;

    private Date urCreate_Date;

    private Date urUpdate_Date;

    public Integer getUir_Id() {
        return uir_Id;
    }

    public void setUir_Id(Integer uir_Id) {
        this.uir_Id = uir_Id;
    }

    public String getUer_Id() {
        return uer_Id;
    }

    public void setUer_Id(String uer_Id) {
        this.uer_Id = uer_Id;
    }

    public Integer getAuth_Id() {
        return auth_Id;
    }

    public void setAuth_Id(Integer auth_Id) {
        this.auth_Id = auth_Id;
    }

    public Integer getDep_Id() {
        return dep_Id;
    }

    public void setDep_Id(Integer dep_Id) {
        this.dep_Id = dep_Id;
    }

    public Integer getRole_Id() {
        return role_Id;
    }

    public void setRole_Id(Integer role_Id) {
        this.role_Id = role_Id;
    }

    public Integer getMenu_Id() {
        return menu_Id;
    }

    public void setMenu_Id(Integer menu_Id) {
        this.menu_Id = menu_Id;
    }

    public Date getUrCreate_Date() {
        return urCreate_Date;
    }

    public void setUrCreate_Date(Date urCreate_Date) {
        this.urCreate_Date = urCreate_Date;
    }

    public Date getUrUpdate_Date() {
        return urUpdate_Date;
    }

    public void setUrUpdate_Date(Date urUpdate_Date) {
        this.urUpdate_Date = urUpdate_Date;
    }
}
