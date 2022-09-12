package basicjava;

public class ClassStringRivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// touperCase() methods 
		String dir="east";
		String x=dir.toUpperCase();
		System.out.println(x);
		System.out.println("He went to"+x);
		
		//toLowerCase()
		
		String x1=dir.toLowerCase();
		System.out.println(x1);
		System.out.println("iam not going to" +x1);
		
		//length
		
		String car="bmw";
		System.out.println(car);
		int x2=car.length();
		System.out.println(x2+x2);
		System.out.println(x2);
		System.out.println(car.length());
		
		
		
		//Method changing 
		String place="NYC";
		int x3=place.toUpperCase().toLowerCase().length();
		//System.out.println(x3);
				
		
				
		//logic behind deta type and methods
		
                 // data type 
			   
			  // introvert      extrovert 
			  //  less social   speaks more 
			  //  calm          loud 
			  //  talks less    speaks more (friendly) 
			   
			   
			  // boolean -- it can hold only two values true and false 
			  // int --- 87,-89,78 
			  // String ---- 'amol' ,'chinmaydeshpande@gmail.com' 
			   
			  // user defined data type 
			  // Person  -----> amol 
			  // property -----> height , weight , age , color , gender 
			  // method - talk() , walk(), sleep() 
			   
			  // Vehicle -- Audi  
			  // property - color , model , type , regNo  
			  // method - start() , stop() 
			   
			  // Bank - ICICI 
			  // property - accNO , addressName , accName , accType 
			  // method - withdrawl()  depoist() 
			   
			  // Data type ---- properties and method 
			  // method - action and return type 
			   
			   
			  // toUpperCase() 
			   
			  String firstName = "amol";  // object is created 
			  String upperCaseFirstName = firstName.toUpperCase(); 
			  System.out.println(upperCaseFirstName); 
			   
			  // toLowerCase() 
			  // action - to convert every character to lowerCase  
			  // return another 
			   
			  String lastName  = "Rao"; 
			  String lowerCaseLastName = lastName.toLowerCase(); 
			  System.out.println(lowerCaseLastName); 
			   
			  //length() 
			  //action - counts number of character in string  
			  //return - int 
			   
			System.out.println("------------------------");
			//program 1
			//joint two String in java
			String first="suna";
			String second="maya";
			System.out.println(first.concat(second));
			System.out.println(second.concat(first));
			
			//program 2 compare two string in java
			String one="why do i feel grumpy";
			String second1="why do i feel grumpy";
			String third="i am not grumpy";
			boolean A=one.equals(second1);
			System.out.println(A);
			boolean V=one.equals(third);
			System.out.println(V);
			
			//program 3
			//escape sequence  in String
			
			String D="i said \"dont cry\"";
			System.out.println(D);
			
			//point to be noted
			//program 4
			String girl=new String("kim");
			String UperCase=girl.toUpperCase();
			System.out.println(UperCase);
			//same way to uper case 
			String S=girl.toUpperCase();
			System.out.println(S);
			
			//program 5 contains
			System.out.println("---------------------------");
			String st="I have BMW which very fast";
			boolean M=st.contains("MW");
			System.out.println(M);
			//
			
		   // java is case  sensitive---means Java and java are different String
		   String car1="bmw mercedes bently lexus";
		   String Q="bently";
		   if(car1.contains(Q)){
			   System.out.println("car is available");
			   
		   }
		   else {
			 System.out.println("car is not available");  
		   }
		
		   // logic behind 
		   //if(comdition){
		   //statement
		   //}
		   //else{
		   //statement
		  // }
		  //follow this logic 
		   System.out.println("-----------------------------------");
		   //join
		   String b1="BAby";
		   String b2="don't wink";
		   String b3="your eyes";
		   String b4=String.join(" ",b1, b2,b3);
		   System.out.println(b4);
		   
		   String b5=String.join("~",b1,b2,b3);
		   System.out.println(b5);
		   //replace
		   String mn="i am going to ktm to ktm next dashin";
		   String bn=mn.replace("i","m");
		   System.out.println(bn);
		   //Replace all
		   String nw=mn.replaceAll("ktm","btm");
		   System.out.println(nw);
		   System.out.println("---------------------------------");
		   
		   
		   //PROGRAM 7
		   //indexof
		   String maya="kavya";
		   int you=maya.indexOf("y");
		   System.out.println(you);
		   int yu=maya.indexOf("s");
		   System.out.println(yu);
				   
		   String cars="bmw mercedes bently lexus";
		   int bb=cars.indexOf("bently");
		   System.out.println(bb);
		   
		   
		   //start with 
		   //endwith
		   
		   String kul="iam a private pilot";
		   boolean kul1=kul.startsWith("i");
		   System.out.println(kul1);
		   
		   boolean kul3=kul.startsWith("iam");
		   System.out.println(kul3);
		   /////
		   boolean kul4=kul.endsWith("t");
		   System.out.println(kul4);
		   boolean kul5=kul.endsWith("i");
		   System.out.println(kul5);
		   
		   
		   // is empty
		   
		   String kul6="";
		   boolean kul7=kul6.isEmpty();
		   System.out.println(kul7);//true
		   
		   //program 9
		   //trim
		   System.out.println("---------------------------------");
		   String kul8="kavya";
		   System.out.println(kul8.length());
		   String kul9=kul8.trim();
		   System.out.println(kul9.length());
		   // not clear with last one
	}		
	
}
