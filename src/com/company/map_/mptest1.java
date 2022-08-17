package com.company.map_;

import java.util.*;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周六, 2022/8/13 20:31 GMT+0800
 */
public class mptest1 {
    public static void main(String[] args) {

        Employee jack = new Employee("jack", 22000, 0002);
        Employee tom = new Employee("tom", 12200, 0011);
        Employee jerry = new Employee("jerry", 5566, 0021);

        Map hashMap = new HashMap();
        hashMap.put(jack.getID(), jack);
        hashMap.put(tom.getID(), tom);
        hashMap.put(jerry.getID(), jerry);

        System.out.println("使用hashmap的两种遍历方式");
        System.out.println("hashmap的增强for遍历：");
        Set keySet = hashMap.keySet();
        for (Object key : keySet) {
            if (((Employee)hashMap.get(key)).getSal() > 18000 ){
                System.out.println(((Employee) hashMap.get(key)).getName());
            }
        }

        System.out.println("hashmap的迭代器遍历：");
        Iterator iterator1 = keySet.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            if(((Employee)hashMap.get(next)).getSal() > 18000){
                System.out.println(((Employee) hashMap.get(next)).getName());
            }
        }

        System.out.println("\n" + "==========分割线==========" + "\n");

        System.out.println("使用entrySet的两种遍历方式");
        Set set = hashMap.entrySet();
        System.out.println("entrySet的增强for遍历：");
        for (Object s :set) {
            Map.Entry sets = (Map.Entry) s;
            if (((Employee)sets.getValue()).getSal() > 18000 ) {
                System.out.println(((Employee) sets.getValue()).getName());
            }
        }

        System.out.println("entrySet的增强迭代器遍历：");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();

            Map.Entry m = (Map.Entry) key;
            if (((Employee)m.getValue()).getSal() > 18000) {
                System.out.println(((Employee)m.getValue()).getName());
            }
        }



        System.out.println("\n" + "==========分割线==========" + "\n");

        HashMap hashMap1 = new HashMap();
        hashMap1.put(null, null);

        Hashtable hashtable = new Hashtable();
        hashtable.put("eee", 321);

        Properties properties = new Properties();

        HashSet hashSet = new HashSet();
        hashSet.add("asdads");
        hashSet.add("asdads");
        hashSet.add("asdads");
        hashSet.add(jack);

        System.out.println("hashMap1 :" + hashMap1);
        System.out.println("hashtable :" + hashtable);
        System.out.println("hashSet :" + hashSet);


    }
}

class Employee{
    private String name;
    private double sal;
    private int ID;

    public Employee(String name, double sal, int ID) {
        this.name = name;
        this.sal = sal;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", ID=" + ID +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}