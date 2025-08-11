package lab2;
import java.util.Scanner;
public class char_is_alphabet {
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character:");
		char ch =sc.next().charAt(0);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
			System.out.println(ch +"is a alphabet");
		} else {
			System.out.println(ch +"is not a alphabet");
			
		}
		
    }

}
