package exception;

import java.util.Scanner;

public class CheckedDemo {
	
	public static void main(String[] args) {
		   try {
			Class.forName("com.jdbc.Ahahah");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
