
public class ApnaFan implements FanRemote {

	@Override
	public void on() {
		System.out.println("Fan is on now , thank you!");
		
	}

	@Override
	public void off() {
		System.out.println("Fan is  off now , sorry sir!");
	}

}
