package com.company;


import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        //initialize string value
        char ch;
        // use scanner that is user input
        System.out.println("enter a character");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);

        //use if else condition

        if(ch=='a' ||  ch =='e' ||  ch=='i' ||  ch =='o' ||  ch=='u')        {
            System.out.println("these is vowel");
        }else{
            System.out.println("these is consonant");
        }
    }
}
