package basicjava;

public class Switchcase {

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
//switch(expression){
//
//case value1:
//	System.out.println();
	
//case value2:
	System.out.println();
//
//case value3:
System.out.println();
//
//default:
//default statement

//}

//not using break statement
//string city="Las Vegas"
//
//switch(city){
//
//case"Las Vegas"
System.out.println("Nevada");
//
//case"matthews"
System.out.println("North Carolina");
//case"Manhattan"
System.out.println("New York");
//
//case("Phoenix")
System.out.println("Arizona");
//default:
System.out.println("Incorrect City");
//
//}
//Program 2(case with break)

int speed=65;
switch(speed) {
case 45:
System.out.println("slow speed");
break;
case 65:
System.out.println("Normal Speed"); 
case 75:
System.out.println("High Speed");
break;
default:
	System.out.println("No case match");
}


//program 3
String city="LA";
switch(city) {
case "LA":
case"san francisco":
System.out.println("California");
break;
case"West valley city":
case"Sallt lake city":
System.out.println("Utha");
break;
case"Tampa":
case"Mimami":
System.out.println("Florida");
break;
default:
	System.out.println("City dose not match");
	
	}
//Loop--- for and while loop


System.out.println("world");
System.out.println("world");
System.out.println("world");
System.out.println("world");
System.out.println("world");
//finite--5 time toss the coin-- for loop
// keep tossing until the head comes--- while loop
// for
//for(initialization;conditioncheck;increment/decrement){
//statement one
//statement two
//}

//program 4 
for(int i=0;i<5;i++){//1//2//3//4//5
System.out.println(i);//0,1,2,3,4
}
for(int i=0;i<=3;i++) {//1//2//3
System.out.println(i);//0,1,2
}
//1-10
for(int i=1;i<=10;i++) {
	System.out.println(i);
}
//table of two
for(int i=2;i<=20;i=i+2) {
	System.out.println(i);
}
for(int i=2;i<=20;i+=2) {
	System.out.println(i);
}
// table for 10
for(int i=10;i<=100;i=i+10) {
	System.out.println(i);
}
//Table for 20
for(int i=20;i<=200;i=i+20) {
System.out.println(i);	
}
}

}
