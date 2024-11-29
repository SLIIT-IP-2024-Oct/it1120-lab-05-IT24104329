import java.util.Scanner;
public class IT24104329Lab5Q3 {
	public static void main(String[] args) {

	//variables
	final double ROOM_CHARGE_PER_DAY = 48000.00;
	final double DISCOUNT_FOR_3TO4_DAYS = 0.90;
	final double DISCOUNT_FOR_MORE_THAN_5_DAYS = 0.80;
	int start = 0;
	int end = 0;
	int days = 0;

	//input scanner
	Scanner input = new Scanner(System.in);

	//user input
	System.out.print("Enter Start Date (1-31): ");
	start = input.nextInt();

	System.out.print("Enter End Date (1-31): ");
	end = input.nextInt();

		//calculation
		days = end-start;

		if (days <= 0) {
			System.out.println("Error: Start Date must be less than End Date");
			System.exit(0);
		}

		if (days >= 32) {
			System.out.println("Error: Days must be between 1 and 31");
			System.exit(0);
		}

		if (days < 3) {
			System.out.println("\nRoom Charge Per Day: Rs. " +ROOM_CHARGE_PER_DAY+"/=");
			System.out.println("Number of Days Reserved: " +days);
			System.out.println("Total Amount to be Paid: " +days*ROOM_CHARGE_PER_DAY);

		} else if ( days >=3 && days <=4 ) {
			System.out.println("\nRoom Charge Per Day: Rs. " +ROOM_CHARGE_PER_DAY+"/=");
			System.out.println("Number of Days Reserved: " +days);
			System.out.println("Total Amount to be Paid: " +days*ROOM_CHARGE_PER_DAY *DISCOUNT_FOR_3TO4_DAYS);

		} else if ( days >= 5) {
			System.out.println("\nRoom Charge Per Day: Rs. " +ROOM_CHARGE_PER_DAY+"/=");
			System.out.println("Number of Days Reserved: " +days);
			System.out.println("Total Amount to be Paid: " +days*ROOM_CHARGE_PER_DAY*DISCOUNT_FOR_MORE_THAN_5_DAYS);
		}
	}
}