package file;

import java.io.File;
import java.io.PrintStream;

public class SystemOutFile {
	public static void main(String[] args) {
		///PrintStream ps=System.out;
		try {
		 
		 File file=new File("D:/jadoo.txt");
		 PrintStream pst=new PrintStream(file);
		 System.setOut(pst);
		 
		 System.out.println("))#)#)#)#)I AM NAGENDRA and LEARNNG JAVA )@@@@@@@@@@@@");
		 System.out.println("))#)#)#)#)I AM NAGENDRA and LEARNNG JAVA )@@@@@@@@@@@@");
		 System.out.println("))#)#)#)#)I AM NAGENDRA and LEARNNG JAVA )@@@@@@@@@@@@");
		 System.out.println("))#)#)#)#)I AM NAGENDRA and LEARNNG JAVA )@@@@@@@@@@@@");
		 System.out.println("))#)#)#)#)I AM NAGENDRA and LEARNNG JAVA )@@@@@@@@@@@@");
		 System.out.println("))#)#)#)#)I AM NAGENDRA and LEARNNG JAVA )@@@@@@@@@@@@");
		 System.out.println("))#)#)#)#)I AM NAGENDRA and LEARNNG JAVA )@@@@@@@@@@@@");
		}catch(Exception exe){
			exe.printStackTrace();
		}
		
		
	}

}
