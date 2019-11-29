package com.spartaglobal.Arrays_Data_Loops_and_Control;

import java.util.Arrays;

public class ArraysExamples {
    private int[] short_fib= new int[5]; //member variable
    private int[] long_fib ={0,1,2,3,4,5,6};
    private String[] names = {"Jamie", "Jon", "Joffrey"};

    private int[] oddNums = { 1,3,5,7,9};
    private int[] evenNums = {2,4,6,8,10};
    private int [][] twoDArray = new int[5][5];

    public ArraysExamples(){   // constructor method, runs when instantiating object

        setShort_fib();
        setTwoDArray();  // setter to change value
    }

    public void setTwoDArray(){
        twoDArray[0] [0] = 0;
        twoDArray[0] [1] = 1;
        twoDArray[0] [2] = 2;
        twoDArray[1] [0] = 2;
        twoDArray[1] [1] = 1;
        twoDArray[1] [2] = 0;

    }

    public void getTwoDArray(int arrayRef, int arrayObjectRef){
        System.out.println(twoDArray[arrayRef] [arrayObjectRef]);

    }

    public void setShort_fib(){ //
        short_fib[0] = 0;
        short_fib[1] = 1;
        short_fib[2] = 1;

    }

    public void arrayCopy(){ // defining array
        int[] combArray = Arrays.copyOf(evenNums,10); //copy of public static
        System.arraycopy(oddNums, 0, combArray, 5,5);

        for (int value : combArray) { // for each loop
            System.out.println(value);
        }
    }


    public void getShort_fib(int arrayRef){
        System.out.println(short_fib[arrayRef]);
    }

    public int[] getLong_fib(int arrayIndex) {
        return long_fib;
    }
    public String[] getNames() {return names;}
}
