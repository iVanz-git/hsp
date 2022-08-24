package com.company;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周三, 2022/8/24 17:00 GMT+0800
 */
public class test2 {
    public static void main(String[] args) {

    }
}


interface I1{
    void iF1();
}

interface I2 extends I1{
    void iF2();
}

interface I3{
    void iF3();
}

class A1 implements I2, I3{

    @Override
    public void iF1() {

    }

    @Override
    public void iF2() {

    }

    @Override
    public void iF3() {

    }
}

