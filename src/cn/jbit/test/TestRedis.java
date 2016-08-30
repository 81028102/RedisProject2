package cn.jbit.test;

import redis.clients.jedis.Jedis;

/**
 * @author 任锯东
 * @ClassName TestRedis
 * @Version 
 * @ModifiedBy 任锯东
 * @date 2016年8月29日 下午8:42:30
 */
public class TestRedis {

	public static void main(String[] args) {
		//连接本地的redis服务
		Jedis jedis=new Jedis("localhost");
		System.out.println("Connection to server successfully");
		//查看服务是否运行
		System.out.println("Server is running:"+jedis.ping());
		System.out.println("Redis缓存项目");
		
		
	}

}
