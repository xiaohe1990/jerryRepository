package com.demo.jerry.Jedis_demo;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

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
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(50);
		config.setMaxIdle(50);
		JedisPool pool = new JedisPool(config,"192.168.32.128",6379);
		Jedis jedis = null;
		
		try {
			jedis = pool.getResource();
			jedis.set("sex", "男");
			String value = jedis.get("sex");
			System.out.println(value);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (jedis!=null) {
				jedis.close();
			}
			if(pool!=null) {
				pool.close();
			}
		}
	}
}
