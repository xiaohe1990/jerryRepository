package com.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

public class LoginLogoutTest {
	
	//@Test
	public void testHelloworld() {
		Factory<SecurityManager>factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		SecurityManager manager = factory.getInstance();
		SecurityUtils.setSecurityManager(manager);
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("zhang","123");
		try {
			subject.login(token);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Assert.assertEquals(true, subject.isAuthenticated());
		subject.logout();
	}
}
