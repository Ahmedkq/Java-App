import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		System.out.print("Enter two integers: ");

		try {
			Scanner input = new Scanner(System.in);

			int number1 = input.nextInt();
			int number2 = input.nextInt();

			System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
		}

		catch (ArithmeticException e) {
			System.out.println("Don't Enter a Zero");
		}

		catch (InputMismatchException I) {
			System.out.println("Don't Enter a Latter");
		}

	}
}
