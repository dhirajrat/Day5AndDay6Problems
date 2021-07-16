import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        // user input method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check the number is odd or even ");
        int value = sc.nextInt();
        // Check condition
        if (value % 2 == 0)
            {
                System.out.print("these is even number");
            }
        else
            {
                System.out.println("these is odd number");
            }
    }
}
