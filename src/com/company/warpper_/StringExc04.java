package com.company.warpper_;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周二, 2022/8/2 16:38 GMT+0800
 */
public class StringExc04 {
    public static void main(String[] args) {
        String s1 = "123123asdasdASDASDASD";
//        String s1 = null;
        AA.CharCountFunc(s1);
    }
}

class AA{
    public static void CharCountFunc(String str){
        if (str == null){
            System.out.println("输入不能为null");
            return;
        }
        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z'){
                upperCount++;
            }

            if (c >= 'a' && c <= 'z'){
                lowerCount++;
            }

            if (c >= '0' && c <= '9'){
                numCount++;
            }
        }
        System.out.println("原字符串中的大写字母有:" + upperCount + "个" +
                " 小写字母有:" + lowerCount + "个" +
                " 数字有:" + numCount + "个");
    }
}