
public class TitanMain {
		public static void main(String[] args) {
			   Watch watch=new Watch();
			   watch.display();
			   watch.show();
			   
			   TitanWatch titanWatch=new TitanWatch();
			   titanWatch.display();
			   titanWatch.show();
			   titanWatch.ringtone();
			   
			   watch=(Watch)titanWatch; //up casting
			   watch.display();
			   watch.show();
			   
			   TitanWatch tw= (TitanWatch)watch; //down casting
			   tw.display();
			   tw.show();
			   tw.ringtone();
		}
}
