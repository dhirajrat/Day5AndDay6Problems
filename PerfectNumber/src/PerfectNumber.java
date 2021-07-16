import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check");
        n= sc.nextInt();
        int sum = 0;
        boolean b;
        for (int i = 1; i < n; i++) {
            if (i == 0)
            sum = sum + i;
        }
        if (n == sum) {
            b = true;
        }
        if(b=true)
        {
            System.out.println("its perfect number");
        }
        else
            {
                System.out.println("its not");
            }
    }
}