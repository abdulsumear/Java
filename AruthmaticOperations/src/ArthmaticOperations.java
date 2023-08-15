
public class ArthmaticOperations {

	public static void main(String[] args) {
		System.out.println(subtractNumber(20,5));
		System.out.println(multiplyNumber(4,5));
		System.out.printf("%.2f\n",divideNumber(22,7));
		System.out.println(remainderNumber(10,3));
	}
	public static int subtractNumber(int num1, int num2) {
		return num2-num1;
	}
	public static int multiplyNumber(int num1, int num2) {
		return num1*num2;
	}
	public static double divideNumber(int num1, int num2) {
		return num1/num2;
	}
	public static int remainderNumber(int num1,int num2) {
		return num1%num2;
	}
}
