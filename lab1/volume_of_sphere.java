package lab1;
import java.util.Scanner;
public class volume_of_sphere {
	public static void main(String args[])
	{
		int r;
		float pi=3.14f;
		double vol;
		System.out.println("Enter the radius");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		vol=4/3*pi*r*r;
		System.out.println("Volume of sphere is:" +vol);
	}
}
