package com.yamunacrm.dao;



public interface UserDAO {

	boolean authentication(String userName,String password);
	boolean checkAvailbility(String userID);
}
