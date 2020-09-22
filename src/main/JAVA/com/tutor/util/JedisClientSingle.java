package com.tutor.util;

import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisClientSingle implements JedisClient {
    @Autowired
    private JedisPool jedisPool;
    @Override
    public String get(String key) {
      Jedis jedis= jedisPool.getResource();
      String a= jedis.get(key);
      jedis.close();
        return a;
    }

    @Override
    public String set(String key, String value) {
        Jedis jedis= jedisPool.getResource();
        String a= jedis.set(key,value);
        jedis.close();
        return a;
    }

    @Override
    public long hset(String hkey, String key, String value) {
        Jedis jedis= jedisPool.getResource();
        long a= jedis.hset(hkey,key,value);
        jedis.close();
        return a;
    }

    @Override
    public String hget(String hkey, String key) {
        Jedis jedis= jedisPool.getResource();
         String a= jedis.hget(hkey,key);
        jedis.close();
        return a;
    }

    @Override
    public long expire(String key, long second) {
        Jedis jedis= jedisPool.getResource();
        long a= jedis.expire(key,(int)second);
        jedis.close();
        return a;
    }

    @Override
    public long ttl(String key) {
        Jedis jedis = jedisPool.getResource();
        long result = jedis.ttl(key);
        jedis.close();
        return result;
    }
}
