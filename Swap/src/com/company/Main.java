package com.company;

import java.util.Scanner;

    //create class
public class Main {
    //use main methode
    public static void main(String[] args) {
    //initialize value
        int a;
        int b;
        int t;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number (a)");
        a = sc.nextInt();
        System.out.println("enter second number (b)");
        b = sc.nextInt();

        //swap value using third variable
        t=a;
        a=b;
        b=t;

        //to check output
        System.out.println("new a is "  +a);
        System.out.println("new b is " +b);

    }
}