package basicjava;

public class ClassOops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String 
				// Array 
				// Int
				// Boolean
				// Object 
				
				
				Person kul = new Person();
				// accessing the fields
				System.out.println(kul.height);
				System.out.println(kul.weight);
				System.out.println(kul.age);
				
//				// calling the method on object
				kul.walk();
				kul.talk();
				
				// Person ---- height weigh age , method walk(), talk()
				
				Person samya = new Person();
				// access the fields
				System.out.println(samya.weight);
				System.out.println(samya.height);
				System.out.println(samya.age);
//				// methods 
				samya.walk();
				samya.talk();
				
				
				System.out.println(samya.age);
				samya.age = 22;
				System.out.println(samya.age);
				System.out.println(kul.age);
				
					
				
			}
			
		}

		class Person {
			
		 // property and methods 
		 // fields and method

		// fields
		 int height = 6;
		 int weight =45;
		 int age = 24;
		 
		 // methods 
		 
		 public static void talk() {
			 System.out.println("Hello I am talking");
		 }
		 
		 public static void walk() {
			 System.out.println("I am walking");
		
	}

}
		