import java.io.*;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int number = 0;

		System.out.println("Enter numbers you need to add:");
		File fileSum = new File("C:/Users/Ahmed/Desktop/sum.txt");
		FileWriter fw = new FileWriter(fileSum, false);
		PrintWriter p = new PrintWriter(fw);

		while (number != -1) {
			number = sc.nextInt();
			if (number != -1) {
				p.print(number + " ");
			}
		}
		sc.close();
		p.close();

		Scanner inputFile = new Scanner(fileSum);
		int sum = 0;
		while (inputFile.hasNext()) {
			sum += Integer.parseInt(inputFile.next());
		}
		System.out.println("sum is " + sum);
		inputFile.close();
	}
}