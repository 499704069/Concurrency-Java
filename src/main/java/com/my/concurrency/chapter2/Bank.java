package com.my.concurrency.chapter2;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/14 11:47
 */
public class Bank {

    public static void main(String[] args) {

        TicketWindow ticketWindow1 = new TicketWindow("number 1");
        TicketWindow ticketWindow2 = new TicketWindow("number 2");
        TicketWindow ticketWindow3 = new TicketWindow("number 3");

        ticketWindow1.start();
        ticketWindow2.start();
        ticketWindow3.start();
    }
}
