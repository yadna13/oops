package thread;

//creating a task
//MangoThread is not a thread since it does not extend Thread class
class MangoThread implements Runnable{

	@Override
	public void run() {
			for(int i=0;i<300;i++) {
				System.out.println("I am a MangoThread  = "+i);
			}
		}
}

//creating a task
//MangoThread is not a thread since it does not extend Thread class
class AppleThread implements Runnable{

	@Override
	public void run() {
			for(int i=0;i<300;i++) {
				System.out.println("I am a AppleThread  = "+i);
			}
		}
}

public class RunnableDemo {
	
	public static void main(String[] args) {
		MangoThread mangoThread=new MangoThread();
		Thread th1=new Thread(mangoThread);
		th1.start();

		AppleThread appleThread=new AppleThread();
		Thread th2=new Thread(appleThread);
		th2.start();
		
	}

}
