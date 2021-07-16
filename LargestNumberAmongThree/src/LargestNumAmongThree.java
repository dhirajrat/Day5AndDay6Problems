import java.util.Scanner;

public class LargestNumAmongThree {
    public static void main(String[] arg){
        int a,b,c,largest,temp;
        //Taking Input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        a= sc.nextInt();
        System.out.println("enter second number");
        b= sc.nextInt();
        System.out.println("enter third number");
        c= sc.nextInt();
        // Checking Largest number
        temp=  a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println("the largest number is = "+ largest);
    }
}
