/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.yamunacrm.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author uday
 */
public class DashboardAction extends ActionSupport {

    @Action(value="/homeUrl",results={@Result(location="/jsp/main/home.jsp",name="success")})
     public String showHomePage()
    {
        return SUCCESS;
    }


    @Action(value="/accountUrl",results={@Result(location="/jsp/accounts/account_homepage.jsp",name="success")})
     public String showAccountPage()
    {
        return SUCCESS;
    }

}
