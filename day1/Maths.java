package week1.day1;

public class Maths {
	
	private int add(int a,int b) {
	    return a+b;
	}
	
	private int multiply(int a,int b) {
		return a*b;
	}
	
	private int divide(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		 
		
		Maths mat=new Maths();
		int add = mat.add(10,20);
		System.out.println(add);
		
		int multiply = mat.multiply(20, 15);
		System.out.println(multiply);
		
		int divide = mat.divide(80,10);
		System.out.println(divide);
		
		
	}
}
