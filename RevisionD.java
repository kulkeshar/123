package basicjava;

public class RevisionD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


          //revision
		 int a=21;
		 System.out.println(a);
		 a=50;
		 System.out.println(a);
		 
		 //Artihmetic operation
		 //addition,multiplication,subtraction,divison modulus
		 int x=20;
		 int y=5;
		 System.out.println(x+y);//25
		 System.out.println(x-y);//15
		 System.out.println(x/y);;//4
		 System.out.println(x*y);//100
		 System.out.println(x%y);//0
		 //relational operation(always gives the output in boolean)
		 //<,>,=<,=>,!=,==
		 System.out.println(3<5);
		 System.out.println(4>5);
		 System.out.println(3<=6);
		 System.out.println(4>=7);
		 System.out.println(7!=7);
		 System.out.println(4==4);
		  //logical operators
		 //AND --> &&
		 //OR -->||
		 //NOT-->!!
		 
		 
		 //and operator &&
		 //True+true====>True
		 System.out.println(3==3&&7!=6);
		 //False +true===>false
		 System.out.println(4>7&&5<6);
		 
		 //true +false===>false
		 System.out.println(5==4&&5>=5);
		 // false +false==>false
		 System.out.println(2>3&&5!=5);
		 
		 //OR operator ||
		// True +True ==>True
		 System.out.println(5<6||6==6);
		 //False +True===>True
		 System.out.println(7>9||8<9);
		 //True +False ==>True
		 System.out.println(7!=5||4!=4);
		 //False +false===>False
		 System.out.println(6==4||9!=9);
		 
		 //NOT operators !!
		// True  or false(that's all)
		 System.out.println(2==2);
		 System.out.println(5>7);
		 
		 //Conditional statement
		 //if we have one condition and multiple outcoms 
		// ticket price for different age group
		 //age>15&&age<=20---$5 Discount
		 //age>20&&age<=25----$10 Discount
		//age>30--- > $20 Discount		 
			
		 int age=23;
		 if(age>15&&age<=20) {
			 System.out.println("$5 DIscount"); 
		 }
		 if(age>20&&age<=25) {
			System.out.println("$10 Discount"); 
			
		 }
		 if(age>30) {
			 System.out.println("$20 Discount");
		 }
		 
		 
		 
		 else if(age>15&&age<=20) {
			 System.out.println("$5 DIscount"); 
		 }
		 else if(age>20&&age<=25) {
			System.out.println("$10 Discount"); 
			
		 }
		 else if(age>30) {
			 System.out.println("$20 Discount");
		 }
		 else{
			System.out.println("incorrect age"); 
		 }
		 
		 int age1=60;
		 
		 if(age1>70) {
			 System.out.println("very old");
			 
		 }
		 if(age1>50) {
			 System.out.println("About tobe old");
			 
		 }
		 if(age1>30) {
			 System.out.println("Very young");
		 }
		 
		 //else

		 else if(age1>70) {
			 System.out.println("very old");
			 
		 }
		 else if(age1>50) {
			 System.out.println("About tobe old");
			 
		 }
		 else if(age1>30) {
			 System.out.println("Very young");
		 }
		 else {
			 System.out.println("incrroct entry");
		 }
		 
		 // switch case (without break)
		 
		 String city="Kathmandu";
		 
		 switch (city){
		 case"Kathmandu":
			 System.out.println("BA");
		 case "Dharan":
			 System.out.println("Koshi");
		 case "Chitwan":
			 System.out.println("Narayani");
			 default:
				 System.out.println("incorrect city name");
		 }
		 
		 //switch casec with break
		 
		 switch (city){
		 case"Kathmandu":
			 System.out.println("BA");
			 break;
		 case "Dharan":
			 System.out.println("Koshi");
			 break;
		 case "Chitwan":
			 System.out.println("Narayani");
			 break;
			 default:
				 System.out.println("incorrect city name");
				 }
		 String city2="Biratchowk";
		 switch(city2) {
		 
		 case"Damak":
		 case"kakarvita":
			 System.out.println("jhapa");
			 break;
		 case"Biratnager":
		 case"Biratchowk":
			 System.out.println("Morang");
			 break;
		 case"Dharan":
		 case"Ithari":
			 System.out.println("Sunsari");
			 break;
			 default:
				 System.out.println("incrroct city name");
		 
		 }
	}
}
