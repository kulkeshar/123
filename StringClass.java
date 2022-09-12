package basicjava;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
         //type
		//type object---propety and method
		//method-ationand return type
		
		
		//string+string===>string
		//number+string===>string
		//string+number==>string
		//number+number ====>number
		
		String City="Matthews";
		System.out.println(City);
		System.out.println(City.toUpperCase());
		System.out.println(City.toLowerCase());
		  
		
		String country="America"; //creating object of string
		System.out.println(country.toUpperCase());
		System.out.println(country.toLowerCase());
		
		int m=15;
		int n=10;
		String o="wow";
		System.out.println(m+n+o);
		//number+number=string==>string
		System.out.println(o+o);
		//string+string==>"string"
		System.out.println(m+n);
		//number+number==>number
		String q="10";
		String r="20";
		System.out.println(q+r);
		//methods
		//length()
		String country1="America";
		int x2=country1.length();
		System.out.println(x2);
		
		
		//toUpperCase
		String city="charloot";
		String x3=city.toUpperCase();
		System.out.println(x3);
		System.out.println("welcometo"+x3);
		
		//toLowerCase
		String x4=city.toLowerCase();
		System.out.println(x4);
		System.out.println("wlcometo"+x4);
		
		
		//concat
		String drink ="mocha";
		String v="i hate";
		String joinedString=v.concat(drink);
		System.out.println(joinedString);
		String x5=drink.concat(v);
		System.out.println(x5);
		
		
		//method changing
		String sports ="baseball";
		System.out.println(sports);
		
		String x6=sports.toUpperCase();
		System.out.println(x6);
		int x7=x6.length();
		System.out.println(x7);
		int x8=sports.toUpperCase().toLowerCase().length();
		System.out.println(x8);
		
		//equal
		String first="Hi";
		String second="Hi";
		
		boolean result=first.equals(second);
		System.out.println(result);
		
		//contains
		String www="i am working with Bank of America";
		boolean result1=www.contains("America");
		System.out.println(result1);
		
		
		//substring ()"starting index,end index(ind index not included)
		
		String drink1="coffee";
		// 0 1 2 3 4 5
		// c o f f e e
		String result2=drink1.substring(5);
		System.out.println(result2);//e
		
		String result3=drink1.substring(2,4);
		System.out.println(result3);//ff
		
		String result4=drink1.substring(2,6);
		System.out.println(result4);
		
		//joint
		String step1="i am";
		String step2="Going to";
		String step3="sanfrancisco";
		
		String result5=String.join(" ",step1,step2,step3);
		System.out.println(result5);
		
		String str="kul";
		String email=String.join("@",str,"gmail.com");
		System.out.println(email);
		
		//replace "can work with character also"
		
		//besic examples
		
		// "kul","i",kul.replace("i","m");
		//"kul has beamer and he likes his car".replaceAll("kul","samya");
		
		String step4="i am going to jon f kennedy";
		String step5=step4.replace("jon f kennedy","JFK" );
		System.out.println(step5);
		
		String step6="i am using eclips and eclips is fun";
		String step7=step6.replace("i","m");
		System.out.println(step7);
		
		//replace All
		 String step8="i am using eclips and eclips is fun";
		 String step9=step8.replaceAll("i","m");
		 System.out.println(step9);// "i got similar result replace
		 //and replace All
		 
		 //replace first
		 String step10= "i am going to jon f kennedy";
		String step11=step10.replaceFirst("jon f kennedy","JFK");
		System.out.println(step11);
		// replace and replacefirst got same result
		
		
		//chartAt()
		
		String step12="Matthews";
		//0 1 2 3 4 5 6 7
		//M a t t h e w s
		char result6=step12.charAt(6);
		System.out.println(result6);
		
		//indexOf
		String step13="i am going to jon f kennedy";
		int result7=step13.indexOf("i",2);
		System.out.println(result7);
		
		//trim
		
		String step14="nepal";
		System.out.println(step14.length());
		
		String step15=step14.trim();
		System.out.println(step15.length());
		
		//split()
		
		String step16="kul-Rimal-28110";
		String []result8=step16.split("-");
		System.out.println(result8[0]);
		System.out.println(result8[1]);
		System.out.println(result8[2]);
		
		String [] result9="kul-rimal-28110".split("l");
        System.out.println(result9[0]);
        System.out.println(result9[1]);
        System.out.println(result9[2]);
        
        //startwith (answer will be true/false)
        
        String step18="iam new to town";
        boolean result10=step18.startsWith("iam");
        System.out.println(result10);
        
        //endwith (answer will be true/false)
        
        String step19="i love jym";
        boolean result11=step19.endsWith("jym");
        System.out.println(result11);
        
        //
        String step20="Kulrimal";
        //0 1 2 3 4 5 6 7
        //K u l r i m a l
        for(int i=0;i<step20.length();i++) {
        	System.out.println(i);
        	System.out.println(step20.charAt(i));
        	
        }
		for(int i=step20.length()-1;i>=0;i--) {
			System.out.println(step20.charAt(i));
			
		}
		
		String step21="namaste";//Reverse 
		String rev="";
		// print in reverse
		//etsaman
		for(int i=0;i<step21.length();i++) {
			rev=step21.charAt(i)+rev;
			//n+""==n
			//a+n==an
			//m+an==man
			//a+man==aman
			//s+aman==saman
			//t+saman==tsaman
			//e+tsaman==etsaman
		}
		System.out.println(rev);
		
		String step22="Hola";
		String rev2="";
		//0 1 2 3
		//h o l a
		for(int i=0;i<4;i++) {
			System.out.println(i);
			System.out.println(step22.charAt(i));
			rev2=step22.charAt(i)+rev2;
			//a+""==a
			//a+l==al
			//al+o==alo
			//alo+h==aloh
		}
		System.out.println(rev2);
		
		//another way
		String step23="hola";
		String rev3="";
		
		//0 1 2 3
		//H o l a
		for(int i=step23.length()-1;i>=0;i--) {
			System.out.println(i);
			System.out.println(step23.charAt(i));
			rev3=rev3+step23.charAt(i);
		}
		System.out.println(rev3);
		
		//counter
		String step24="yes";
		int counter=0;
		//0 1 2 
		//y e s 
		
		
		for(int i=0;i<step24.length();i++) {
			char a1=step24.charAt(i);
			if(a1=='s') {
				counter=counter+1;
			}
		}
		System.out.println(counter);
		
		//pra------
		String step222="matthews";
		for(int i=0;i<step222.length();i++) {
			System.out.println(i);
			System.out.println(step222.charAt(i));
			
		}
	}                                   
}

