package com.demo.jerry.Jedis_demo;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisTest {
	
	/**
	 * 测试连接
	 */
	@Test
	public void testJedisDemo1() {
		try {
			Jedis jedis  = new Jedis("119.23.109.181",6379);
			jedis.set("name","何锦程");
			String name = jedis.get("name");
			System.out.println(name);
			//jedis.flushAll();
			jedis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 * 测试连接池连接
	 * 
	 */
	//@Test
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
	
	
	//@Test
	public void jedisClusterTest() {
		try {
			// 数据库链接池配置
			JedisPoolConfig config = new JedisPoolConfig(); 
			config.setMaxTotal(100); 
			config.setMaxIdle(50); 
			config.setMinIdle(20); 
			config.setMaxWaitMillis(6 * 1000); 
			config.setTestOnBorrow(true); 
			// Redis集群的节点集合
			Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
			jedisClusterNodes.add(new HostAndPort("192.168.32.128", 7000));
			jedisClusterNodes.add(new HostAndPort("192.168.32.128", 7001));
			jedisClusterNodes.add(new HostAndPort("192.168.32.128", 7004));
			jedisClusterNodes.add(new HostAndPort("192.168.32.129", 7002));
			jedisClusterNodes.add(new HostAndPort("192.168.32.129", 7003));
			jedisClusterNodes.add(new HostAndPort("192.168.32.129", 7005));
			// 根据节点集创集群链接对象
			//JedisCluster jedisCluster = newJedisCluster(jedisClusterNodes);
			// 节点，超时时间，最多重定向次数，链接池
			JedisCluster jedisCluster = new JedisCluster(jedisClusterNodes, 2000, 100,config);
			int num = 1000;
			String key = "test";
			String value = "";
			for (int i=1; i <= num; i++){

			// 存数据
			      jedisCluster.set(key+i,"jedis"+i);

			// 取数据
			      value= jedisCluster.get(key+i);

			System.out.println(key+i + "=" + value);

			// 删除数据

			//jedisCluster.del(key+i);

			//value = jedisCluster.get(key+i);

			//log.info(key+i + "=" + value);
			}
			jedisCluster.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
