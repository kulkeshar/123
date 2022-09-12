package basicjava;

public class OOPSclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bank1 kul=new Bank1("kulRimal",123,500000);
		System.out.println(kul.accname);
		System.out.println(kul.accno);
		System.out.println(kul.bal);
		
		//deposit
		int updatedbal=kul.deposit(100000);
		System.out.println("updated bal");
		//withdrawl
		int bal=kul.withdrawl(650000);
		System.out.println(bal);
		
		int currentbal=kul.withdrawl(200000);
		System.out.println( currentbal);

	}

}
class Bank1{
	String accname;
	int accno;
	int bal;
	
	Bank1(String accname,int accno,int bal){
		this.accname=accname;
		this.accno=accno;
		this.bal=bal;
		
	}
	public int deposit(int amount) {
		this.bal=this.bal+amount;
		System.out.println("bal updated");
		return this.bal;
	}
	public int withdrawl(int amount) {
		if(this.bal>amount) {
		this.bal=this.bal-amount;
		System.out.println("bal updated");
		return this.bal;
	}
	else{
		System.out.println("insufficient bal");
		return this.bal;
	}
}}