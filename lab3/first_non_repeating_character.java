package lab3;
import java.util.Arrays;
import java.util.Scanner;
public class first_non_repeating_character {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] letters = input.toCharArray();
        boolean found = false;
        for (int i = 0; i < letters.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < letters.length; j++) {
                if (letters[i] == letters[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First non-repeating character: " + letters[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No non-repeating character found.");
        }
	}
}
