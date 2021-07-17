import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any character key on keyboard to START Stopwatch");
        char startKey = sc.next().charAt(0);
        double start = System.currentTimeMillis();
        System.out.println("enter any character key on keyboard to STOP Stopwatch");
        char stopKey = sc.next().charAt(0);
        double stop = System.currentTimeMillis();
        double timeGot = ( (stop - start) / 1000);
        System.out.println("recorded time is "+timeGot+" seconds");
    }
}
