package com.web.service.system;

import java.util.Map;

import com.web.pojo.system.UUser;

public interface UUserService {

	int deleteByPrimaryKey(Long id);

	UUser insert(UUser record);

    UUser insertSelective(UUser record);

    UUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);
    
    UUser login(String email ,String pswd);

	UUser findUserByEmail(String email);

	/*Pagination<UUser> findByPage(Map<String, Object> resultMap, Integer pageNo,
			Integer pageSize);*/

	Map<String, Object> deleteUserById(String ids);

}
