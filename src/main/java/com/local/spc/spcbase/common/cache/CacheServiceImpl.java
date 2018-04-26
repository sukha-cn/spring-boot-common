package com.local.spc.spcbase.common.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class CacheServiceImpl implements CacheService {
    /**
     * 默认超时时间, 10分钟
     */
    private static final int DEFAULT_TIMEOUT = 600;
    /**
     * 默认时间单位, 秒
     */
    private static final TimeUnit DEFAULT_TIME_UNIT = TimeUnit.SECONDS;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void put(String key, Collection<? extends Serializable> values) {
        put(key, values, DEFAULT_TIMEOUT);
    }

    @Override
    public void put(String key, Collection<? extends Serializable> values, int timeout) {
        put(key, values, timeout, DEFAULT_TIME_UNIT);
    }

    @Override
    public void put(String key, Collection<? extends Serializable> values, int timeout, TimeUnit unit) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, values, timeout, unit);
    }

    @Override
    public void put(String key, Map<? extends Serializable, ? extends Serializable> values) {
        put(key, values, DEFAULT_TIMEOUT);
    }

    @Override
    public void put(String key, Map<? extends Serializable, ? extends Serializable> values, int timeout) {
        put(key, values, timeout, DEFAULT_TIME_UNIT);
    }

    @Override
    public void put(String key, Map<? extends Serializable, ? extends Serializable> values, int timeout, TimeUnit unit) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, values, timeout, unit);
    }

    @Override
    public void put(String key, Serializable value) {
        put(key, value, DEFAULT_TIMEOUT);
    }

    @Override
    public void put(String key, Serializable value, int timeout) {
        put(key, value, timeout, DEFAULT_TIME_UNIT);
    }

    @Override
    public void put(String key, Serializable value, int timeout, TimeUnit unit) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value, timeout, unit);
    }

    @Override
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
