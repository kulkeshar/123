package basicjava;

public class ClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//function
		int a=20;
		int b=15;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//functions
		
		Calculator(20, 5);
		Calculator(20, 50);
		Calculator(100, 59);
		
		
		
		
		//function without parameter and without return type
		AdditionA();
		AdditionA();
		AdditionA();
		AdditionA();
		
		//function with parameter and without return type
		AdditionB(10,5);
		AdditionB(1,3);
		AdditionB(111,90);
		//function with parameter and with return type
		int w=AdditionC(5,2);
		System.out.println(w);
		System.out.println(w+w);
		System.out.println(w-5);
		System.out.println(w*0.10);
		
		//revision
		SubtractionA();
		SubtractionA();
		SubtractionA();
		SubtractionA();
		
		SubtractionB(100,70);
		SubtractionB(55,40);
		SubtractionB(111,11);
		
		int wl=SubtractionC(300-150);
		System.out.println(wl);
		System.out.println(wl+wl);
		System.out.println(wl-wl);
		System.out.println(wl*0.10);
		
		String w2=SubtractionD(50,40);
		System.out.println(w2);
		

		
	}	
	
	
	 private static int SubtractionC(int i) {
		// TODO Auto-generated method stub
		return 0;
	}


	private static void Calculator(int x,int y) {
		// TODO Auto-generated method stub
		
		//arithmetic operation
				System.out.println(x+y);
				System.out.println(x-y);
				System.out.println(x*y);
				System.out.println(x/y);
				System.out.println(x%y);
	}




	
		//arithmetic operation
	//three besic type of fuction
	//function without parameter and without return type
	
	public static void AdditionA() {
		System.out.println(5+5);
	}
		//function with parameter and without return type
		public static void AdditionB(int x,int y) {
			System.out.println(x+y);
		}
	//function with parameter and with return type
		public static int AdditionC(int x,int y) {
			return x+y;
		}
		//revesion==>
		public static void SubtractionA() {
			System.out.println(10-5);
			
		}
		public static void SubtractionB(int x,int y) {
			System.out.println(x-y);
		}
		public static int  SubtractionC(int x,int y) {
			return x-y;
		}
			public static String SubtractionD(int x,int y) {
				return "Subtraction finished";
			}
		}
	