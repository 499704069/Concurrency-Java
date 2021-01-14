package com.my.concurrency.chapter2;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/14 14:49
 */
@FunctionalInterface
public interface CalculatorStrategy {
    double calculate(double salary,double bonus);
}
