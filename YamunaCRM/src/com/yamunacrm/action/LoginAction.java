/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yamunacrm.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.yamunacrm.service.LoginService;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author udays
 */
@ParentPackage("struts-alternate")
@InterceptorRefs({
    @InterceptorRef("jsonValidationWorkflowStack"),
    @InterceptorRef("closeHibernateInterceptor")
})

@Validations(requiredStrings = {
    @RequiredStringValidator(fieldName = "userName", type = ValidatorType.FIELD, message = " is required"),
    @RequiredStringValidator(fieldName = "password", type = ValidatorType.FIELD, message = " is required")}
)
public class LoginAction extends ActionSupport {

    private static final long serialVersionUID = 7968544374444173511L;
    private static final Logger log = Logger.getLogger(LoginAction.class);
    private String userName;
    private String password;

    @Action(value = "/logAction", results = {
        @Result(location = "/jsp/main/main.jsp", name = "success"),@Result(location="/index.jsp",name="error")
    })
    public String execute() throws Exception {
        log.info("User " + userName);
        boolean flag = false;
        LoginService service = new LoginService();
        flag = service.authenticateUser(userName, password);
        if (flag) {
            return SUCCESS;
        } else {
            addActionError("Invalid User Name or Password.");
            return ERROR;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}