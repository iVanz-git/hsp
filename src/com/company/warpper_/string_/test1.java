package com.company.warpper_.string_;




/**
 * @author iVan
 */
public class test1 {
    public static void main(String[] args) {
        String asdasd = new String("asdasd");
        String intern = asdasd.intern();
        System.out.println(asdasd == intern);


        /**
         * compareTo方法源码：
         *     public int compareTo(String anotherString) {
         *         int len1 = value.length;// 6
         *         int len2 = anotherString.value.length;//8
         *         int lim = Math.min(len1, len2);//6
         *         char v1[] = value;//[h, a, h, a, h, a]
         *         char v2[] = anotherString.value;[e, q, e, q, e, q, e, q]
         *
         *         int k = 0;
         *         while (k < lim) {// lim == 6
         *             char c1 = v1[k];//h
         *             char c2 = v2[k];//e
         *             if (c1 != c2) {//T
         *                 return c1 - c2;// h(104) - e(101) == 3;
         *             }
         *             k++;
         *         }
         *         return len1 - len2;
         *     }         *
         */
//        @NotNull
        String s1 = "hahaha";
        String s2 = "hahahaeq";
        String s3 = null;
//        System.out.println(s1.compareTo(s2));//-2

        System.out.println(test1.f1(s3));
    }

    public static String f1( String s){
//        System.out.println("f1方法被调用");
        return s + "asd";
    }
}
