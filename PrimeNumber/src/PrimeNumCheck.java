import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) {

        //initialize value
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to check number is prime or not ");
        int value = sc.nextInt();
        // For loop to get count
        for (int a = 1; a <= value; a++) {
            if ( (value % a) == 0) {
                count++;
            }
        }

        //using if else condition
        if(count>2){
            System.out.println("these is not a prime number");
        } else{
            System.out.println("these is Prime number");
        }
    }
}
