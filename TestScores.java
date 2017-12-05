import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter how many Scores You want to Calculate? ");
		int score = in.nextInt();

		double user[] = new double[score];

		for (int i = 0; i < score; ++i) {
			System.out.print("Enter Score: ");
			user[i] = in.nextInt();

			if (user[i] > 100 || user[i] < 0) {
				throw new IllegalArgumentException("Please Enter a score Between 0 and 100");

			}
		}

		Scores scores = new Scores(user);
		System.out.println("Average: " + scores.average());

	}

}