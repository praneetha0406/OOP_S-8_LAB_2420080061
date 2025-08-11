package lab2;
import java.util.Scanner;
public class sum_of_digits_of_num {
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:\t");
        int Number = sc.nextInt();
        int sum = 0;
        while (Number != 0) {
            sum += Number % 10;   
            Number = Number / 10; 
        }
        System.out.println("Sum of digits is:" + sum);
    }
}
