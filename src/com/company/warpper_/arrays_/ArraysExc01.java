package com.company.warpper_.arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExc01 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅新",90);
        books[2] = new Book("青年文摘20年",5);
        books[3] = new Book("java从入门到放弃",300);


//        Arrays.sort(books,Comparator.comparing(Book::getName));

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double judge =  ((Book)o1).getName().length() - ((Book)o2).getName().length();
                if (judge > 0){
                    return 1;
                }
                else if (judge < 0){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

/**
        Book.priceSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
               double judge =  ((Book)o1).getPrice() - ((Book)o2).getPrice();
                if (judge > 0){
                    return 1;
                }
                else if (judge < 0){
                    return -1;
                }
                else {
                    return 0;
                }
//                return (int)((Double)o1 - (Double)o2);
            }
        });
 */


        System.out.println(Arrays.toString(books));


    }
}


class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void priceSort(Book[] book, Comparator comparator){
//        Book temp = new Book("",0);
        for (int i = 0; i < book.length - 1; i++) {
            if (comparator.compare(book[i], book[i + 1]) > 0) {
                Book temp = book[i];
                book[i] = book[i + 1];
                book[i + 1] = temp;
            }
        }
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


//
//  book[i].getPrice() > book[i + 1].getPrice()