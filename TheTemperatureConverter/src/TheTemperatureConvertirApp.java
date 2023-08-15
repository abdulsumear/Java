import java.util.Scanner;

public class TheTemperatureConvertirApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double f = scan.nextDouble();
		TemperatureConvertor temperatureConvertor = new TemperatureConvertor();
		System.out.printf("%.2f\n",temperatureConvertor.convertFahrenheitToCelsius(f));

	}

}
