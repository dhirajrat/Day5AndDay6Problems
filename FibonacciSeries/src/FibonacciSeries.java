import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number up-to you want to print  fibonacci series");
        int s = sc.nextInt();
        System.out.println();
        System.out.println("series is");
        for (int i = 1; i < s; i++)
        {
            c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }
    }
}
