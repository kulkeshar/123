package basicjava;

public class Rivisionclassmethodbykranti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		calculator(10,10);
		calculator(10,2);
		calculator(10,4);
		calculator(10,7);
		System.out.println("--------------------------");
		addA();
		addA();
		addA();
		addA();
		System.out.println("-----------------------------");
		//with parameter and with out reurn type
		addB(5,7);
		addB(5,4);
		addB(5,2);
		addB(5,1);
		//subtraction
		System.out.println("------------------------------------"); 
		subC(50,5);
		subC(50,10);
		subC(50,15);
		subC(50,20);
		//with return type
		System.out.println("---------------------------------");
		int E=addG(20,4);
		System.out.println(E);
		System.out.println(E+E);
		System.out.println(E-E);
		System.out.println(E*0.10);
		
		
	}
	
	public static void calculator(int x,int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
	}	
	//function without parameter and with return type
		public static void addA() {
			System.out.println(5+5);
		}
		//Function with parameter and without return type
		public static void addB(int x,int y) {
			System.out.println(x+y);
		}
		//function with parameter and without return type 
		public static void subC(int x,int y) {
			System.out.println(x-y);
			
		}
		//function with parameter and with return type
		public static int addG(int x,int y) {
			return x+y;
		}
		public static String addM(int x,int y) {
			System.out.println(x+y);
			return"misson sucssful";
		}
	}