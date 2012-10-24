package com.yamunacrm.dao.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.yamunacrm.dao.UserDAO;
import com.yamunacrm.entityBean.Users;
import com.yamunacrm.util.HibernateUtil;

public class UserDAOImpl extends GenericDAOImpl<Users, Integer> implements UserDAO{

    @Override
	public boolean authentication(String userName, String password) {
		boolean successFlag=false;
		Session session=null;
		Transaction transaction=null;
		try
		{
			session=HibernateUtil.getCurretSession();
			transaction=session.beginTransaction();
			Users users=(Users) session.getNamedQuery("Users.findByUserID").setString("userName", userName).setString("password", password).uniqueResult();
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

    @Override
	public boolean checkAvailbility(String userID) {
        boolean successFlag=false;
        Session session=null;
        Transaction transaction=null;
        try
        {
            session=HibernateUtil.getCurretSession();
            transaction=session.beginTransaction();
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
