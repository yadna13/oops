
public class DogMain {
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.bark();
		System.out.println("____________________________________");
		dog=new ChillDog();
		dog.bark();
		System.out.println("____________________________________");
		dog=new MagicDog();
		dog.bark();
		
	}

}
