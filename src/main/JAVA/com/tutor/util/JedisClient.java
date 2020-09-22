package com.tutor.util;

public interface JedisClient {



    public String get(String key);
    public String set(String key,String value);
    public long hset(String hkey, String key, String value);
    public String hget(String hkey, String key);
    public long expire(String key,long second);
    public long ttl(String key);

}
