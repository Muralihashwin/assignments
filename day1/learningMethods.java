package week1.day1;

public class learningMethods {
	
	private Object d;

	public void name() {  
		System.out.println("Hi");
		
	}
		
		private int add(int a, int b) {
			return a+b;
		}
		
		
		//default 
		void sub(int a){
			System.out.println(a);
			
		}
		 
		public void data (int age , String name) {
			System.out.println(age+"\n"+name);
			
		}
		
		public static void main(String[] args) {
			
			//step1
			//ClassName object=new ClassName();
			
			learningMethods lm=new learningMethods();
			
			lm.name();
			// if you using returntype
			//ctrl+2-1
			int add =lm.add(10, 19);  
			System.out.println(add);
			
			//step2
			System.out.println(lm.add(10, 19));
			lm.sub(5);
			lm.data(29,"Murali");
			
			
			
		
			
			
		}
			
		}
		
		
		
		
		
		
	


 