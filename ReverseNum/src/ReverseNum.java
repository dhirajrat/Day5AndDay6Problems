import java.util.Scanner;

public class ReverseNum {
        //create class
        public static void main(String[] args) {
            //initialise no
            int no,rem,rev=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to reverse");
            no = sc.nextInt();
            //use while loop
            while(no!=0){
                rem=no%10;
                rev=rev*10+rem;
                no=no/10;
            }
            System.out.println("REVERSE numbers are "+rev);
        }
}
