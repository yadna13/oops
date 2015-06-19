package file;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderDemo {
		public static void main(String[] args) {
			Scanner scan=new  Scanner(System.in); //System.in -> reference of keyboard.......
			System.out.println("Enter name of the file");
			String fileName=scan.nextLine();
			File file=new File(fileName);
			try {
				   FileReader fileReader=new FileReader(file);
				   int ch;
				  while( (ch=fileReader.read())!=-1){
					    System.out.print((char)ch);
					    Thread.sleep(10);
				  }
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
}
