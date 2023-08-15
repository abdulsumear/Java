import java.util.Scanner;

public class HeightConvertorApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double inch = scan.nextDouble();
		HeightConvertor convertor = new HeightConvertor();
		System.out.printf("%.2f",convertor.covertInchToFeet(inch));

	}

}
