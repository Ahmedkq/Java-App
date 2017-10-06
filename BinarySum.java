import java.io.*;
import java.util.Scanner;

class BinarySum {

	public static void main(String[] args) throws IOException {

		int numbers = 0;

		System.out.println("Enter numbers you need to add:");
		FileOutputStream fos = new FileOutputStream("C:/Users/Ahmed/Desktop/Bs.dat");
		DataOutputStream os = new DataOutputStream(fos);

		Scanner sc = new Scanner(System.in);

		while (numbers != -1) {
			numbers = sc.nextInt();
			if (numbers == -1)
				break;
			os.writeInt(numbers);
		}

		os.close();

		FileInputStream fs = new FileInputStream("C:/Users/Ahmed/Desktop/Bs.dat");
		DataInputStream ds = new DataInputStream(fs);

		int sum = 0;

		while ((numbers = ds.read()) != -1) {

			sum += ds.read();

		}
		System.out.print(sum + " ");
		ds.close();

	}
}