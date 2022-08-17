package com.company.bignum;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("1233213456533412125633345");
//        BigDecimal bi1 = new BigDecimal("1233213456533412125633345");
        System.out.println("bi1= " + bi1);

        BigInteger bi2 = new BigInteger("23246532134346576765345876895");
//        BigDecimal bi2 = new BigDecimal("23246532134346576765345876895");
        System.out.println("bi2= " + bi2);

        BigInteger bi3 = bi1.add(bi2);//加
        System.out.println("bi1 + bi2 = " + bi3);

        BigInteger bi4 = bi1.subtract(bi2);//减
        System.out.println("bi1 - bi2 = " + bi4);

        BigInteger bi5 = bi1.multiply(bi2);//乘
        System.out.println("bi1 * bi2 = " + bi5);

//        BigDecimal bi6 = BigDecimal.valueOf(bi1.divide(bi2));//除
//        BigInteger i = bi1 / bi2;
        int scale = 17;
        //两个BigInteger做除法，其结果可能为Bigdecimal，或者除不尽的时候，需要提前将
        //这两个
        BigDecimal bigb1 = new BigDecimal(bi1);
        BigDecimal bigb2 = new BigDecimal(bi2);
        BigDecimal b16 = bigb1.divide(bigb2,scale, RoundingMode.DOWN);

        System.out.println("bi1 / bi2 = " + bigb1.divide(bigb2,scale,RoundingMode.HALF_UP));
        System.out.println("bi1 / bi2 = " + bigb1.divide(bigb2,scale,RoundingMode.CEILING));
        System.out.println("bi1 / bi2 = " + b16);

/**
 *
 * //        BigInteger bi6 = bi1.divideAndRemainder(bi2);
 * public BigInteger[] divideAndRemainder(BigInteger val)返回两个BigInteger的数组，
 * 其中包含 (this / val)后跟 (this % val) 。
 * 参数:
 * val - 这个BigInteger要被划分的值，其余的是计算的。
 * 结果:
 * 一个两个BigIntegers的数组：商 (this / val)是初始元素，余数 (this % val)是最后一个元素。
 * 异常
 * ArithmeticException - 如果 val为零。
 */
    }
}
