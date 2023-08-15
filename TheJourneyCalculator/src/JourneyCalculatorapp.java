import java.util.Scanner;

public class JourneyCalculatorapp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double speed = scan.nextDouble();
	double time = scan.nextDouble();
	JourneyCalculator distance = new JourneyCalculator();
	System.out.printf("%.2f\n",distance.journeyCalculate(speed,time));
}
}
