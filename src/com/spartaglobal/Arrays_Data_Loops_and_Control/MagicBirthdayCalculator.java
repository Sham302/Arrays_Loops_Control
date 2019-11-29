package com.spartaglobal.Arrays_Data_Loops_and_Control;

import java.util.Scanner;

public class MagicBirthdayCalculator {
    public float birthday(){
        int num = 7;
        int month;
        int day;

        Scanner input = new Scanner(System.in);
        System.out.println("Input birthday month");
        month = input.nextInt(); //use the userinput
        System.out.println("input day of birth");
        day = input.nextInt();

        float birthday1 = (((((((((((num * month)-1)*13)+ day)+3)*11)- month)-day)/10)+11)); //method of finding out birthday
        birthday1/=100;
        return birthday1; }
    }

