package doubleTheNumber;

import java.util.Scanner;

public class DoubleTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println(doubleTheNumber(num1));

	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}

}
