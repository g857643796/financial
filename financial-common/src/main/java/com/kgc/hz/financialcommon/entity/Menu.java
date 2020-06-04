package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;


/**
 * 菜单表
 */
public class Menu implements Serializable {

    private Integer menu_Id;

    private String menu_Name;

    private String menu_Describe;

    public Integer getMenu_Id() {
        return menu_Id;
    }

    public void setMenu_Id(Integer menu_Id) {
        this.menu_Id = menu_Id;
    }

    public String getMenu_Name() {
        return menu_Name;
    }

    public void setMenu_Name(String menu_Name) {
        this.menu_Name = menu_Name;
    }

    public String getMenu_Describe() {
        return menu_Describe;
    }

    public void setMenu_Describe(String menu_Describe) {
        this.menu_Describe = menu_Describe;
    }
}
