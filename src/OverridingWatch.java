
public class OverridingWatch {
	
	public static void main(String[] args) {
			 Watch watch=new Watch();
			 watch.show();
			 watch.display();
			 
			 watch=new TitanWatch();
			 watch.show();
			 watch.display();
	}

}
