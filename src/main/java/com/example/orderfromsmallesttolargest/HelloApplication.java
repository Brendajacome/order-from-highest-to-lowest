package com.example.orderfromsmallesttolargest;

import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {
        int[] number = {100, 10, 2, 0, -1, 4, 3, 1000};

        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] <number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
        System.out.println("Numbers ordered from largest to smallest:");
        for (int num : number) {
            System.out.print(num + " ");
        }
    }
}