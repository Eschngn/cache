package com.github.eschngn.api;

import java.util.Collection;

/**
 * @author wilson
 * @version 1.0
 * @desc: 缓存过期
 * @date 2024-12-27
 */
public interface ICacheExpire<K,V> {
    /**
     * 指定 key 的过期时间
     * @param key 键
     * @param expireAt 具体过期时间
     */
    void expire(final K key,final long expireAt);

    /**
     * 返回待过期 key 的过期时间
     * 不存在，则返回 null
     * @param key 键
     * @return key 的过期时间
     */
    Long expireTime(final K key);

    /**
     * 惰性删除中需要处理的 keys
     * @param keyList keys
     */
    void refreshExpire(final Collection<K> keyList);
}
