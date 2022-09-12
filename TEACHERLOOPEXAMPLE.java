package basicjava;

public class TEACHERLOOPEXAMPLE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				// program 1 
				   
				  int i13  = 0; 
				  do { 
				   System.out.println("Nameste"); 
				   i13 ++; //1 
				  }while(i13 < 5); 
				   
				   
				  // program 2 
				   
				  int[] age = new int[5]; 
				  System.out.println(age); 
				  age[0] = 11; 
				  age[1] = 12; 
				  age[2] = 13; 
				  age[3] = 14; 
				  age[4] = 15; 
				   
				  // property ----- length  
				   
				  System.out.println(age.length); 
				  System.out.println(age[0]); 
				  System.out.println(age[1]); 
				   
				  // length -1 is always the last index 
				  System.out.println(age[age.length-1]); 
				   
				   
				  // program 3 
				   
				  int [] birthYear = new int [3]; 
				  birthYear[0] = 1989; 
				  birthYear[1] = 1990; 
				  birthYear[2] = 1991; 
				   
				  //   0     1    2 
				  // [1989,1990.1991] 
				   
				  System.out.println(birthYear[0]); 
				   
				  // length 
				   
				  System.out.println(birthYear.length);// 3 
				  // length -1 is always last index 
				  System.out.println(birthYear[2]); 
				   
				  //               0   1   2   3   4   5   6  7   8   9 
				  int [] marks = {100,110,132,333,444,222,333,44,55,66}; 
				//  System.out.println(marks[0]); 
				//  System.out.println(marks[1]); 
				//  System.out.println(marks[2]); 
				//  System.out.println(marks[3]); 
				//  System.out.println(marks[4]); 
				//  System.out.println(marks[5]); 
				//  System.out.println(marks[6]); 
				//  System.out.println(marks[7]); 
				//  System.out.println(marks[8]); 
				//  System.out.println(marks[9]); 
				//  System.out.println(marks[marks.length-1]); 
				//  System.out.println(marks.length); 
				   
				   
				  for(int i = 0 ; i < 10 ; i++){ 
				   //System.out.println(i); 
				   System.out.println(marks[i]); 
				  } 
				   
				   
				  // program 4 
				  //                   0    1      2   3     4               
				  String [] names = {"kul,rohit,shyam,hari,prajwal"}; 
				   
				   
				  // print all the element of array using for loop 
				   
				  for(int i = 0 ; i < names.length; i++) { 
				   //System.out.println(i); 
				   System.out.println(names[i]); 
				  } 
				   
				   
				  // print all the elements of array using while loop 
				   
				  int i22 = 0; 
				  while(i22 < names.length) { 
				   //System.out.println(i22); 
				   System.out.println(names[i22]); 
				   i22 ++; 
				  }  
				   
				  // print the element in reverse using for loop 
				   
				  for(int i = names.length -1 ; i >= 0 ; i--) { 
				   //System.out.println(i); 
				   System.out.println(names[i]); 
				  } 
				     
				  // print the element in reverse using while loop 
				   
				  int ia = names.length -1; 
				   
				  while(ia >= 0) { 
				   //System.out.println(ia); 
				   System.out.println(names[ia]); 
				   ia --; 
				  }
	
		
			
		
			
		
			
		
			
		
		
		
			
		
	}

}
