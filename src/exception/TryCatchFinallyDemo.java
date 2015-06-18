package exception;
import java.util.Scanner;

public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // System.in -> reference of
												// keyboard.......
		System.out.println("Enter value of x");
		int x = scan.nextInt();

		System.out.println("Enter value of y");
		int y = scan.nextInt();
		int z = 0;
		try {
			z = x / y;
			System.out.println("Computation is done!!!!!!!!!!!!!!");
			System.out.println("Computation is done!!!!!!!!!!!!!!");
			System.out.println("Computation is done!!!!!!!!!!!!!!");
			System.out.println("Computation is done!!!!!!!!!!!!!!");
		} catch (ArithmeticException tt) {
			System.out.println("ArithmeticException Y cannot be zero = "
					+ tt.getMessage());
		} catch (Exception tt) {
			System.out.println("Exception Y cannot be zero = "
					+ tt.getMessage());
		} finally {
			System.out.println("__#_#_#_#_#_#_#__#");
		}
		System.out.println("Result is .... " + z);

	}
}
