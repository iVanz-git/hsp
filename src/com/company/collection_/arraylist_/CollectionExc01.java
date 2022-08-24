package com.company.collection_.arraylist_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周五, 2022/8/5 8:55 GMT+0800
 */
public class CollectionExc01 {
    public static void main(String[] args) {
        ArrayList<Dog> dogList = new ArrayList();
//        List<Dog> dogList2 = new ArrayList();
        dogList.add(new Dog("旺财", 3));
        dogList.add(new Dog("大黄", 2));
        dogList.add(new Dog("小白", 4));

        System.out.println("增强for循环遍历：");
        for (Dog dog :dogList) {
            System.out.println(dog);
        }

        System.out.println();

        System.out.println("iterator迭代器遍历：");
        Iterator dogIterator = dogList.iterator();
        while (dogIterator.hasNext()) {
            Object dogNext =  dogIterator.next();
            System.out.println(dogNext);
        }
        System.out.println();
        //重写tostring方法后的输出
        System.out.println("重写tostring方法后的输出：");
        System.out.println(dogList.toString());


    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
