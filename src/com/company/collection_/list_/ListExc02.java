package com.company.collection_.list_;

import java.util.*;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周五, 2022/8/5 12:43 GMT+0800
 */
public class ListExc02 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(new Book("HLM", "CXQ",100));
        arrayList.add(new Book("XYJ", "WCE",10));
        arrayList.add(new Book("SHZ", "SNA",9));
        arrayList.add(new Book("SGYY", "LGZ",80));


        System.out.println("----------分割线----------");
        Book.BookListBBSort(arrayList);

        System.out.println(arrayList.getClass());
        System.out.println("ArrayList输出为：" + arrayList.toString());

        System.out.println("----------分割线----------");
        System.out.println("----------分割线----------");
        System.out.println("----------分割线----------");

//
//        List vector = new Vector();
//
//        vector.add(new Book("HLM", "CXQ",100));
//        vector.add(new Book("XYJ", "WCE",10));
//        vector.add(new Book("SHZ", "SNA",9));
//        vector.add(new Book("SGYY", "LGZ",80));
//
//        System.out.println(vector.getClass());
//        System.out.println("Vector输出为：" + vector.toString());
//
//        System.out.println("----------分割线----------");
//
//        List linkedList = new LinkedList();
//
//        linkedList.add(new Book("HLM", "CXQ",100));
//        linkedList.add(new Book("XYJ", "WCE",10));
//        linkedList.add(new Book("SHZ", "SNA",9));
//        linkedList.add(new Book("SGYY", "LGZ",80));
//
//        System.out.println("----------分割线----------");
//        System.out.println(linkedList.getClass());
//        System.out.println("LinkedList输出为：" + linkedList.toString());
    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public static void BookListBBSort(List list){
//        Book temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
               if (((Book)list.get(j)).getPrice() > ((Book)list.get(j + 1)).getPrice()) {
                    Book b1 = (Book) list.get(j);
                    Book b2 = (Book) list.get(j + 1);
                    list.set(j, b2);
                    list.set(j + 1, b1);

               }
            }

        }
    }

    @Override
    public String toString() {
        return  "\n" + "名称：" + name + "\t" +
                "价格：" + price + "\t" +
                "作者：" + author + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}