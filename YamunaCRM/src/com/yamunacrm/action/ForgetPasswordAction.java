/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yamunacrm.action;

import com.opensymphony.xwork2.ActionSupport;
import com.yamunacrm.dao.UserDAO;
import com.yamunacrm.dao.daoimpl.UserDAOImpl;
import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author udays
 */
public class ForgetPasswordAction extends ActionSupport {

  private static final long serialVersionUID = 7968544374444173511L;
   private static final Logger log=Logger.getLogger(ForgetPasswordAction.class);
  private String            userName;
  private String              message;
  @Action(value = "/forgetPassword", results = {
    @Result(location = "/jsp/main/message.jsp", name = "success"),@Result(location="/jsp/main/message.jsp",name="error")
  })
    @Override
  public String execute() throws Exception
  {
      log.info("User "+userName);
    UserDAO userDao=new UserDAOImpl();
    if(!userDao.checkAvailbility(userName))
    {
       setMessage("User is not available.");
       return ERROR;
    }else{
        setMessage("Please contact your administrator to get the password.");
        return SUCCESS;
    }
  }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}