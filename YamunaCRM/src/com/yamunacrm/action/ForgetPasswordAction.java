/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yamunacrm.action;

import com.opensymphony.xwork2.ActionSupport;
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
    @RequiredStringValidator(fieldName = "userName", type = ValidatorType.FIELD, message = " is required")
    }
)

public class ForgetPasswordAction extends ActionSupport {

  private static final long serialVersionUID = 7968544374444173511L;
   private static final Logger log=Logger.getLogger(ForgetPasswordAction.class);
  private String            userName;
  @Action(value = "/forgetPassword", results = {
    @Result(location = "/jsp/main/message.jsp", name = "success"),@Result(location="/jsp/main/message.jsp",name="error"),@Result(location="/index.jsp",name="input")
  })
    @Override
  public String execute() throws Exception
  {
      log.info("User "+userName);
    LoginService loginService=new LoginService();
    if(userName==null)
    {
    addFieldError(userName, "User Name required.");
    return ERROR;
    }
    if(!loginService.checkAvaility(userName))
    {
       addActionError("User is not available.");
       return ERROR;
    }else{
        addActionMessage("Please contact your administrator to get the password.");
        return SUCCESS;
    }
  }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}