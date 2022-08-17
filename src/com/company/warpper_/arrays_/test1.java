package com.company.warpper_.arrays_;

/**
 * @author iVan
 */
public class test1 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.test();
        c1.test2();
        c1.test3();

    }
}

interface A {
    default void test() {
        System.out.println("A接口的默认test方法");
    }
}

interface B {
    default void test() {
        System.out.println("B接口的默认test方法");
    }
}

class C1 implements A, B {
    @Override
    public void test() {
        B.super.test();
    }

    public void test2() {
        test();
    }

    public void test3() {
        A.super.test();
    }

    interface C extends A {

    }

}