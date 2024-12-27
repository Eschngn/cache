package com.github.eschngn.api;

/**
 * @author wilson
 * @version 1.0
 * @desc: 驱逐策略上下文
 * @date 2024-12-27
 */
public interface ICacheEvictContext<K, V> {
    /**
     * 新加入的 key
     * @return key
     */
    K key();

    /**
     * cache 实现
     * @return map
     */
    ICache<K,V> cache();

    /**
     * 获取大小
     * @return size
     */
    int size();
}
