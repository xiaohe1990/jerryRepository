package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.mall.common.model.UUser;
import com.mall.user.service.UUserService;

@RunWith(SpringJUnit4ClassRunner.class)       
@ContextConfiguration(locations = {"classpath:spring.xml"})  
public class UserTest {

	@Autowired
	private UUserService uUserService = null;
	
	@Test
	public void test() {
		UUser uUser = uUserService.findUserByEmail("8446666@qq.com");
		System.out.println(uUser.getNickname());
		System.out.println(uUser.getPswd());
		System.out.println(JSON.toJSONString(uUser));
	}

}
