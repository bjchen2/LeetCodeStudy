package com.leetcode.senior.design;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
 * 获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
 * 写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，在写入前删除最近最少使用的数据值
 *
 * 进阶 : 你是否可以在 O(1) 时间复杂度内完成这两种操作？
 * Created By Cx On 2019/2/14 11:49
 */
public class Answer1 {
    class LRUCache extends LinkedHashMap<Integer,Integer> {
        private int capacity;

        //removeEldestEntry方法会在插入元素之后调用，用以判断是否需要移除链表表头元素（最近最少访问元素）
        //这个方法会通过反射的方式，在put 和 putAll方法之后执行
        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return super.size() > capacity;
        }

        public LRUCache(int capacity) {
            super(capacity,0.75f,true);
            this.capacity = capacity;
        }

        public int get(int key){
            return super.get(key) == null? -1 : super.get(key);
        }
    }
}
