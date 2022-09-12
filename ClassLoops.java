package basicjava;

public class ClassLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Loops
		//1)for loop
		//2)while loop
		//3)do while loop
		
		
		
		//for loop
		
		//for(intialization;conditioncheck;incerement/decrement){
		//statement
		//}
		
		//progrem 1(print "wow" five times)
		for(int i=0;i<5;i++) {//1//2//3//4//5
			System.out.println("wow");
		}
		
		System.out.println("program--1b");;
		for(int i=0;i<6;i=i+2) {
			System.out.println("wow");
		}
		
		//program 2
		
		System.out.println("print the number from 5 to 15");
		for(int i=5;i<=15;i=i+1) {
		System.out.println(i);//5/6/7/8/9/10/11/12/13/14/15
			}
		
		//program 3
		System.out.println("table of 10");
		for(int i=10;i<=100;i=i+10) {
			System.out.println(i);
		}
		
		//progrem 4
		System.out.println("sum all of number from 1 to 5");
		int sum=0;
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			//0+1===>1
			//1+2===>3
			//3+3==>6
			//6+4===10
			//10+5===.15
			
			System.out.println("sum");
		}
		
		//program 4
		
		System.out.println("print the value from 5 to 1");
		for(int i=5;i>=1;i=i-1) {
			System.out.println(i);
		}
		
		//tables of 10 (reverse)
		for(int i=50;i>=5;i=i-5) {
		System.out.println(i);	
		}
		
		//break statement with for--  loop
		
		//program 5
		
		System.out.println("for loop with break statment");
		
		
		for(int i=0;i<5;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		for(int i=10;i>=0;i--) {//9/8/7/6/5
			if(i==5) {
			break;	
			}
			System.out.println(i);//10/9/8/7/6
		}
		
		//program 6
		
		System.out.println("continue statement with loop");
		
		for(int i=0;i<5;i++) {
		if(i==3) {
			continue;
		}	
		System.out.println(i);//0/1/2/4
		}
		
		for(int i=5;i>=1;i--) {
			if(i==3) {
				continue;
			}
			System.out.println(i);//5/4/2/1
		}
		
		
		//whilw loop
		//intialization
		
		//while (condition){
		//statement one
		//statement two
		//increment/decrement
		//}
		
		//program 7 print wow 5 times
		int i1=0;
		while(i1<5) {
		System.out.println("wow");
		i1++;
		} 
		
		//program 8 print from 5 to 10
		
		int i2=5;
		
		while(i2<=10) {
			System.out.println(i2);
			i2=i2+1;
		}
		
		
		//program 9 tabale of 5
		int i3=5;
		while(i3<=50) {
			System.out.println(i3);
			i3=i3+5;
		}
		
		
		
		//program 10 print 10to 5
		int i4=10;
		while(i4>=5) {
			System.out.println(i4);
			i4--;
		}
		
		
		//program 11 table of 7 in reverse
		int i5=70;
		while(i5>=7) {
			System.out.println(i5);
			i5-=7;
		}
		
		
		//program 12
		//while loop with break statement
		int i6=0;
		while(i6<5) {
			if(i6==2) {
				break;
			}
			System.out.println(i6);//0/1
			i6++;
		}
		
		int i7=5;
		while(i7>=0) {
			System.out.println(i7);//5,4,3
			if(i7==3) {
				break;
			}
			i7--;//4/3
		}
		
		//program 13
		
		//continue with while
		
		//infinite loop
		
		int i8=0;
		while(i8<5) {
			if(i8==2) {
				continue;
			}
			System.out.println(i8);//0/1
			i8++;//1/2
		} 
		
		
		//program 14
		
		int i9=0;
		while(i9<5) {
			if(i9==2) {
				continue;
			}
			System.out.println(i9);//0,1,3,4
			i9++;//1,2,4,5
		}
		
			
				
		
			
			
	
		
	
		
		
		
		
	}
}
