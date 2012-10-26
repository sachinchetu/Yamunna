/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yamunacrm.service;

import com.yamunacrm.dao.UserDAO;
import com.yamunacrm.dao.UserDetailsDAO;
import com.yamunacrm.dao.daoimpl.RoleDAOImpl;
import com.yamunacrm.dao.daoimpl.UserDAOImpl;
import com.yamunacrm.dao.daoimpl.UserDetailsDAOImpl;
import com.yamunacrm.dto.SignUpDTO;
import com.yamunacrm.entityBean.Userdetails;
import com.yamunacrm.entityBean.Users;
import java.util.Date;
import org.apache.log4j.Logger;

/**
 *
 * @author uday
 */
public class SignUpService {

    private UserDAOImpl userDao;
    private UserDetailsDAO userDetailDao;
    private static final Logger log = Logger.getLogger(SignUpService.class);

    public SignUpService() {
        userDao = new UserDAOImpl();
        userDetailDao = new UserDetailsDAOImpl();
    }

    public boolean userSignUp(SignUpDTO signUpDTO) throws Exception {
        log.info("Entering userSignUp()");
        boolean flag=false;
        Userdetails userDetails = new Userdetails();
        Users user = new Users();
        user.setUserName(signUpDTO.getUserName());
        user.setRoleId(new RoleDAOImpl().findByID(signUpDTO.getRoleId()));
        user.setCreatedOn(new Date());
        user.setModifiedOn(new Date());
        user.setIsActive('Y');
        user.setPassword(signUpDTO.getPassword());
        user.setMaxAttempt("5");

        userDetails.setUserId(user);
        userDetails.setEmployeeCode(signUpDTO.getEmployeeCode());
        userDetails.setFirstName(signUpDTO.getFirstName());
        userDetails.setLastName(signUpDTO.getLastName());
        userDetails.setFatherName(signUpDTO.getFatherName());
        userDetails.setAddress(signUpDTO.getAddress());
        userDetails.setPanNo(signUpDTO.getPanNo());
        userDetails.setMobileNo(signUpDTO.getMobileNo());
        userDetails.setOfficialMobileNo(signUpDTO.getOfficialMobileNo());
        userDetails.setPersonalMailId(signUpDTO.getEmail());
        userDetails.setOfficialMailId(signUpDTO.getOfficialEmail());
        userDetails.setReportTo(userDao.findByID(signUpDTO.getReportTo()));
        userDetails.setSupervisor(userDao.findByID(signUpDTO.getSupervisor()));
        userDetails.setCreatedOn(new Date());
        userDetails.setModifiedOn(new Date());

       flag= userDetailDao.signUp(userDetails);
        return flag;
    }
}
