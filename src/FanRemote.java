
//we cannot create instance of interface
//we cannot write constructor inside the interface
//we can create reference of it
//FanRemote ff;
public interface FanRemote {
	 //by default variable in interface are public static and final
	//we have to provide initial value to it for sure.
	 public static final int MAXSPEED=100;
	 public abstract void on();
	 public abstract void off();
}
