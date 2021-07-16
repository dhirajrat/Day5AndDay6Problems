package com.company;

import java.util.Scanner;

import static java.lang.Math.random;

class Utility {
    private static int tailCount = 0;
    private static int headCount = 0;
    private static int n;
    public Utility(int n) {
        this.n = n;
    }
    public static void flipInfo(int k){

        double j;
        n=k;
        for(int i=0;i<n;i++){

            j = Math.random();
            System.out.println(j);
            if(j<0.5){
                tailCount++;
            }
            else {
                headCount++;
            }
        }


        float headPer = (( (float)headCount / n ) * 100);
        float tailPer = (( (float)tailCount / n ) * 100);
        System.out.println("headcount "+headCount+" tailCount "+tailCount+" coin flipped number of times "+n);
        System.out.println("percentage of Head = "+headPer+" Percentage of Tail = "+tailPer);
    }

}

public class FlipCoin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times you wanna flip coin");
        int numTime = sc.nextInt();

        Utility.flipInfo(numTime);
    }
}
