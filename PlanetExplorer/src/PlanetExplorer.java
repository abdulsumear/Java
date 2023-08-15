import java.util.Scanner;

public class PlanetExplorer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		PlanetExplorerAPp explorer= new PlanetExplorerAPp();
		System.out.printf("%.2f",explorer.surfaceArea(r));
		scan.close();
	}
}
