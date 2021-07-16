import java.util.Scanner;

public class ComputeQuotientAndReminder {
    //use main method
    public static void main(String[] args) {
        int rm,qo;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value to find quotient and remainder");
        // taking INPUT
        int a = sc.nextInt();
        System.out.println("Enter a value by which you have to divide");
        int d = sc.nextInt();
        // Calculating and printing
        qo = a / d;
        System.out.println("Quotient is is = "+qo);
        rm = a % d;
        System.out.println("remainder is = "+rm);

    }
}