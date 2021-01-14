package com.my.concurrency.chapter2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zy
 * @version 1.0
 * @date 2021/1/14 14:52
 */
@Data
@AllArgsConstructor
public class TaxCalculator {

    private double salary;
    private double bonus;
    private CalculatorStrategy calculatorStrategy;

    public double calculate(){
        return calculatorStrategy.calculate(getSalary(), getSalary());
    }

}
