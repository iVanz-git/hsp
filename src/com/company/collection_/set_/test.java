package com.company.collection_.set_;

import java.util.*;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周四, 2022/8/11 15:44 GMT+0800
 */
public class test {
    public static void main(String[] args) {

        HashSet set = new HashSet();
        set.add(new Employee("lily", 22111, new Employee().new MyDate(2000, 5, 11)));
        set.add(new Employee("Andy", 12345, new Employee().new MyDate(1997, 6, 21)));
        set.add(new Employee("Tom", 6666, new Employee().new MyDate(1999, 11, 22)));
        set.add(new Employee("Tom", 2222, new Employee().new MyDate(1999, 11, 22)));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object setNext = iterator.next();
            System.out.println(setNext.toString());
        }

        System.out.println("=============分割线=============");
        System.out.println("=============分割线=============");
        System.out.println("=============分割线=============");
        System.out.println("=============分割线=============");

        HashSet<HashSet> hashSet1 = new HashSet();
        hashSet1.add(null);
        hashSet1.add(null);
        hashSet1.add(null);
        hashSet1.add(null);
        hashSet1.add(null);

        for (HashSet h:
             hashSet1) {
            System.out.println(h);
        }

        System.out.println("在chapter13添加点什么");

    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public Employee() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        Employee employee = (Employee) o;
        return birthday.getDay() == employee.birthday.getDay() &&
               birthday.getMonth() == employee.birthday.getMonth() &&
               birthday.getYear() == employee.birthday.getYear() &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday.getDay(), birthday.getMonth(), birthday.getYear());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }



    class MyDate {
        private int year;
        private int month;
        private int day;

        @Override
        public String toString() {
            return " " +
                    "year=" + year +
                    ", month=" + month +
                    ", day=" + day +
                    '}';
        }

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }
    }
}
