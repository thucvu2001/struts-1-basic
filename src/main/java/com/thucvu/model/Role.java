package com.thucvu.model;

import org.apache.struts.action.ActionForm;

public class Role extends ActionForm {
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
