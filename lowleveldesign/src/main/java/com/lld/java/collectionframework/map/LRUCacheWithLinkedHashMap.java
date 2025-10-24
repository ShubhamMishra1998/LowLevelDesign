package com.lld.java.collectionframework.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheWithLinkedHashMap<K, V> extends LinkedHashMap<K, V> {

    int capacity;

    LRUCacheWithLinkedHashMap(int capacity) {
        super(capacity, 0.9f, true);
        this.capacity = capacity;
    }

    // evicts out the least recently used element when size grows greater than the threshold.
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCacheWithLinkedHashMap<String, Integer> map = new LRUCacheWithLinkedHashMap<>(3);
        map.put("Bob", 30);
        map.put("mike",40);
        map.put("pam", 60);
        map.put("Bob", 39);
        map.put("raj", 90);

        System.out.println(map);


    }

}

