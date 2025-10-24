package com.lld.java.collectionframework.map;

import com.sun.source.tree.Tree;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

public class SequencedMapDemo {
    public static void main(String[] args) {
//        SequencedMap<String, Integer> map = new TreeMap<>();
        SequencedMap<String, Integer> m1 = new LinkedHashMap<>();
        m1.put("abc", 1);
        m1.put("def", 2);
        m1.put("ghi", 3);

        System.out.println(m1.lastEntry().getKey());

        System.out.println(m1.hashCode());

        System.out.println(m1.reversed().hashCode());

    }
}
