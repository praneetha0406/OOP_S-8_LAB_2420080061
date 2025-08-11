package lab1;
import java.util.Scanner;
public class temperature_conversion {
	 public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter temperature in Fahrenheit: ");
	     double temperatureFahrenheit = sc.nextDouble();
	     double temperatureCelsius = (5.0 / 9) * (temperatureFahrenheit - 32);
	     System.out.printf("Temperature in Celsius: %.2f °C\n", temperatureCelsius);
         sc.close();	    		 
	 }
}
