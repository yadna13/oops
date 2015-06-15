
public class BMW350 extends BMW235 {
	
	public BMW350(){
		super();
	}
	
	BMW350(String color,String ac,int price){
		 //calling constructor of super class
		//parameterized constructor of super class
		 super(color,ac,price);
	}
	
	
	
	void fly(){
		System.out.println("_@_@_@_@_BMW350 is flying in the sky@@@@@@@@@@@@@@@");
	}
	
	void back(){
		System.out.println("_@_@_@_@_BMW350 is moving back@@@@@@@@@@@@@@@");
	}
}
 