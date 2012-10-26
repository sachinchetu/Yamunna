package com.yamunacrm.dao.daoimpl;


import com.yamunacrm.dao.UserDetailsDAO;
import com.yamunacrm.entityBean.Userdetails;

public class UserDetailsDAOImpl extends GenericDAOImpl<Userdetails, Integer> implements UserDetailsDAO {

    public boolean signUp(Userdetails userdetails) {
        boolean successFlag = false;
        try {
            successFlag = saveOrUpdate(userdetails);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return successFlag;
    }
}
