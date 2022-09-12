package basicjava;

public class ClassLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Loops
		//1)for loop
		//2)while loop
		//3)do while loop
		
		//for- loop
		
		
		//for(intialization,conditioncheck,incerement/decrement){
		//statement
		//}
		
		//program 1( print wow 5 times)
		for(int i=0;i<5;i++) {
			System.out.println("wow");
			
		}
		
		//progrem 2
		System.out.println("print the number from 5 to 10");
		for(int i=5;i<=10;i++) {
			System.out.println(i);
		}
		
		//program 3
		System.out.println("print table of 15");
		for(int i=15;i<=150;i=i+15) {
			System.out.println(i);
		}
		//progrem 4
		System.out.println("sum oo all number from 1to 5");
		int sum=0;
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			sum=sum+i;
			
			//0+1==1
			//1+2==3
			//3+3==6
			//6+4==10
			//10+5==15
			System.out.println(sum);
		}
		
		//progam 4
		System.out.println("print the value from 5 to 1");
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
		
		//table of 10 reverse
		for(int i=100;i>=10;i=i-10) {
			System.out.println(i);
		}
		
		
		
		//break statement with for loop
		
		//program 5
		System.out.println("for loop with break statement");
		for(int i=0;i<5;i++) {
			if(i==3) {
				break;
			}
			
		}
		
		for(int i=10;1>=0;i--) {
			if(i==5) {
			break;	
			}
		}
		
		for(int i=10;i>=0;i--) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		//program 6
		
		System.out.println("continue statment with ofr loop");
		
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
		System.out.println(i);
		}
		{
					
				}
		//while loop
				
		//intalization
		//while(condition){
		//statement one 
		//statement two
		//incriment/decriment
		//}
		
		//program 7 print yes 5 times
		int s=0;
		while(s<5) {
			System.out.println("yes");
			s++;
		}
		
		//program 8 print from 5 to 10
		int s1=5;
				while(s1<+10) {
					System.out.println(s1);
					s1++;
				}
	
		//program 9 table of 6
				int s2=6;
				while(s2<=60) {
					System.out.println(s2);
					s2=s2+6;
				}	
				//program 10 print 20 to 15
				int s3=20;
				while(s3>=15) {
					System.out.println(s3);
					s3--;
				}
				//program 11 table of reverse 5
				int s4=50;
				
				while(s4>=5) {
					System.out.println(s4);
					s4-=5;
				}
				//program 12
				
				//while loop with break statement
				
				int s5=0;
				while(s5<5) {
					if(s5==2) {
						break;
					}
					System.out.println(s5);//0/1
					s5++;//1/2
				}
				
				int s6=5;
				while(s6>=0) {
					System.out.println(s6);//5/4/3
					if(s6==3) {
						break;
					}
					s6--;//4/3
				} 
				
				
				//program 13
				
				//continue with while
				//inifinite loop
				
				int s8=0;
				while(s8<5) {
					if(s8==2) {
						s8++;
						continue;
					}
					System.out.println(s8);
					s8++;
				}
			
					
			
			
			
	
	
	            //oo
				int s9=0;
				do {
					System.out.println("NONO");
					s9++;
				}while(s9<5);
						
				
	          
		   
			  
			
		
		
	            
			
				
			
				
		   
				
				
				
					
				
				
	}
	}		

				