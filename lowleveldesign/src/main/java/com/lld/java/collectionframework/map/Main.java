package com.lld.java.collectionframework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("abc", 1);
        m1.put("def", 2);
        m1.put("ghi", 3);

        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(m1.get(s1));
        System.out.println(m1.get(s2));

    }
}
