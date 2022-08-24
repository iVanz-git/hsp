package com.company.collection_.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周五, 2022/8/5 11:57 GMT+0800
 */
public class test1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add("hello");
        list1.add("say");
        list1.add("laugh");
        list1.add("bye");
        list1.add("play");
        list1.add("face");
        list1.add("aello");
        list1.add("said");
        list1.add("look");
        list1.add("talk");

        list1.add(2,"韩顺平教育");
        System.out.println("2号位 添加 韩顺平教育 后 list为：" + list1);

        System.out.println("获得第5个元素： " + list1.get(4));

        System.out.println("删除第6给元素： " + list1.remove(5));

        System.out.println("修改第7个元素： " + list1.set(6, "啦啦啦"));

        Iterator list1Iterator = list1.iterator();
        System.out.println("使用迭代器遍历集合list1: ");
        while (list1Iterator.hasNext()) {
            Object list1Next =  list1Iterator.next();
            System.out.println(list1Next);

        }

//        Node

    }
}

