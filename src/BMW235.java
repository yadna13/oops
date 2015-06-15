
public class BMW235 {
	
	private String color;
	private String ac;
	private int price;
	
	//Default constructor
	public BMW235(){
		
	}
	
	public BMW235(String color, String ac, int price) {
		this.color = color;
		this.ac = ac;
		this.price = price;
	}
	

	void carStatus(){
		System.out.println("color = "+color);
		System.out.println("ac = "+ac);
		System.out.println("price = "+price);
		
	}
	void brake(){
		System.out.println("_@)@)@@@@@@@@@@@@BMW235 is stopped now........................................");
	}
	
	void run(){
		System.out.println("_@)@)@@@@@@@@@@@@BMW235 is runing........................................");
	}
	
	void gps(){
		System.out.println("_@)@)@@@@@@@@@@@@BMW235 gps is enabled........................................");
	}

}
