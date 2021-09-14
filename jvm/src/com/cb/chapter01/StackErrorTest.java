package com.cb.chapter01;

/**
 * 默认打印count:11422 -Xss1024k
 * 设置栈大小-Xss256k count:2458
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
