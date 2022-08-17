package com.company.warpper_.string_;

import java.math.BigDecimal;

/**
 * @author iVan
 */
public class StringBufferExc02 {
    public static void main(String[] args) {
        double d1 = 123456789.1122;
        System.out.println(FormatTools.f1(d1));

    }
}

class FormatTools {
    public static String f1(double d1) {
        //为避免double类数值精度问题，使用BigDecimal

        //且注意要在构造器中将参数d1从double转化为String类型。下面有两种方法：
//        //方法1,将输入的double转化为string再转为BigDecimal
//        BigDecimal bd1 = new BigDecimal(d1 + "");
//        //方法2,直接使用静态方法BigDecimal.valueOf()，无需要new。
        BigDecimal bd1 = BigDecimal.valueOf(d1);

        //再将BigDecimal转化为String，用toPlainString()方法,避免显示为科学计数法!!!
        String strd1 = bd1.toPlainString();
        //因为原数是double类型，需要提前找到小数点"."所在的String的位置索引
        //dotIndex就是d1转化为string之后的小数点"."的索引 到 d1最后一位小数的位数。
        int dotIndex = strd1.length() - strd1.indexOf(".");
        //将数组strd1转化为StringBuilder类，准备用于调用insert()方法插入",".
        StringBuffer stringBuffer = new StringBuffer(strd1);
        //对stringBuffer，从抹掉小数点开始的倒数第三位开始，插入","，每逢3位插入一次：
        for (int i = stringBuffer.length() - 3 - dotIndex; i > 0; i -= 3) {
            stringBuffer.insert(i, ",");
        }
        //完成插入","之后的stringBuffer，返回 stringBuffer调用toString()方法转化为的String
        return stringBuffer.toString();
    }
}