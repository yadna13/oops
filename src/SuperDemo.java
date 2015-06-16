class Mango {
	String color="yellow";
	public void show(){
		System.out.println("This is mango from Mango class and color is = "+color);
	}
}
class ApanaMango extends Mango{
	String color="green";
	public void show(){
		System.out.println("This is mango from ApanaMango class and color is = "+color);
	}
	public void foo(){
			System.out.println("color = "+color);
			System.out.println("color = "+super.color);
			show();
			super.show();
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		ApanaMango apanaMango=new ApanaMango();
		apanaMango.foo();
	}
}
