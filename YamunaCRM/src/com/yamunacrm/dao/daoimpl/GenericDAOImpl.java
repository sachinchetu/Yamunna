package com.yamunacrm.dao.daoimpl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import com.yamunacrm.dao.GenericDAO;
import com.yamunacrm.util.HibernateUtil;

public abstract class GenericDAOImpl<T, PK extends Serializable> implements GenericDAO<T, PK> {

	private Class<T> type;
	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	@SuppressWarnings("unchecked")
	public T findByID(PK id) {
		
		 return (T) HibernateUtil.getCurretSession().get(type, id);
	}
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return (List<T>)HibernateUtil.getCurretSession().createQuery("from "+type).list();
	}
	public boolean saveOrUpdate(T entity) {
		boolean successFlag=false;
		try
		{
			HibernateUtil.getCurretSession().save(entity);
			successFlag=true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return successFlag;

	}
	public boolean delete(T entity) {
		boolean successFlag=false;
		try
		{
			HibernateUtil.getCurretSession().delete(entity);
			successFlag=true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return successFlag;
	}
	@SuppressWarnings("unchecked")
	public boolean deleteById(PK entityId) {
		boolean successFlag=false;
		T type=null;
		try
		{
			type=(T) HibernateUtil.getCurretSession().get(this.type, entityId);
			if(type!=null)
			{
			HibernateUtil.getCurretSession().delete(type);
			}
			successFlag=true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return successFlag;
	}

	
	}
