package com.yamunacrm.util;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class HibernateUtil
{
	 	private static SessionFactory sessionFactory;
	    private static final ThreadLocal<Session> session = new ThreadLocal<Session>();
	    private HibernateUtil() {
	        /*
	         * default constructor is private so that no one
	         *can create an object of this class
	         * */
	    }

	    static {

	        try {
	            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

	        } catch (Exception e) {
	            e.printStackTrace();

	        }
	    }
	      public static Session getCurretSession() throws HibernateException {
	        Session currentSession = (Session) session.get();
	        if (currentSession == null) {
	            currentSession = sessionFactory.getCurrentSession();
	            session.set(currentSession);
	        }
	        return currentSession;
	    }

	  
	    public static void closeSession() throws HibernateException {
	        Session currentSession = (Session) session.get();
	        session.set(null);
	        if (currentSession != null) {
	            currentSession.flush();
	            currentSession.clear();
	            currentSession.close();
	        }
	    }
}
