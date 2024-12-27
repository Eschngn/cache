package com.github.eschngn.api;

/**
 * @author wilson
 * @version 1.0
 * @desc: 驱逐策略
 * @date 2024-12-27
 */
public interface ICacheEvict<K,V> {
    /**
     * 驱逐策略
     * @param evictContext 驱逐上下文
     * @return 被移除的明细，没有时返回 null
     */
    ICacheEntry<K,V> evict(final ICacheEvictContext<K,V> evictContext);

    /**
     * 更新 key 信息
     * @param key 键
     */
    void updateKey(final K key);

    /**
     * 移除 key 信息
     * @param key 键
     */
    void removeKey(final K key);

}
