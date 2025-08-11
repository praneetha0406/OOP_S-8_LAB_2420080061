package lab2;
import java.util.Scanner;
public class gcd_of_two_numbers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Num1:\t");
		int a=sc.nextInt();
		System.out.print("Enter Num2:");
		int b=sc.nextInt();
		 int num1 = a;
	        int num2 = b;
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + a);
	    }
}
