import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] arg){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();

        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println("Factor : " +i);
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println("factors : "+number);
        }
    }
}
