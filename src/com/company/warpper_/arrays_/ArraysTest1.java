package com.company.warpper_.arrays_;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author iVan
 */
public class ArraysTest1 {
    public static void main(String[] args) {
        Integer[] arr = {6, 16, 4, 21, 2, 11, 3, 42};
//        Arrays.sort(arr);
        Arrays.sort(arr,2,5);
        System.out.println(Arrays.toString(arr));


    }
}


class User {
    /**
     * @param id id编号
     * @param name 姓名
     * @param age 年龄
     * @param score 成绩
     * @param description 描述
     */
    private int id;
    private String name;
    private int age;
    private double score;
    private String description;

    public User(int id, String name, int age, double score, String description) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.description = description;
    }

    public User() {
        super();
    }
}