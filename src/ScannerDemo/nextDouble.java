package ScannerDemo;

import java.util.Scanner;

public class nextDouble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Double value: ");

		double value = input.nextDouble();
		System.out.println("Enter Double value is....: " + value);

		input.close();
	}
}
