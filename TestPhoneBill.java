import java.util.Scanner;

public class TestPhoneBill {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double monthlyRate;
		int minutes;
		double callRate;

		System.out.println("This program will calculate your phone bill for you");
		System.out.println("What is your call rate?");
		callRate = scan.nextDouble();

		System.out.println("What is your monthly rate?");
		monthlyRate = scan.nextDouble();
		LongDistanceBill a = new LongDistanceBill(monthlyRate, callRate);

		System.out.println("How many minutes did you talk?");
		minutes = scan.nextInt();
		System.out.println("Your monthly bill is $" + a.CalculateBill(minutes));

	}
}