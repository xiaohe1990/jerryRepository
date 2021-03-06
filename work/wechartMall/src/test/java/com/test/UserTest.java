package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.mall.common.dao.URoleMapper;
import com.mall.common.model.UPermission;
import com.mall.common.model.URole;
import com.mall.common.model.UUser;
import com.mall.permission.service.PermissionService;
import com.mall.user.service.UUserService;

@RunWith(SpringJUnit4ClassRunner.class)       
@ContextConfiguration(locations = {"classpath:spring.xml"})  
public class UserTest {

	@Autowired
	private UUserService uUserService = null;
	@Autowired
	private PermissionService permissionService = null;
	@Autowired
	URoleMapper roleMapper = null;
	//@Test
	public void test() {
		UUser uUser = uUserService.findUserByEmail("8446666@qq.com");
		System.out.println(uUser.getNickname());
		System.out.println(uUser.getPswd());
		System.out.println(JSON.toJSONString(uUser));
	}
	
	@Test
	public void test2() {
		List<UPermission> permission =  permissionService.queryPermissionTreeList(11L);
		System.out.println(JSON.toJSONString(permission));
	}

	//@Test
	public void test3() {
		Map<String, Object> map = new HashMap<>();
		map.put("userId", 1);
		List<URole> list = roleMapper.findNowAllPermission(map);
		System.out.println(list.toString());
	}
}
