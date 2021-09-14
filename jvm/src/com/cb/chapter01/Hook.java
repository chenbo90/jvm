package com.cb.chapter01;

public class Hook {
    public static void main(String[] args) {
        System.out.println("---程序开始执行---");
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("执行钩子函数 -- " + 1);
            }
        });

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("执行钩子函数 -- " + 2);
            }
        });

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("执行钩子函数 -- " + 3);
            }
        });

        System.out.println("---程序执行完毕，退出main---");
    }
}
