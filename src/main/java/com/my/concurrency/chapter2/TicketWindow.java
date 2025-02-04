package com.my.concurrency.chapter2;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/14 11:44
 */
public class TicketWindow extends Thread{

    private final String name;

    private final static int MAX = 50 ;

    private static int index = 1;

    public TicketWindow(String name){
        this.name = name;
    }

    @Override
    public void run(){
          while (index<=MAX){
              System.out.println(name+ ":" + (index++));
          }
    }
}
