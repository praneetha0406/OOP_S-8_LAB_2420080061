package lab3;
import java.util.Arrays;
import java.util.Scanner;
public class anagram {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter string 1:");
		 String str1 = sc.nextLine();
		 System.out.println("Enter string 2:");
		 String str2 = sc.nextLine();
		 int len1 = str1.length();
		 int len2 = str2.length();
		 if (len1  == len2) {
			 str1 = str1.toLowerCase();
			 str2 = str2.toLowerCase();
			 char [] arr1 = str1.toCharArray();
			 char [] arr2 = str2.toCharArray();
			 Arrays.sort(arr1);
			 Arrays.sort(arr2);
			 if (Arrays.equals(arr1,arr2)) {
				 System.out.println("Both strings are anagrams");
			 } else {
				 System.out.println("Both strings are not anagrams");
			 }
		 }
	 }
}
