package exception;
import java.util.Scanner;


public class UseOfThrow {
	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in); //System.in -> reference of keyboard.......
		System.out.println("Enter value of x");
		int x=scan.nextInt();
		
		System.out.println("Enter value of y");
		int y=scan.nextInt();
		int z=0;
		try {
				z=x/y;
				if(z==100){
						ArithmeticException ex=new ArithmeticException("Hey I donot line result 100 , please take care");
						throw ex;
				}
				System.out.println("Computation is done!!!!!!!!!!!!!!");
				System.out.println("Computation is done!!!!!!!!!!!!!!");
				System.out.println("Computation is done!!!!!!!!!!!!!!");
				System.out.println("Computation is done!!!!!!!!!!!!!!");
		}catch(ArithmeticException tt){
			//email..........
			 System.out.println(tt.getMessage());
		}
		catch(Exception tt){
			 System.out.println("Y cannot be zero = "+tt.getMessage());
		}
		System.out.println("Result is .... "+z);

	}
}
