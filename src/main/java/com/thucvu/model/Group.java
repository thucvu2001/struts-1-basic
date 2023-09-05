package com.thucvu.model;

import org.apache.struts.action.ActionForm;

public class Group extends ActionForm {
    private String groupName;

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return this.groupName;
    }
}
