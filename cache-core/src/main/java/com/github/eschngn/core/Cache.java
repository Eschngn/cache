package com.github.eschngn.core;

import com.github.eschngn.api.ICache;
import com.github.eschngn.api.ICacheEvict;
import com.github.eschngn.api.ICacheExpire;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @author wilson
 * @version 1.0
 * @desc: 缓存信息
 * @date 2024-12-27
 */
public class Cache<K, V> implements ICache<K, V> {
    /**
     * map 信息
     */
    private Map<K, V> map;

    /**
     * 大小限制
     */
    private int sizeLimit;

    /**
     * 过期策略
     */
    private ICacheExpire<K, V> expire;

    /**
     * 驱逐策略
     */
    private ICacheEvict<K, V> evict;

    /**
     * 设置 map
     * @param map
     * @return this
     */
    public Cache<K, V> map(Map<K, V> map) {
        this.map = map;
        return this;
    }

    /**
     * 设置大小限制
     * @param sizeLimit 大小限制
     * @return this
     */
    public Cache<K,V> sizeLimit(int sizeLimit){
        this.sizeLimit=sizeLimit;
        return this;
    }

    /**
     * 设置驱逐策略
     * @param cacheEvict 驱逐策略
     * @return this
     */
    public Cache<K,V> evict(ICacheEvict<K,V> cacheEvict){
        this.evict=cacheEvict;
        return this;
    }

    @Override
    public ICache<K, V> expire(K key, long timeInMills) {
        return null;
    }

    @Override
    public ICache<K, V> expireAt(K key, long timeInMills) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
