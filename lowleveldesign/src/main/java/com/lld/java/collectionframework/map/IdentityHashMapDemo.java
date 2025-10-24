package com.lld.java.collectionframework.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();
        Map<String, Integer> map1 = new HashMap<>();

        String s1 = new String("abc");
        String s2 = new String("abc");

        map.put(s1,1);
        map.put(s2,1);

        System.out.println(map); // {abc=1, abc=1} It's because it uses Oblect hashcode to determine bucket location.

        map1.put(s1, 1);
        map1.put(s2, 1);

        System.out.println(map1); // {abc=1}
    }
}
