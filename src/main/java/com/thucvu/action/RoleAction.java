package com.thucvu.action;

import com.thucvu.model.Role;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RoleAction extends DispatchAction {

    public ActionForward addRole(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Role role = (Role) form;
        role.setRoleName("ADMIN");
        return mapping.findForward("addRole");
    }

    public ActionForward deleteRole(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Role role = (Role) form;
        role.setRoleName("ADMIN");
        return mapping.findForward("deleteRole");
    }

    public ActionForward updateRole(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Role role = (Role) form;
        role.setRoleName("ADMIN");
        return mapping.findForward("updateUser");
    }

    public ActionForward viewRole(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        Role role = (Role) form;
        role.setRoleName(name);
        return mapping.findForward("viewRole");
    }
}
