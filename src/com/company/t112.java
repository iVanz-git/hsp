package com.company;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周五, 2022/8/5 22:32 GMT+0800
 */
public class t112 {
    public static void main(String[] args) {

        System.out.println(Arrays.asList(1, 2, 3, 4, 5).getClass());
        System.out.println(1 << 13);
//        Collections


    }
    interface A {
        void Af1();
    }

    interface B {
        void Bf2();
    }

    interface C {
        void Cf3();
    }

    interface D extends A,B,C{
        void Df4();

    }
}





