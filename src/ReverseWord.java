import java.util.Scanner;


public class ReverseWord {

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in); //System.in -> reference of keyboard.......
		System.out.println("Enter your name please");
		String str=scan.nextLine();
	  
		//I like java programming
		String arr[]=str.split(" ");
		int len=arr.length;
		for(int x=len-1;x>=0;x--){
			System.out.print(arr[x]+"   ");
		}
	}

}
