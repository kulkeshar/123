package basicjava;

public class oopsbankexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bank kul=new Bank("kul",1256,300000);
		System.out.println(kul.accname);
		System.out.println(kul.accno);
		System.out.println(kul.bal);
		
		
		//deposit amount
		int updatedbal=kul.deposit(50000);
		System.out.println("bal updated");
		
		//withdrawal
		int bal=kul.withdrawl(400000);
		System.out.println(bal);
		
		int currentbal=kul.withdrawl(50000);
		System.out.println(currentbal);
		
		
		//transaction====>count of transaction
		//store the transactoin in array
		//i dont know about this;;;;;;;;><><
		
		
 
	}

}
class Bank{
	String accname;
	int accno;
	int bal;
	Bank(String accname,int accno,int bal){
		this.accname=accname;
		this.accno=accno;
		this.bal= bal;
		
	}
	public int deposit(int amount) {
		this.bal=this.bal+amount;
		System.out.println("Bal updated");
		return this.bal;
	}
	public int withdrawl(int amount) {
		if(this.bal>amount) {
			this.bal=this.bal-amount;
			System.out.println("bal update");
			return this.bal;
		}
		else {
			System.out.println("insufficient bal");
			return this.bal;
		}
	}

}

