package com.yamunacrm.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T, PK extends Serializable> {
	T findByID(PK id );
    List<T> findAll();
    boolean saveOrUpdate(T entity );
	boolean delete(T entity );
	boolean deleteById(PK entityId );
	   }

