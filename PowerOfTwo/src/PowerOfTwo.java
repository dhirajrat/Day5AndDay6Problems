import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        // Taking N th value to find power of two
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a power number to show power of two's Table");
        int power = sc.nextInt();

        // Calculating Power of Two
        int set=1;
        for(int i=1;i<=power;i++){
                set=set*2;
            System.out.println(i+"th power of 2 is : "+set);
        }
    }
}
