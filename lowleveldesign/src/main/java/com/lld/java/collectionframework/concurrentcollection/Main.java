package com.lld.java.collectionframework.concurrentcollection;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("mango");
        list.add("orange");
        list.add("apple");

        for(String fruit : list) {
            list.remove("apple");
            if(fruit.equals("orange")) {
                list.add("banana");
            }
            System.out.println(fruit);
        }

        System.out.println(list);
        StringBuilder sb = new StringBuilder();
        sb.append(1);
    }
}

