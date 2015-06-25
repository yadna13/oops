package thread;

class  BottleThread extends Thread {
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("BottleThread is running ..... " + i);
		}
	}
}

class MovieThread extends Thread {
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("MovieThread is runing ..... " + i);
		}
	}
}

public class DeamonThreadMain {
	public static void main(String[] args) {
		
		//who calls main method?? main thread
		BottleThread bottleThread=new BottleThread();//10 minutes
		MovieThread movieThread=new MovieThread(); //20 minutes
		bottleThread.setDaemon(true);
		movieThread.setDaemon(true);
		bottleThread.start();
		movieThread.start();
		for(int x=0;x<30;x++){
			System.out.println("_@_@_This is main task@@@ = "+x);//2 minutes
			System.out.println("_@_@_This is main task@@@ = "+x);
		}
			
	}
}
