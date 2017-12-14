package com.demo.jerry.main;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
			Jedis jedis  = new Jedis("192.168.32.128",6379);
			jedis.set("name","何锦程");
			String name = jedis.get("name");
			System.out.println(name);
			//jedis.flushAll();
			jedis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
