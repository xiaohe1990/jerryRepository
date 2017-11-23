package com.demo.jerry.Jedis_demo;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest {
	
	/**
	 * 测试连接
	 */
	@Test
	public void testJedisDemo1() {
		try {
			Jedis jedis  = new Jedis("192.168.32.128",6379);
			jedis.set("name","何锦程");
			String name = jedis.get("name");
			System.out.println(name);
			jedis.flushAll();
			jedis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * 测试连接池连接
	 * 
	 */
	@Test
	public void testJedisDemo2() {
		
	}
}
