package basicjava;

public class ClassrevisionloopsE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for loop
		// (initializiton;conditionCheck;increment,decrement)
		//print 2 to 6
		
		for(int i=2;i<=6;i++) {
			System.out.println(i);//
			System.out.println("wow");//2,3,4,5,6
		}
		
		//print 10-20
		for(int i=10;i<21;i++) {
			System.out.println(i);
		}
		//print 30-20 backwards
		
		for(int i=30;i>=20;i--) {
			System.out.println(i);
		}
		
		//print table of 5
		for(int i=5;i<=50;i=i+5) {
			System.out.println(i);
		}
			
	//5 tabale backwords
		for(int i=50;i>=5;i=i-5) {
		System.out.println(i);	
		}
		//break statement with for loop
		//print 0-7
		for(int i=0;i<=7;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);//0,1,2
			
			//last break way
			for(int n=0;i<=7;n++) {
				System.out.println(n);//0,1,2,3
				if(n==3) {
					break;
				}
			}
			
			//continue
			//print 1-6 
			for(i=1;i<=6;i++) {
				if(i==3) {
					continue;
				}
				System.out.println(i);//1,2,4,5,6
			}
			
		}
		
		//while
		int x=1;
		while(x<6) {
			System.out.println(x);
			x++;
		}
		//print 5 table 
		int m1=5;
		while(m1<50) {
			System.out.println(m1);
			m1=m1+5;
		}
		//reverse 5 table
		int m2=50;
		while(m2>5) {
			System.out.println(m2);
			m2=m2-5;
		}
		//5-1 reverse
		int s=5;
		while(s>0) {
			System.out.println(s);
			s--;
		}
				
		//break with while loop
		//print 10-1 reverse
		int e=10;
		while(e>=1) {
			System.out.println(e);
			if(e==4) {
			break;	
			}
			e--;
		}
		
		//print 10 table
		int l=10;
		while(l<=100) {
			System.out.println(l);
			if(l==50) {
				break;
			}
			l=l+10;
		}
		//continue
		//print 0-5 table
		int b=0;
		while(b<5) {
			if(b==2){
				b++;
				continue;
			}
			System.out.println(b);// tihs last continue loop not runing
		}
	}

}
