package com.local.spc.spcbase.common.cache;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public interface CacheService {

    public void put(String key, Collection<? extends Serializable> values);

    public void put(String key, Collection<? extends Serializable> values, int timeout);

    public void put(String key, Collection<? extends Serializable> values, int timeout, TimeUnit unit);

    public void put(String key, Map<? extends Serializable, ? extends Serializable> values);

    public void put(String key, Map<? extends Serializable, ? extends Serializable> values, int timeout);

    public void put(String key, Map<? extends Serializable, ? extends Serializable> values, int timeout, TimeUnit unit);

    public void put(String key, Serializable value);

    public void put(String key, Serializable value, int timeout);

    public void put(String key, Serializable value, int timeout, TimeUnit unit);

    public Object get(String key);
}
