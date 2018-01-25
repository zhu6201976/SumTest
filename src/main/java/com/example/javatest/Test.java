package com.example.javatest;


/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前 20 项之和。
 */
public class Test {

    public static void main(String[] args) {

        float sum = 0f;
        float a = 1f;
        float b = 1f;
        for (int i = 1; i <= 20; i++) {
            float c = a + b;
            sum += c / b;
            a = b;
            b = c;
        }
        System.out.println(sum);
    }


}

