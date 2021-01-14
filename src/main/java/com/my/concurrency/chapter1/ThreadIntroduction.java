package com.my.concurrency.chapter1;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/14 9:31
 */
public class ThreadIntroduction {

    public static void main(String[] args) throws InterruptedException {

        //Thread.sleep(300);
        System.out.println(System.getProperties());
        new Thread(()->{
            System.out.println("ni hao");
        }).start();

        try {
            Thread.sleep(1000 * 300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
