import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no:");
        int a=sc.nextInt();
        System.out.println("enter the second no:");
        int b=sc.nextInt();
        System.out.println("enter the third no");
        int c=sc.nextInt();

        int sum=a+b+c;
        System.out.println("the addition is:"+sum);
        sc.close();
    }
}