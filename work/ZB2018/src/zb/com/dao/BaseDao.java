package zb.com.dao;

import java.util.List;

/***
 * 数据操作接口
 * @author XW
 *
 */
public interface BaseDao<T> {
	
	/**
	 * 
	 * @Title: findById
	 * @Description: TODO(根据ID查询对象)
	 * @param @param calss
	 * @param @param id
	 * @param @return 设定文件
	 * @return T 返回类型
	 * @throws
	 */
	public T findById(Class<?> calss, int id);

	/***
	 * 
	 * @Title: findByPageHql
	 * @Description: TODO(分页查询对象集合)
	 * @param @param hql
	 * @param @param values参数
	 * @param @param nowPage当前页
	 * @param @param size 每页显示条数
	 * @param @return 设定文件
	 * @return List<?> 返回类型
	 * @throws
	 */
	public List<?> findByPageHql(String hql, List<Object> values, int nowPage,
			int size);

	/**
	 * 获取实体集合: 根据HQL + 参数
	 * 
	 * @param hql
	 * @param ob
	 * @return
	 */
	public List<?> queryListByHql(String hql, List<Object> objArray);

	/**
	 * 执行hql更新或删除语句
	 * 
	 * @param hql
	 * @return
	 */
	public int executeHql(String hql, List<Object>  params);

	/**
	 * 活动对象
	 * 
	 * @param hql
	 * @param values
	 * @return
	 */
	public Object getObjectHql(String hql, List<Object> values);

	/**
	 * 活动数量
	 * 
	 * @param hql
	 * @param values
	 * @return
	 */
	public Long getCountHql(String hql, List<Object> values);

	/**
	 * 增删改，执行原生态的SQL语句
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public int executeSql(String sql, List<Object>  params);

	/**
	 * 根据SQL查询集合
	 * 
	 * @param sql
	 * @return
	 */
	public List<?> queryListBySql(String sql,List<Object>  params);

	/**
	 * 
	 * @Title: saveEntity
	 * @Description: TODO(保存实体返回ID)
	 * @param @param entity
	 * @param @return 设定文件
	 * @return int 返回类型
	 * @throws
	 */
	public int saveEntity(T entity);
	
	
}
