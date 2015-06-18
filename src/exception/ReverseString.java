package exception;
import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in); //System.in -> reference of keyboard.......
		System.out.println("Enter your name please");
		String str=scan.nextLine();
		int len=str.length();
		String result="";
		for(int x=len-1;x>=0;x--){
			 char ch= str.charAt(x);
			 result=result+ch;
		}
		
		System.out.println(result);
	}

}
