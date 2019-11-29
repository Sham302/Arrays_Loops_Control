package com.spartaglobal.Arrays_Data_Loops_and_Control;

public class RecursionExample {

    public int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
