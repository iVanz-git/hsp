package com.company.date_;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周日, 2022/7/31 10:22
 */
public class test1 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss Z");
        String dateString = simpleDateFormat.format(date);

        System.out.println(date);
        System.out.println(dateString);

        DateFormat dateInstance = DateFormat.getDateInstance();




    }
}
