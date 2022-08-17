package com.company.map_;

import java.util.HashMap;
//import java.util.Objects;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周一, 2022/8/15 21:01 GMT+0800
 */


public class mptest2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A(i), "hello");
        }


    }
}

class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        A a = (A) o;
//        return num == a.num;
//    }

    @Override
    public int hashCode() {
        return 1;
//        return Objects.hash(num);
    }
}
