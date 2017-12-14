package com.web.service.system.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.system.UUserMapper;
import com.web.pojo.system.UUser;
import com.web.service.system.UUserService;

@Service
@Transactional
public class UUserServiceImpl implements UUserService {
	/***
	 * 用户手动操作Session
	 * */
	@Resource
	UUserMapper userMapper;

	public int deleteByPrimaryKey(Long id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	public UUser insert(UUser entity) {
		userMapper.insert(entity);
		return entity;
	}

	public UUser insertSelective(UUser entity) {
		userMapper.insertSelective(entity);
		return entity;
	}

	public UUser selectByPrimaryKey(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKey(UUser entity) {
		return userMapper.updateByPrimaryKey(entity);
	}

	public int updateByPrimaryKeySelective(UUser entity) {
		return userMapper.updateByPrimaryKeySelective(entity);
	}

	public UUser login(String email ,String pswd) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("email", email);
		map.put("pswd", pswd);
		UUser user = userMapper.login(map);
		return user;
	}

	public UUser findUserByEmail(String email) {
		return userMapper.findUserByEmail(email);
	}


	public Map<String, Object> deleteUserById(String ids) {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		try {
			int count=0;
			String[] idArray = new String[]{};
			if(StringUtils.contains(ids, ",")){
				idArray = ids.split(",");
			}else{
				idArray = new String[]{ids};
			}
			
			for (String id : idArray) {
				count+=this.deleteByPrimaryKey(new Long(id));
			}
			resultMap.put("status", 200);
			resultMap.put("count", count);
		} catch (Exception e) {
			//LoggerUtils.fmtError(getClass(), e, "根据IDS删除用户出现错误，ids[%s]", ids);
			resultMap.put("status", 500);
			resultMap.put("message", "删除出现错误，请刷新后再试！");
		}
		return resultMap;
	}

	public Map<String, Object> updateForbidUserById(Long id, Long status) {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		try {
			UUser user = selectByPrimaryKey(id);
			user.setStatus(status);
			updateByPrimaryKeySelective(user);
			
			//如果当前用户在线，需要标记并且踢出
			//customSessionManager.forbidUserById(id,status);
			
			
			resultMap.put("status", 200);
		} catch (Exception e) {
			resultMap.put("status", 500);
			resultMap.put("message", "操作失败，请刷新再试！");
			//LoggerUtils.fmtError(getClass(), "禁止或者激活用户登录失败，id[%s],status[%s]", id,status);
		}
		return resultMap;
	}


	
	
	
}
