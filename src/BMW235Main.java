
public class BMW235Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BMW235 bmw235=new BMW235("blue","yes",23033030);
		bmw235.gps();
		bmw235.run();
		bmw235.brake();
		bmw235.carStatus();
		
		System.out.println("+______________________________________________________________");
		System.out.println("+__________________)@@)@(((((((((((((((((((((((((___________________");
		System.out.println("+______________________________________________________________");
		
		BMW350 bmw350=new BMW350("yellow","yes",40000000); //calling default constructor of this class
		bmw350.gps();
		bmw350.run();
		bmw350.brake();
		bmw350.carStatus();
		bmw350.fly();
		bmw350.back();
		
		//super class reference can point an object of subclass
		BMW235 	bmw;  //bmw is reference of BMW235 type means ,it can point an object of BMW235
		bmw=new BMW350("red","yes",50000000); // upcasting
		bmw.gps();
		bmw.run();
		bmw.brake();
		bmw.carStatus();
	}

}
