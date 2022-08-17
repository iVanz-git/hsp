package com.company;

/**
 * @Author iVan@admin
 * @Version
 * @Date 周一, 2022/8/1 21:38 GMT+0800
 */
public class StringExc02 {
    public static void main(String[] args) {
        UserInfo userInfo;
        try {
            userInfo = new UserInfo("3san", "211556", "qwe@123.com");
            System.out.println("注册成功!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(userInfo.toString());
    }
}

class UserInfo {
    private String name;
    private String pwd;
    private String emailAdr;

    public UserInfo() {
        this("", "", "");
    }

    public UserInfo(String name, String pwd, String emailAdr) {

        if (name.length() < 2 || name.length() > 4) {//校验用户名
            throw new RuntimeException("用户名长度有误！当前长度为:" + name.length() + "位,请设置为2-4位");
        } else {
            this.name = name;
        }

        char[] pwrArr = pwd.toCharArray();
        if (pwd.length() != 6) {//校验密码
            throw new RuntimeException("密码设置长度有误");
        } else {
            for (int i = 0; i < pwrArr.length; i++) {
                if (!(pwrArr[i] >= '0' && pwrArr[i] <= '9')) {
                    throw new RuntimeException("密码设置类型有误!");
                }
            }
        }
        this.pwd = pwd;
        //开始校验email地址
        //第一个判断，确认"@"和"."的第一次出现的索引==最后一此出现的索引，即：均只出现一次。
        if (!(emailAdr.indexOf("@") == emailAdr.lastIndexOf("@") && emailAdr.indexOf(".") == emailAdr.lastIndexOf("."))){
            throw new RuntimeException("email地址设置有误!-1");
        }
        //第二个判断，确认"@"和"."必然出现，且"@"要在"."前面
        if (!(emailAdr.contains("@") && emailAdr.contains(".") && emailAdr.indexOf("@") < emailAdr.indexOf("."))) {
            throw new RuntimeException("email地址设置有误!-2");
        }
        this.emailAdr = emailAdr;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", emailAdr='" + emailAdr + '\'' +
                '}';
    }
}