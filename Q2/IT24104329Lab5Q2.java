import java.util.Scanner; 
public class IT24104329Lab5Q2 { 

	public static void main(String[] args) { 

	//variables 
	int num = 0; 

  	//input scanner 
	Scanner input = new Scanner(System.in); 

	//user input 
	System.out.print("Enter the number of new members introduced: "); 
	num = input.nextInt(); 

		switch (num) { 
		case 0: System.out.println("\nNo Prize"); 
		break; 

		case 1: System.out.println("\nPrise is a : Pen");
		break;

		case 2: System.out.println("\nPrise is a : Umbrella");
		break;

		case 3: System.out.println("\nPrise is a : Bag");
		break;

		case 4: System.out.println("\nPrise is a : Travelling Chair");
		break;

		case 5: System.out.println("\nPrise is a : Headphone");
		break;

		default: if (num >= 5) {
			System.out.println("\nPrise is a : Headphone");
			} else {
			System.out.println("\nInput must be a number 0 or greater");
			}
		}
	}
}