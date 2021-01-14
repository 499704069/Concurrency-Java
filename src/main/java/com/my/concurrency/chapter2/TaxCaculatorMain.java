package com.my.concurrency.chapter2;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/14 14:56
 */
public class TaxCaculatorMain {

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator(1000, 1000, (s, b) -> {

            return s*1+b*.1;
        });

        System.out.println(taxCalculator.calculate());
    }
}
