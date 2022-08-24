package com.company.collection_.arraylist_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周四, 2022/8/4 12:14 GMT+0800
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("bookList1");
        arrayList.add("123");
        arrayList.add(7567);
        arrayList.add("哈哈");
        arrayList.add(4564);

        System.out.println(arrayList);

        System.out.println("-----------分割线---------");

        boolean b1 = arrayList.remove((Integer)7567);
        System.out.println(b1);
        System.out.println(arrayList);

        System.out.println("-----------分割线---------");

        arrayList.contains(4564);
        boolean b2 = arrayList.contains(4564);
        System.out.println(arrayList);
        System.out.println(b2);

        System.out.println("-----------分割线---------");

        int n1 = arrayList.size();
        System.out.println(n1);

        System.out.println("-----------分割线---------");

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("555");
        arrayList1.add("666");
        arrayList1.add("777");

        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        arrayList.addAll(arrayList);
        System.out.println(arrayList);

        System.out.println("-----------分割线---------");

        Collection col1 = new ArrayList();
        col1.add("qwe");
        col1.add("dsa");
        col1.add("zxc");
        col1.add("tyu");
        System.out.println(col1.toString());

        Iterator iterator = col1.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("-----------分割线---------");

        ArrayList<Book> bookList1 = new ArrayList<Book>();
        bookList1.add(new Book("Java核心技术", 100));
        bookList1.add(new Book("深入理解JVM虚拟机", 122));
        bookList1.add(new Book("深入浅出设计模式", 66));
        bookList1.add(new Book("Java并发编程之美", 88));

        Iterator<Book> bookIterator = bookList1.iterator();
        System.out.println("foreach遍历原始ArrayList: ");
        for (Book b: bookList1) {
            System.out.println(b);
        }

        System.out.println("foreach遍历原始ArrayList(第二遍): ");
        for (Book b: bookList1) {
            System.out.println(b);
        }

        System.out.println("使用迭代器遍历: ");
        while (bookIterator.hasNext()) {
            Book bookNext =  bookIterator.next();
            System.out.println(bookNext);
        }

       bookIterator = bookList1.iterator();

        while (bookIterator.hasNext()) {
            Book next =  bookIterator.next();
            System.out.println("重置后" + next);

        }

    }
}

class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}