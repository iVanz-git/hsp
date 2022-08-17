package com.company.date_;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


/**
 * @Author iVan@admin
 * @Version
 * @Date 周日, 2022/7/31 12:18 GMT+0800
 */
public class calendar_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Date date = new Date();
        System.out.println(date);

        Date d2 = Date.from(now);
        System.out.println(d2);

    }
}


