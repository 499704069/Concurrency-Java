package com.my.concurrency.chapter1;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/14 9:50
 */
public class TryConcurrency {

    private static void readFromDataBase(){

        try {
            println("Begin read database...");
            Thread.sleep(1000*2L);
            println("end read database...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        println("finished read ...");
    }


    private static void writeFromDataBase(){
        try {
            println("Begin write database...");
            Thread.sleep(1000*2L);
            println("end write database...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        println("finished write ...");

    }


    private static void println(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
       /* readFromDataBase();
        writeFromDataBase();*/

        /*try {
            Thread.sleep(1000 * 300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        Thread t1 = new Thread("t1"){

            @Override
            public void run(){

                readFromDataBase();
                println(Thread.currentThread().getName());
            }
        };

        Thread t2 = new Thread("t2"){

            @Override
            public void run(){
                writeFromDataBase();
                println(Thread.currentThread().getName());

            }
        };

        /*try {
            Thread.sleep(1000 * 3L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        t1.start();
        t2.start();
        System.out.println("main end...");
    }


}
