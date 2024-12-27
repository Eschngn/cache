package com.github.eschngn.model;

import com.github.eschngn.api.ICacheEntry;

/**
 * @author wilson
 * @version 1.0
 * @desc: 键值的明确信息
 * @date 2024-12-27
 */
public class CacheEntry<K, V> implements ICacheEntry<K, V> {
    private final K key;
    private final V value;

    /**
     * 新建键值对元素
     * @param key 键
     * @param value 值
     * @return entry
     * @param <K> 泛型
     * @param <V> 泛型
     */
    public static <K, V> CacheEntry<K, V> create(final K key, final V value) {
        return new CacheEntry<>(key, value);
    }

    public CacheEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K key() {
        return key;
    }

    @Override
    public V value() {
        return value;
    }
}
