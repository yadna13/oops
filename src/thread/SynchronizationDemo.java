package thread;

class Mall{
	
	//method is always called by a thread
	public synchronized static void trialRoom(String name){
		System.out.println("_____I am "+name);
		for(int x=1;x<=500;x++) {
		        System.out.println(name+"  - -- -- - -- I am singing a song ......"+x);
		}
	}
}

class Customer extends Thread {
	
	Customer(String cname){
		super(cname);
	}
	
	public void run(){
		System.out.println("I am customer and my name is ..."+super.getName());
		System.out.println("I am inside a MALL ..."+super.getName());
		Mall.trialRoom(super.getName());
	}
}

public class SynchronizationDemo {
	public static void main(String[] args) {
		Customer customer1=new Customer("Dave");
		customer1.start();
		
		Customer customer2=new Customer("Michal");
		customer2.start();
	}

}
