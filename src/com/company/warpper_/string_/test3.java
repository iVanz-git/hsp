package com.company.warpper_.string_;

import java.math.BigDecimal;

/**
 * @author iVan
 */
public class test3 {
    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer();
//        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.length());
//
//        StringBuffer stringBuffer1 = new StringBuffer(null);
//
//        StringBuilder stringBuilder = new StringBuilder();

        long a1 = 3388685877147921107L;
        long a2 = 4383685877147921099L;
        int count = 0;
//        for (long i = a1; i >= 0; i/=2){
//            count++;
//            System.out.println(count);
//        }

//        boolean b= Math.pow(2,62) > a1;
//        System.out.println(b);
//
//        Double d1 = Math.pow(2,64);
//        System.out.println("1:" + d1 / a2);
//        BigDecimal b2 = new BigDecimal(Math.sqrt(d1));
//        System.out.println("2:" + b2.toPlainString());
//        BigDecimal b1 = new BigDecimal( a2 * 0.75 + "");
//        System.out.println("3:" + b1.toPlainString());
//        System.out.println("Math.pow(2,62)数值:" + BigDecimal.valueOf(d1).toPlainString());
//        System.out.println("************a1数值:" + a1);

        String s = String.valueOf(1);
        System.out.println(s);
        System.out.println("--------");
        double v = 0;
        for (int i = 0; i < 10; i++) {
            v = (Math.random() * 5) + 2;
            System.out.println(v);
            System.out.println(String.format("%.2f",v));

        }

//        System.out.println(count);

    }
}
