import java.io.*;
import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) throws IOException {

		boolean loop = false;
		
		FileInputStream fs=null;
		DataInputStream ds=null;

		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		try {
			 fs = new FileInputStream("q1.txt");
			 ds = new DataInputStream(fs);

			 fos = new FileOutputStream("q2.txt");
			 dos = new DataOutputStream(fos);



			while (!loop) {

				char c = ds.readChar();

				c -= 10;

				dos.writeChar(c);
					

				}
			
		}

		catch (IOException e) {
			loop = true;

		} finally {
			dos.close();
			ds.close();
			System.out.println("Q@#QE#@! SORRY");
		}
	}
}