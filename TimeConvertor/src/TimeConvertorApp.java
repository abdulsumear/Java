
import java.util.Scanner;

public class TimeConvertorApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double minute = scan.nextDouble();
	TimeConvertor convertor= new TimeConvertor();
	System.out.printf("%.2f",convertor.convertMinutesToHours(minute));
	scan.close();
}
}
