package com.yamunacrm.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.yamunacrm.util.HibernateUtil;

public class HibernateSessionInterceptor implements Interceptor {

    private static final long serialVersionUID = 1L;

    public void destroy() {


    }

    public void init() {


    }

    public String intercept(ActionInvocation invocation) throws Exception {
        String result="";
        try
        {
            result = invocation.invoke();
         
            HibernateUtil.closeSession();


        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
        }
}