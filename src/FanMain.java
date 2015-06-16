
public class FanMain {
	
	public static void main(String[] args) {
		  FanRemote fanref=new ApnaFan();
		  fanref.on();
		  fanref.off();
		  System.out.println(FanRemote.MAXSPEED);
	}

}
