import java.util.Scanner;

public class HalveItApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double number = scan.nextDouble();
	Halveit h = new Halveit();
	System.out.printf("%.2f",h.halveTheNumber(number));
	scan.close();
	}
}
