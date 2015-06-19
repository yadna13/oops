package file;

import java.io.File;
import java.util.Scanner;

public class CheckFile {
	
	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in); //System.in -> reference of keyboard.......
		System.out.println("Enter name of the file");
		String fileName=scan.nextLine();
		File file=new File(fileName);
		boolean b=file.exists();
		if(b){
			System.out.println("File is present ..."+file.getName());
		}else{
			System.out.println("File is not present......");
		}
		long size=file.length();
		System.out.println("File size in bytes ...."+(size/1024)+"Kb");
	}

}
