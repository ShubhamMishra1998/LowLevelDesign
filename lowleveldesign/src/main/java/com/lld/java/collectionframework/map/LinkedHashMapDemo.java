package com.lld.java.collectionframework.map;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new LinkedHashMap<>(10, 0.9f, true);
        m1.put("Orange", 10);
        m1.put("Apple", 20);
        m1.put("Banana", 30);
        m1.get("Orange");

        for(Map.Entry<String, Integer> entry : m1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
