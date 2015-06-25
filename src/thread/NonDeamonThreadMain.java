package thread;

class AThread extends Thread {
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("AThread is running ..... " + i);
		}
	}
}

class BThread extends Thread {
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("BThread is runing ..... " + i);
		}
	}
}

public class NonDeamonThreadMain {
	public static void main(String[] args) {
		
		//who calls main method?? main thread
		AThread aThread=new AThread();//10 minutes
		BThread bThread=new BThread(); //20 minutes
		aThread.start();
		bThread.start();
		for(int x=0;x<30;x++){
			System.out.println("_@_@_This is main task@@@ = "+x);//2 minutes
			System.out.println("_@_@_This is main task@@@ = "+x);
		}
			
	}
}
