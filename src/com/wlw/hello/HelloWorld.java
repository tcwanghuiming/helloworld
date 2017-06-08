package com.wlw.hello;


import java.util.Random;

/**
 * Created by whm on 2017/2/14.
 */
public class HelloWorld {
    private String s="1";
    Random r = new Random();
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
//配置1231231
    public static void main(String[] args) {
        String ss = "hello world!";
        System.out.println(ss);
    }
}