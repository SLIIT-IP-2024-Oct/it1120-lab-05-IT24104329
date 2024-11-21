import java.util.Scanner;
public class IT24104329Lab5Q1 {
	public static void main(String[] args) {

	int num1, num2, num3;

	Scanner input = new Scanner(System.in);

	//input
	System.out.print("Enter the frist integer: ");
	num1 = input.nextInt();

	System.out.print("Enter the second integer: ");
	num2 = input.nextInt();

	System.out.print("Enter the third integer: ");
	num3 = input.nextInt();
	
	System.out.println("\nUser entered numbers are : " +num1 + " " +num2 + " " +num3);
	
	//calculation
	if (num1 < num2 && num1 < num3) {
		System.out.println("The Smallest number is: " + num1);
	}else if (num2 < num3 && num2 < num1) {
		System.out.println("The Smallest number is: " + num2);
	}else {
		System.out.println("The Smallest number is: " + num3);
	}
	
	if (num1>num2 && num1>num3) {
		System.out.println("The Largest number is: " + num1);
	}else if (num2>num1 && num2>num3) {
		System.out.println("The Largest number is: " + num2);
	}else {
		System.out.println("The Largest number is: " + num3);
	}
	
	}
}