package com.company;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周二, 2022/8/2 11:40 GMT+0800
 */
public class StringExc03 {
    public static void main(String[] args) {
//        String s1 = "Willian Jefferson Clinton";
//        String s2 = NameFormat.nameFormatFun1(s1);
//        System.out.println(s2);

        String s3 = "Zhang Yi Fan";
        NameFormat.nameFormatFunc2(s3);



    }
}

class NameFormat{
    /**
     *   此方法用来修改人名为指定格式
     *   实例:输入"Willian Jefferson Clinton"
     *   输出"Clinton, Willian .J"
     */

    //方法一:按索引分3段拼接
    public static String nameFormatFun1(String str) {
        //输入校验 非空判断
        if (str == null){
            System.out.println("输入不能为null!");
            return "0";
        }

        //思路：三段式拼接，先准备第一段内容
        //第一段为 寻找字符串最后一个空格的索引，返回该空格之后所有字符串
        int lastSpaceIndex = str.lastIndexOf(" ");
        String strStartPart = str.substring(lastSpaceIndex + 1, str.length());

        //第二段为 寻找原字符串从头开始到第一个空格前面一个字符的索引，然后返回
        int firstSpaceIndex = str.indexOf(" ");
        String strMiddlePart = str.substring(0, firstSpaceIndex);

        //第三段为 寻找原字符串第一个空格之后的 字符 的索引位置，并返回该字符
        //firstSpaceIndex上面已经定义，直接复用
        String strLastPart = str.substring(firstSpaceIndex + 1, firstSpaceIndex + 2);

        //最终3段字符串拼接为一个新字符串，然后返回该新字符串
        String strOut = strStartPart + ", " + strMiddlePart + " ." + strLastPart;
        return strOut;
    }

    //方法2：使用string.spilt()方法将原字符串拆分为字符串数组，再分别组合数组顺序
    public static void nameFormatFunc2(String str) {
        //输入非空校验
        if (str == null){
            System.out.println("输入不能为null!");
            return;
        }

        String[] names = str.split(" ");
        //输入校验，是否为3份
        if (names.length != 3) {
            System.out.println("输入有误，请重新输入!");
            return;
        }
        String strOut = String.format("%s, %s .%s", names[2], names[0], names[1].toCharArray()[0]);
        System.out.println(strOut);
    }
}
