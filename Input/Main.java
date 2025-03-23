import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		
		// Take input in Java
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your weight: ");
		float weight = sc.nextFloat();
		
		System.out.println("Your age is: ");
		System.out.println(age);
		System.out.println("Your weight is: ");
		System.out.println(weight);
		
		// string input word
		/*
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println(name);
		*/
		
		// String input sentence
		System.out.println("Enter your full name: ");
		String fullName = sc.nextLine();
		System.out.println(fullName);
	}
}