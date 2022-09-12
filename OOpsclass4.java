package basicjava;

public class OOpsclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person5 kul=new person5("kulRimal","Charlotte",30,123);
		person5 kavya=new person5("kavya","Matthews",20,1243);
		kavya.Displayname();
		kul.Displayname();
		

	}

}
class person5{
	String fullname;
	String city;
	int age;
	int zip;
	
	person5(String fn,String city,int age,int zip){
		this.fullname=fn;
		this.city=city;
		this.age=age;
		this.zip=zip;
	}
	public  void Displayname() {
		System.out.println(this.fullname);
	}
	
}