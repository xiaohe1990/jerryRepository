package com.web.dao.system;

import java.util.Map;

import com.web.pojo.system.UUser;

public interface UUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UUser record);

    int insertSelective(UUser record);

    UUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);

	UUser login(Map<String, Object> map);

	UUser findUserByEmail(String email);

	//List<URoleBo> selectRoleByUserId(Long id);

}