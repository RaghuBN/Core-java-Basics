package ScannerDemo;

import java.util.Scanner;

public class nextLine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");

		String value = input.nextLine();
		System.out.println("Entered Your Name is...: " + value);

		input.close();
	}
}
