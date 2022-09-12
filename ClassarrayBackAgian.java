package basicjava;

public class ClassarrayBackAgian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// logic behind array 
		
		//when to use array?
		//Datatype[]Array name =newdatatype[];
		//program 1
		String[]cars=new String[4];
		cars[0]="BMW";
		cars[1]="mercedes";
		cars[2]="tesla";
		cars[3]="alfa";
		//another way to initialize array
	
		
		//                   0     1       2     3
		String[] cars1= {"BMW,mercedes,tesla,alfa"};
		
		//program 2(array of integres)
	int[]age=new int[4];
	age[0]=30;
	age[1]=35;
	age[2]=45;
	age[3]=55;
	int[]age1= {30,35,40,55};
	//  0 1  2  3
	// 30 35 45 55
	
	
	//how to access the element from array
	//                    0         1          2     3
	String[] landingdir={"downwind","rightbase","leftbase","final"};
	
	//Total numbe of elements in array
	int a= landingdir.length;
	System.out.println(a);
	System.out.println(landingdir[landingdir.length-1]);
	//print every elements of array
	String[]place= {"kathmandu","bhaktapur","lalitpur","kritipur"};
	System.out.println(place[3]);
	
	//use for loop
	for(int i=0;i<4;i++) {
		System.out.println(i);//0,1,2,3
		}
	
	//same way to print names of place
			for(int i1=0;i1<place.length;i1++) {
				System.out.println(place[i1]);
			}
			
	int[]numbers= {1,2,3,4,5,6};
	for(int i=0;i<numbers.length;i++) {
		System.out.println(numbers[i]);
		
	}
	System.out.println("-------------------------------------------");
	//print all value of array in reverse
	String[]fruts= {"banana","grape","dragenfrut","apple","kiwi"};
	for(int i=fruts.length-1;i>=0;i--) {
		
		System.out.println(i);//
		System.out.println(fruts[i]);
		
	}
	
	//program 6
	//using for each loop
	int[]num= {11,23,45,56};
	for(int nu:num) {
		System.out.println(nu);
	}
	  String[]girls= {"loyal","humbel","grumpy","toxic"};
	  for(String girl:girls) {
		  System.out.println(girl);
	  }
	  String[]countries={"nepal","india","america","japan"};
	  for(String A:countries) {
		  System.out.println(A);
	  }
	  
	//program7
	  //sum of all elements
	  int[]numbers3= {5,10,15,20};
	  int sum=0;
	  for(int i=0;i<numbers3.length;i++) {
		  System.out.println(numbers3[i]);
		  
		  sum=sum+numbers3[i];
		 //0+5 
		  //5+10
		//15+15
		//30+20
		  System.out.println(sum);
		  
		  //program 8
		  //Avrage of all elements of array
		  int[] numbers5= {10,20,30,40,50};
		  int total=0;
		  //sum of all elements/total number of elements}}}}
		  for(int i1=0;i1<numbers5.length;i1++) {
			  System.out.println(i1);
			  total=total+numbers5[i1];
			  System.out.println(total/numbers5.length);
		  }
	  }
	  
	}

}
