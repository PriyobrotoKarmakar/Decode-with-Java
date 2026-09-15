package com.decodewithpriyo.basics;

public class Calc {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){

        return ((b!=0)?(a/b):a);
    }

}
