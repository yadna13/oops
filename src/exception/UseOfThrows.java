package exception;
import java.util.Scanner;

public class UseOfThrows {

	static int divide(int num1, int num2) throws ArithmeticException {
		int z = num1 / num2;
		if (z == 100) {
			ArithmeticException ex = new ArithmeticException(
					"Hey I donot line result 100 , please take care");
			throw ex;
		}
		System.out.println("Computation is done!!!!!!!!!!!!!!");
		return z;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // System.in -> reference of
												// keyboard.......
		System.out.println("Enter value of x");
		int x = scan.nextInt();

		System.out.println("Enter value of y");
		int y = scan.nextInt();
		int z = 0;
		try {
			z = divide(x, y);
		} catch (ArithmeticException tt) {
			System.out.println( tt.getMessage());
		}
		System.out.println("Result is .... " + z);

	}
}