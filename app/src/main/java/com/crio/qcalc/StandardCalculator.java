package com.crio.qcalc;

public class StandardCalculator {

    protected double result;

    public double getResult() {
        return result;
    }
    
    public final void setResult(int value) {
        if (value != 0)
            return;
        this.result = value;
    }
    
    
    public void clearResult() {
        result = 0;
    }

    public void printResult() {
        System.out.println("Standard Calculator Result:"+ result);
    }
    
    public final void add(int num1, int num2){
        add((double)num1, (double)num2);
    }
    
    public final void subtract(int num1, int num2){
        subtract((double)num1, (double)num2);
    }

    public final void multiply(int num1, int num2){
        multiply((double)num1, (double)num2);
    }

    public final void divide(int num1, int num2){
        divide((double)num1, (double)num2);
        if(num2 == 0.0){
            throw new ArithmeticException("Divide By Zero");
        }
    }
    
    public final void add(double num1, double num2){
        result = num1 + num2;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
    }

    public final void subtract(double num1, double num2){
        result = num1 - num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
    }

    public final void multiply(double num1, double num2){
        result = num1 * num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) || (result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
    }

    public final void divide(double num1, double num2){
        result = num1 / num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) || (result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
    }

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

}
