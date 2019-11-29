package com.spartaglobal.Arrays_Data_Loops_and_Control;

public class ShoppingLoopsAndArrays {
    private String[] shoppingBasicsArr = {"milk", "Bread", "Rice", "eggs","Chicken"};
    private String[] shoppingNiceToHaves = {"cheese", "shrimp", "lobster", "steak","truffles"};


    public void printShoppingBasics(){
    for (String item:shoppingBasicsArr){
        System.out.println(item);
    }
    }

    public void printShoppingNiceToHaves(){
        for (String shoppingItem:shoppingNiceToHaves){
            System.out.println(shoppingItem);
        }
    }

    public String[] changeBasics(String [] removeItem){
        int count = 0;
        String[] updatedArray = new String [shoppingBasicsArr.length - removeItem.length];

        for (int i = 0; i < removeItem.length; i++){
            System.out.println(removeItem[i]);
            for (int j = 0; j < shoppingBasicsArr.length; j++){
                System.out.println(shoppingBasicsArr[j]);
                }
            }
        return updatedArray;
    }


    }

