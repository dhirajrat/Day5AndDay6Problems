package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //initialize value
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int year=sc.nextInt();

        //use if else conditions
        if (year % 4 == 0 )
        {
            System.out.println("leap year");
        }
        else
            {
                System.out.println("not a leap year");
            }
    }
}
