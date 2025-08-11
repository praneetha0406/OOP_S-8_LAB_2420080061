package lab2;
import java.util.Scanner;
public class perfect_no {
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:\t");
        int Number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= Number / 2; i++) {
            if (Number % i == 0) {
                sum += i;
            }
        }

        if (sum == Number) {
            System.out.println(Number + " is a Perfect Number");
        } else {
            System.out.println(Number + " is not a Perfect Number");
        }
    }
}