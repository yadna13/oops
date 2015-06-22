package thread;

class DogThread extends Thread {
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("DOG THREAD BARKS ..... " + i);
		}
	}
}

class CatThread extends Thread {
	public void run() {
		for (int i = 0; i < 200; i++) {
			System.out.println("CAT THREAD MEW MEW ..... " + i);
		}
	}
}

public class ThreadMain {
	public static void main(String[] args) {
		
			DogThread dogThread=new DogThread();
			CatThread catThread=new CatThread();
			dogThread.start();
			catThread.start();
			
	}
}
