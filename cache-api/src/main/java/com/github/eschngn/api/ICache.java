package com.github.eschngn.api;

import java.util.Map;

/**
 * @author wilson
 * @version 1.0
 * @desc: 缓存接口
 * @date 2024-12-27
 */
public interface ICache<K, V> extends Map<K, V> {
    /**
     * 毫秒时间之后过期
     * @param key
     * @param timeInMills
     * @return this
     */
    ICache<K, V> expire(final K key, final long timeInMills);

    /**
     * 在指定的时间过期
     * @param key
     * @param timeInMills
     * @return this
     */
    ICache<K,V> expireAt(final K key,final long timeInMills);
}
