package com.my.concurrency.chapter2;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/14 14:14
 */
public class TicketWindowRunnable implements Runnable{
    private String name;

    private int index =1 ;

    private final int MAX = 50 ;

    @Override
    public void run() {
        while (index<=MAX){
            System.out.println(Thread.currentThread().getName()+ ":" + (index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
