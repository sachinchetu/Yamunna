package com.yamunacrm.dao.daoimpl;

import org.hibernate.Session;

import com.yamunacrm.dao.UserDAO;
import com.yamunacrm.entityBean.Users;
import com.yamunacrm.util.HibernateUtil;
import org.apache.log4j.Logger;

public class UserDAOImpl extends GenericDAOImpl<Users, Integer> implements UserDAO{
  private static final Logger log=Logger.getLogger(UserDetailsDAOImpl.class);

	public boolean authentication(String userName, String password) {
		boolean successFlag=false;
		Session session=null;
		try
		{
			session=HibernateUtil.getCurretSession();
			Users users=(Users) session.getNamedQuery("Users.findByUserID").setString("userName", userName).setString("password", password).uniqueResult();

                        if(users!=null && users.getUserName()!=null)
			{
                           log.info(users.getUserName());
				successFlag=true;
			}
			
			
		}catch (Exception e) {
                    System.out.println("PRINT :: "+e.getMessage());
			e.printStackTrace();
			
		}
		
		return successFlag;
	}
	
	public boolean checkAvailbility(String userID) {
		boolean successFlag=false;
		Session session=null;
		try
		{
			session=HibernateUtil.getCurretSession();
			Users users=(Users) session.getNamedQuery("Users.findByUserName").setString("userName", userID).uniqueResult();
			if(users!=null && users.getUserName()!=null)
			{
				successFlag=true;
			}
			
			
		}catch (Exception e) {
                    System.out.println("PRINT :: "+e.getMessage());
			e.printStackTrace();
			
		}
		
		return successFlag;
	}
}
