package com.company.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周三, 2022/8/24 17:52 GMT+0800
 */
public class Collections_test {
    public static void main(String[] args) {
        //Collections工具类常用方法
        //创建一个测试用的ArrayList类集合

       List list = new ArrayList();
       list.add("Andy");
       list.add("Bob");
       list.add("Calvin");
       list.add("Deryckw");
       list.add("Eliot");

        System.out.println("原始list为:\n" + list);
        //1.reverse(List) 反转
        Collections.reverse(list);
        System.out.println("reverse(List) 反转后：" + "\n" + list);

        System.out.println("====================分割线====================");

        //2.shuffle(List) 对List集合进行随机排序
        Collections.shuffle(list);
        System.out.println("shuffle(List) 对List集合进行随机排序：" + "\n" + list);

        System.out.println("====================分割线====================");

        //3.sort(List) 根据元素的自然顺序排序(升序)
        Collections.sort(list);
        System.out.println("sort(List) 根据元素的自然顺序排序(升序)：" + "\n" + list);

        System.out.println("====================分割线====================");

        //4.sort(List, Comparator) 根据指定的Comparator 产生的顺序对List进行排序
        Collections.sort(list, new Comparator(){
            //比较方法1：通过字符串自带的默认compareTo方法进行排序
            @Override
            public int compare(Object o1, Object o2) {
                int num = ((String)o1).compareTo(((String)o2));
                return num;
            }
        });
        System.out.println("sort(List, Comparator) 根据指定的Comparator 产生的顺序(默认String的compare方法)对List进行排序：" + "\n" + list);

        Collections.sort(list, new Comparator<String>() {
            //比较方法2：通过字符串长度比较进行排序
            @Override
            public int compare(String s1, String s2) {
//                //从短到长
//                return s1.length() - s2.length();
                //从长到短
                return s2.length() - s1.length();
            }
        });
        System.out.println("sort(List, Comparator) 根据指定的Comparator 产生的顺序(字符串长度)对List进行排序：" + "\n" + list);

        System.out.println("====================分割线====================");

        //5.swap(List, int i, int j) 将集合中的i和j元素进行交换
        Collections.swap(list, 2, 4);
        System.out.println("swap(List, 2, 4) 将集合中的2和4元素进行交换" + "\n" + list);

        System.out.println("====================分割线====================");





    }
}
