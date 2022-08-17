package com.company.warpper_.string_;

/**
 * @author iVan
 */
public class test2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer("dasd");
        StringBuffer qwer = stringBuffer1.append("qwer");

        System.out.println(qwer);

        String s = qwer.toString();
        System.out.println(s);

        System.out.println("qwer的类:" + qwer.getClass());
        System.out.println("s的类:" + s.getClass());

        String s2 = s + "zxcv";
        System.out.println(s2);

        StringBuffer ss2= new StringBuffer(s2);

        System.out.println("-------------");
        System.out.println("ss2的原值为："+ ss2.toString() + " c索引为:" + ss2.indexOf("c"));
        System.out.println("-------------");

        StringBuffer delete1 = ss2.delete(3, 8);
        System.out.println(delete1);

//        double d1 = 123.123;
//        String s1 = (int)d1 + "";
//        StringBuffer sb1 = new StringBuffer(s1);
//        System.out.println(sb1);
    }
}
