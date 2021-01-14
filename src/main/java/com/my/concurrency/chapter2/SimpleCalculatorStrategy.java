package com.my.concurrency.chapter2;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/14 14:50
 */
public class SimpleCalculatorStrategy implements CalculatorStrategy{

    private final double SALARY_RATE = 0.1;
    private final double BONUS_RATE = 0.1;

    @Override
    public double calculate(double salary, double bonus) {
        return salary*SALARY_RATE + bonus *BONUS_RATE;
    }
}
