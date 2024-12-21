import java.util.Scanner;

public class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no:");
        int a=sc.nextInt();
        System.out.println("enter the second no:");
        int b=sc.nextInt();
        System.out.println("enter the third no");
        int c=sc.nextInt();

        int sum=a+b+c;
		int avg=sum/3;
        System.out.println("the addition is:"+sum);
        System.out.println("the average is "+avg);
		sc.close();
    }
}