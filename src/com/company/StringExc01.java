package com.company;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周一, 2022/8/1 11:39 GMT+0800
 */
public class StringExc01 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        System.out.println("变更前的字符串: " + s1);
        String s2 = "";
        try {
            s2 = StringTools.reverse(s1, 1, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("变更后新字符串: " + s2);
    }
}

class StringTools{
    public static String reverse(String s, int start, int end){//指定范围逆序字符串方法
        int loops = (end - start + 1) / 2;
        char temp = ' ';
        char[] arr = s.toCharArray();
        //校验输入参数的合理性
        if (!(s != null && start >= 0 && end > start && end < s.length())){
            throw new RuntimeException("输入参数不正确");
        }

        //循环体1：普通方法
        for (int i = 0; i < loops; i++) {
            temp = arr[start + i];
            arr[start  + i] = arr[end  - i];
            arr[end  - i] = temp;
        }

        //循环体2：双指针从两头逼近
//        for (int i = start, j = end; i < j; i++,j--) {
//            temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }


        return String.valueOf(arr);
    }
}