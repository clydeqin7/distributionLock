package com.fe4fun.distributionLock;

import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

public class MyTest extends BaseTest{

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void test1() {
        // 写数据
        redisTemplate.opsForValue().set("key5", 18);
        // 读数据
        Object value = redisTemplate.opsForValue().get("key5");
        System.out.println(value.toString());
    }
}
