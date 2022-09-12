package basicjava;

public class StringRevisionclaabyKranti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//methods
		String nul="kaya";
		System.out.println(nul.length());
		
		//toUperCase
		String pul=nul.toUpperCase();
		System.out.println(pul);
		//toLowerCase
		String dull=nul.toLowerCase();
		System.out.println(dull);
		
		//split
		String[]A=nul.split("a");
		System.out.println(A[0]);
		System.out.println(A[1]);
		
	
		//Equals
		String ma="matthews";
		String ma1="charloote";
		boolean mm=ma.equals(ma1);
		System.out.println(mm);
		//or
		String sa="matthews";
		String na="matthews";
		boolean bb=sa.equals(na);
		System.out.println(bb);
		
		
		//concat method
		String we="i love";
		String me="you";
		String sw=we.concat(me);
		System.out.println(sw);
		//or
		String mr=we.concat(" "+me);
		System.out.println(mr);
		//contant
		String bg="i am sleepy";
		String wq="at moment";
		boolean ds=bg.contains(wq);
		System.out.println(ds);
		
		
		//substring
		String bm="Matthews";
		String nb=bm.substring(3, 6);
		System.out.println(nb);
		
		//joint
		String nc="hi";
		String mc="maya";
		String lc=String.join(" ",nc, mc);
		System.out.println(lc);
		
		//replace
		String k="kul";
		String j="Rimall";
		
		String rep=k.replace("l", "k");
		System.out.println(rep);
		
		//replace All
		String cd=j.replaceAll("l", "o");
		System.out.println(cd);
		//similer
		String nn1="rma is always happy";
		String bbb=nn1.replaceAll("a", "m");
	}
	

}
