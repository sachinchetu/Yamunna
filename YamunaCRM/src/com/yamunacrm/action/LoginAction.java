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
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author udays
 */
@ParentPackage("struts-alternate")
@InterceptorRef("jsonValidationWorkflowStack")
@Validations(requiredStrings = {
    @RequiredStringValidator(fieldName = "userName", type = ValidatorType.FIELD, message = " is required"),
    @RequiredStringValidator(fieldName = "password", type = ValidatorType.FIELD, message = " is required"),

},
 emails={
    @EmailValidator(fieldName = "userName", type=ValidatorType.FIELD, message = " is invalid")})
public class LoginAction extends ActionSupport {

  private static final long serialVersionUID = 7968544374444173511L;
   private static final Logger log=Logger.getLogger(LoginAction.class);

  private String            userName;
  private String            password;

  @Action(value = "/logAction", results = {
    @Result(location = "/jsp/main/main.jsp", name = "success")
  })
  public String execute() throws Exception
  {
      log.info("User "+userName);
    

    return SUCCESS;
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