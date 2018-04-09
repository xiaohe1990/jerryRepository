package com.mall.common.dao;

import java.util.List;

import com.mall.common.model.UUser;
import com.mall.permission.bo.URoleBo;

public interface UUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UUser record);

    int insertSelective(UUser record);

    UUser selectByPrimaryKey(Long id);

    UUser findUserByUsername(String username);
	
	UUser findUserByPhonenum(String phonenum);
    
    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);

	UUser login(UUser user);

	UUser findUserByEmail(String email);

	List<URoleBo> selectRoleByUserId(Long id);

}