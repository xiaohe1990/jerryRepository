/**
 * 
 */
package zb.com.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zb.com.dao.BaseDao;
import zb.com.entity.T_Dict;
import zb.com.services.DictServices;

/** 
* @ClassName: DictServicesImpl 
* @Description: TODO(中间表业务操作层) 
* @author XW 
* @date 2018年4月9日 下午4:11:18 
*  
*/
@Service("dictServices")
public class DictServicesImpl implements DictServices {
	@Autowired
	private BaseDao baseDao;
	/* (non-Javadoc)
	 * @see zb.com.services.DictServices#getDictByType(java.lang.String)
	 */
	@Override
	public Map<String, Object> getDictByType(String dictType) {
		Map<String,Object> dictMap=new HashMap<>();
		List<Object> ob=new ArrayList<>();
		String hql=" from T_Dict where t_type=?";
		ob.add(dictType);
		List<T_Dict> dictList=baseDao.queryListByHql(hql, ob);
		if(null!=dictList||dictList.size()>0){
			for(T_Dict dct:dictList){
				dictMap.put(dct.getT_key(), dct.getT_value());
			}
		}
		
		return dictMap;
	}

	/* (non-Javadoc)
	 * @see zb.com.services.DictServices#addDict(zb.com.entity.T_Dict)
	 */
	@Override
	public int addDict(T_Dict dict) {
		return baseDao.saveEntity(dict);
	}

	/* (non-Javadoc)
	 * @see zb.com.services.DictServices#updateDict(zb.com.entity.T_Dict)
	 */
	@Override
	public int updateDict(T_Dict dict) {
		List<Object> ob=new ArrayList<>();
		String hql="";
		return baseDao.executeHql(hql, ob);
	}

}
