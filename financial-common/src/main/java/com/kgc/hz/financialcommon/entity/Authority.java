package com.kgc.hz.financialcommon.entity;

import java.io.Serializable;

/**
 * 权限表
 */

public class Authority implements Serializable {

    private Integer right_AuthId;

    private String right_RoleId;

    private String right_AuthorityLevel;

    public Integer getRight_AuthId() {
        return right_AuthId;
    }

    public void setRight_AuthId(Integer right_AuthId) {
        this.right_AuthId = right_AuthId;
    }

    public String getRight_RoleId() {
        return right_RoleId;
    }

    public void setRight_RoleId(String right_RoleId) {
        this.right_RoleId = right_RoleId;
    }

    public String getRight_AuthorityLevel() {
        return right_AuthorityLevel;
    }

    public void setRight_AuthorityLevel(String right_AuthorityLevel) {
        this.right_AuthorityLevel = right_AuthorityLevel;
    }
}
