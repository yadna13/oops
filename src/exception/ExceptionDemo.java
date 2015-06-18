package exception;
import java.util.Scanner;


public class ExceptionDemo {
	
	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in); //System.in -> reference of keyboard.......
		System.out.println("Enter value of x");
		int x=scan.nextInt();
		
		System.out.println("Enter value of y");
		int y=scan.nextInt();
		int z=0;
		
		z=x/y;
		System.out.println("Computation is done!!!!!!!!!!!!!!");

		System.out.println("Result is .... "+z);

	}
}
