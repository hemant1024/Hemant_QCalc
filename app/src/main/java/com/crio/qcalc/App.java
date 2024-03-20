package com.crio.qcalc;
// import com.crio.qcalc.StandardCalculator;

public class App {

    public static void main(String[] args) {
        // System.out.println("Starting QCalc..");
        // StandardCalculator calc = new StandardCalculator();
        // calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
        // calc.printResult();
        
        LogicCalculator calc = new LogicCalculator();
        calc.OR(8, 6);
        calc.printResult();
    }

}
