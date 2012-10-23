/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yamunacrm.service;

import com.yamunacrm.dao.UserDAO;
import com.yamunacrm.dao.daoimpl.UserDAOImpl;
import org.apache.log4j.Logger;

/**
 *
 * @author udays
 */
public class AuthenticationService {
    private static final Logger log=Logger.getLogger(AuthenticationService.class);
    private UserDAO userDAO;

    public AuthenticationService() {
        userDAO=new UserDAOImpl();
    }
    
    
    
    
    public boolean authenticateUser(String userName,String password)
    {
       boolean flag;
       flag= userDAO.authentication(userName, password);
        
        return flag;
    }



}
