package com.my.concurrency.chapter1;

/**
 *  模板方法设计模式
 * @author zy
 * @version 1.0
 * @date 2021/1/14 11:11
 */
public class TemplateMethod {

    public final void print(String message){
        System.out.println("###########");
        wrapPrint(message);
        System.out.println("###########");
    }

    protected void wrapPrint(String message){

    }

    public static void main(String[] args) {

        TemplateMethod templateMethod = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("***" + message + " ***");
            }
        };

        templateMethod.print("ni hao");
    }
}
