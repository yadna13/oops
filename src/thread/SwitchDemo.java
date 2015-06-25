package thread;

import java.util.Scanner;

public class SwitchDemo {
	
	void checkGrade(int x){
		
		if(x>=60 && x<70){
			
		}else if(x>=70 && x<80){
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number please");
		int num=scan.nextInt();
		SwitchDemo demo=new SwitchDemo();
		demo.checkGrade(num);
	}

}
