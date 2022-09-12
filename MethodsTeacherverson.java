package basicjava;

public class MethodsTeacherverson { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  int a = 15; 
  int b = 10; 
   
  System.out.println(a+b); // addition 
  System.out.println(a-b); 
  System.out.println(a*b); 
  System.out.println(a/b); 
  System.out.println(a%b); 
   
  int s  = 200; 
  int t = 75 ; 
   
  System.out.println(s+t); 
  System.out.println(s-t); 
  System.out.println(s*t); 
  System.out.println(s/t); 
  System.out.println(s%t); 
   
  // 10 pairs i have to write 50 lines 
  // DRY do not repeat yourself 
  // solution - functions 
   
  Calculator(25,10); 
  Calculator(300,200); 
  Calculator(55,40); 
   
  // function without parameter and without return type 
   
  AdditionA(); 
  AdditionA(); 
  AdditionA(); 
  AdditionA(); 
   
  // function with parameter and without return type 
  AdditionB(1,2); 
  AdditionB(5,3); 
  AdditionB(10,2); 
   
  // show  you 100 $  
  // give you 100 $  // $100 + 100 $ 100$ - 50$ $100 *0.10 
  // function with parameter and with return type 
   
  int v = AdditionC(10,4); 
  System.out.println(v); 
  System.out.println(v + v); 
  System.out.println(v - 5); 
  System.out.println(v * 0.10); 
   
  // Revision  
  SubtractionA(); 
  SubtractionA(); 
  SubtractionA(); 
  SubtractionA(); 
   
  SubtractionB(55,50); 
  SubtractionB(22,17); 
  SubtractionB(43,32); 
   
  int q1 = SubtractionC(77,63); 
  System.out.println(q1); 
  System.out.println(q1 + q1); 
  System.out.println(q1 - q1); 
  System.out.println(q1 * 0.10); 
   
  String q2 = SubtractionD(5,3); 
  System.out.println(q2); 
   
 } 
  
 // Functions 
  
 public static void Calculator(int x , int y) { 
  // arithmetic operation 
  System.out.println(x+y); 
  System.out.println(x-y); 
  System.out.println(x*y); 
  System.out.println(x/y); 
  System.out.println(x%y);  
 } 
  
 // Three basic type of function 
 // function without parameter and without return type 
  
 public static void AdditionA() { 
  System.out.println(5+5); 
 } 
  
 // function with parameter and without return type 
 public static void AdditionB(int x , int y) { 
  System.out.println(x+y); 
 } 
  
 // function with parameter and with return type 
 public static int AdditionC(int x ,int y) { 
  return x + y ; // (3 + 4) 
 } 
  
 // revision 
 public static void SubtractionA() { 
  System.out.println(20-5); 
 } 
  
 public static void SubtractionB(int a , int b){ 
  System.out.println(a-b); 
 } 
  
 public static int SubtractionC(int a , int b) { 
  return a - b; 
 } 
  
 public static String SubtractionD(int a ,int b) { 
   System.out.println(a - b); //2 
   return "Subtraction successful"; 
 } 
  
}