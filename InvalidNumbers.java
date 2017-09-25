
import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number1 = input.nextInt();

		try {

			if (number1 <= 0) {
				throw new InputMismatchException("Incorrect input: A positive integer is required");

			}
			System.out.println("The number entered is " + number1);
			System.out.println("Thank You");
		}

		catch (InputMismatchException e) {
			System.out.println("Try again. (Incorrect input: A positive integer is required)");
		}

	}

}
