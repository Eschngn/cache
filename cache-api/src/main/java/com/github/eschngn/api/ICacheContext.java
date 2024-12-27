package com.github.eschngn.api;

import java.util.Map;

/**
 * @author wilson
 * @version 1.0
 * @desc: 缓存上下文
 * @date 2024-12-27
 */
public interface ICacheContext<K,V> {
    /**
     * map 信息
     * @return
     */
    Map<K,V> map();

    /**
     * 限制大小
     * @return
     */
    int size();

    /**
     * 驱逐策略
     * @return
     */
    ICacheEvict<K,V> cacheEvict();
}
