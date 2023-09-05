package com.thucvu.action;

import com.thucvu.model.Group;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GroupAction extends MappingDispatchAction {

    public ActionForward addGroup(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Group group = (Group) form;
        group.setGroupName("Group Name");
        return mapping.findForward("addGroup");
    }

    public ActionForward updateGroup(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Group group = (Group) form;
        group.setGroupName("Group Name");
        return mapping.findForward("updateGroup");
    }

    public ActionForward viewGroup(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("groupName");
        Group group = (Group) form;
        group.setGroupName(name);
        return mapping.findForward("viewGroup");
    }

    public ActionForward deleteGroup(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Group group = (Group) form;
        group.setGroupName("Group Name");
        return mapping.findForward("deleteGroup");
    }

}
