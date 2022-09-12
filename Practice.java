package basicjava;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//switch case--->
		String city ="kritipur";
		switch(city) {
		case "pokhara":
			System.out.println("kaski");
		case "kritipur":
			System.out.println("kathmandu");
		case"kumaripati":
			System.out.println("lalitpur");
			default:{
				System.out.println("no city match");
			}
			
		}
		//switch case with break
		
		switch(city) {
		case"pokhara":
			System.out.println("kaski");
			break;
		case"kritipur":
			System.out.println("kathmandu");
			break;
		case"kumaripati":
			System.out.println("lalitpur");
			break;
			default:{
				System.out.println("Data not found");
			}
		}	
				
		//conditional starement
		int marks=91;
		if(marks>90) {
			System.out.println("A grade");
		}
		if(marks>70) {
			System.out.println("B grade");
		}
		if(marks>60) {
			System.out.println("C grade");
		}
		//if else statement
		
		int mark=71;
		 if(mark>90) {
			System.out.println("A grade");
		}
		else if(mark>70) {
			System.out.println("B grade");
		}
		else if(mark>60) {
			System.out.println("C grade");
		}
		else {
			System.out.println("no data match");
		}
		 String car="BMW";
		 System.out.println(car);
		 int x3=car.length();
		 System.out.println(x3);
			System.out.println(x3+x3);	 
		 
		
	
}}