package math;

public class Factorial {
	
	public static int fact(int num){
		int sum=1;
		for(int i=2;i<=num;i++){
			sum=sum*i;
		}
		return sum;
	}

}
