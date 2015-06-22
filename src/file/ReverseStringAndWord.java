package file;

import java.util.Scanner;

public class ReverseStringAndWord {
	
	private static String reverseString(String input){
		     int len=input.length();
		     String result="";
		     for(int i=len-1;i>=0;i--){
		    	 result=result+input.charAt(i);
		     }
		     return result;
	}
	
	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter your String please");
		  String str=scan.nextLine();
		  String aap[]=str.split("[ ]+");
		  for(int len=aap.length-1;len>=0;len--){
			        String st=aap[len];
			        String upoutput=reverseString(st);
			        System.out.println(upoutput);
			        /*StringBuilder sb=new StringBuilder(st);
			        System.out.println(sb.reverse().toString());*/
		  }
		  
		  
		  
	}

}
