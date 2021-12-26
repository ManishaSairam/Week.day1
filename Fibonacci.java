package assignment1;

public class Fibonacci {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		
		int num3;
		// generate 8 numbers
		for(int i=1; i<=10; i++) {
			num3= num1+ num2;
			System.out.println(num3);
			
			//swap the numbers
			num1=num2;
			num2=num3;
	
			
		}
		
	}
	

}
