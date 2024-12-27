package com.github.eschngn.api;

/**
 * @author wilson
 * @version 1.0
 * @desc: 缓存明细信息
 * @date 2024-12-27
 */
public interface ICacheEntry<K, V> {
    /**
     * 键
     * @return key
     */
    K key();

    /**
     * 值
     * @return value
     */
    V value();
}
