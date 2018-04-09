package zb.com.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Repository;

import zb.com.dao.BaseDao;



@Repository(value="baseDao")
public  class BaseDaoImpl<T> implements BaseDao<T> {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	/*
	 * private Class<T> clazz;
	 * 
	 * 
	 * public BaseDaoImpl() { //���ڻ�ȡ��ǰ�����ʵ����(��ȻDao��Ϊ��ʵ��,��clazz�����ȫ����)
	 * ParameterizedType pt = (ParameterizedType)
	 * this.getClass().getGenericSuperclass(); // ��ȡ��ǰnew�Ķ���� ���͵ĸ��� ����
	 * this.clazz = (Class<T>) pt.getActualTypeArguments()[0]; // ��ȡ��һ�����Ͳ�������ʵ����
	 * 
	 * }
	 */

	/**
	 * 
	 * @Title: getCurrSession
	 * @Description: TODO(��õ�ǰSession)
	 * @param @return
	 * @return Session
	 * @throws
	 */
	protected Session getCurrSession() {
		return sessionFactory.getCurrentSession();
	}

	/*
	 * (�� Javadoc) <p>Title: findById</p> <p>Description: ����ID��ȡʵ��</p>
	 * 
	 * @param id
	 * 
	 * @return
	 * 
	 * @see qczc.com.dao.BaseDao#findById(int)
	 */
	@SuppressWarnings("unchecked")
	public T findById(Class calss, int id) {
		return (T) getCurrSession().get(calss.getClass(), id);

	}

	/*
	 * (�� Javadoc) <p>Title: findByPageHql</p> <p>Description:hql��ҳ��ѯ���� </p>
	 * 
	 * @param hql
	 * 
	 * @param objArray ����
	 * 
	 * @param nowPage
	 * 
	 * @param size
	 * 
	 * @return
	 * 
	 * @see qczc.com.dao.BaseDao#findByPageHql(java.lang.String,
	 * java.lang.Object[], int, int)
	 */
	public List<?> findByPageHql( final String hql, final List<Object> objArray,
			final int nowPage,  final int size) {
		Query query = getCurrSession().createQuery(hql);
		for (int i = 0; i < objArray.size(); ++i) {
			query.setParameter(i, objArray.get(i));
		}
		query.setFirstResult((nowPage-1)*size);
		query.setMaxResults(size);
	
		return query.list();

	}

	/*
	 * (�� Javadoc) <p>Title: queryListByHql</p> <p>Description: HQL��������ѯ����</p>
	 * 
	 * @param hql
	 * 
	 * @param objArray
	 * 
	 * @return
	 * 
	 * @see qczc.com.dao.BaseDao#queryListByHql(java.lang.String,
	 * java.lang.Object[])
	 */
	public List<?> queryListByHql(String hql, List<Object> objArray) {
		Query query = getCurrSession().createQuery(hql);
		for (int i = 0; i < objArray.size(); ++i) {
			query.setParameter(i, objArray.get(i));
		}
		return query.list();

	}

	/*
	 * 
	 * <p>Title: executeHql</p> <p>Description: HQL��������ɾ��</p>
	 * 
	 * @param hql
	 * 
	 * @param params
	 * 
	 * @return
	 * 
	 * @see qczc.com.dao.BaseDao#executeHql(java.lang.String,
	 * java.lang.Object[])
	 */
	public int executeHql(String hql, List<Object> params) {
		Query query = getCurrSession().createQuery(hql);
		if (null != params) {
			for (int i = 0; i < params.size(); i++) {
				query.setParameter(i, params.get(i));
			}
		}

		return query.executeUpdate();

	}

	/*
	 * HQL��ѯһ������ <p>Title: getObjectHql</p> <p>Description: </p>
	 * 
	 * @param hql
	 * 
	 * @param objArray
	 * 
	 * @return
	 * 
	 * @see qczc.com.dao.BaseDao#getObjectHql(java.lang.String,
	 * java.lang.Object[])
	 */
	public Object getObjectHql(String hql, List<Object> objArray) {
		Query query = getCurrSession().createQuery(hql);
		if (null != objArray) {
			for (int i = 0; i < objArray.size(); ++i) {
				query.setParameter(i, objArray.get(i));
			}
		}
		return query.uniqueResult();

	}

	/*
	 * (�� Javadoc) <p>Title: getCountHql</p> <p>Description:��ѯ�ܼ�¼�� </p>
	 * 
	 * @param hql
	 * 
	 * @param objArray
	 * 
	 * @return
	 * 
	 * @see qczc.com.dao.BaseDao#getCountHql(java.lang.String,
	 * java.lang.Object[])
	 */
	public Long getCountHql(String hql, List<Object> objArray) {
		Query query = getCurrSession().createQuery(hql);
		for (int i = 0; i < objArray.size(); ++i) {
			query.setParameter(i, objArray.get(i));
		}
		return (Long) query.uniqueResult();

	}

	/*
	 * ��ɾ�ģ�ִ��ԭ��̬��SQL��� <p>Title: executeSql</p> <p>Description:��ɾ�ģ�ִ��ԭ��̬��SQL���
	 * </p>
	 * 
	 * @param sql
	 * 
	 * @param params
	 * 
	 * @return
	 * 
	 * @see qczc.com.dao.BaseDao#executeSql(java.lang.String,
	 * java.lang.Object[])
	 */
	public int executeSql(String sql, List<Object> params) {
		Query query = getCurrSession().createSQLQuery(sql);
		if (null != params) {
			for (int i = 0; i < params.size(); i++) {
				query.setParameter(i, params.get(i));
			}
		}
		return query.executeUpdate();
	}

	/*
	 * ԭ��̬����SQL��ѯ���� <p>Title: queryListBySql</p> <p>Description: ԭ��̬����SQL��ѯ����
	 * </p>
	 * 
	 * @param sql
	 * 
	 * @param params
	 * 
	 * @return
	 * 
	 * @see qczc.com.dao.BaseDao#queryListBySql(java.lang.String,
	 * java.lang.Object[])
	 */
	public List<?> queryListBySql(String sql, List<Object> params) {

		Query query = getCurrSession().createSQLQuery(sql);
		if (params != null) {
			for (int i = 0; i < params.size(); i++) {
				query.setParameter(i, params.get(i));
			}
		}
		return query.list();

	}

	/**
	 * 
	 * @Title: saveEntity
	 * @Description: TODO(����ʵ��)
	 * @param @param entity
	 * @param @return �趨�ļ�
	 * @return int ��������ID
	 * @throws
	 */
	public int saveEntity(T entity) {
		Session session = getCurrSession();
		int id = (Integer) session.save(entity);
		session.flush();
		return id;
	}

	public void updateEntity(T entity) {
		Session session = getCurrSession();
		session.update(entity);
		//session.flush();
		
	}
}