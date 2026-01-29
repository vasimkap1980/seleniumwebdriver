package day13;

public class WrapperDemo 
{

	public static void main(String[] args) 
	{
		/*
		 * int i=100; double d=10.5; char c='a';
		 * 
		 * // converting primitive to object call Auto Boxing
		 * 
		 * Integer iobj=i; Double dobj=d; Character cobj=c;
		 * 
		 * System.out.println(iobj); System.out.println(dobj); System.out.println(cobj);
		 * 
		 * // convering object to primitive call un boxing
		 * 
		 * int ivalue=iobj; double dvalue=dobj; char cvalue=cobj;
		 * 
		 * System.out.println(ivalue); System.out.println(dvalue);
		 * System.out.println(cvalue);
		 * 
		 */
		
		// string to int
		
		/*String s1="100";
		String s2="200";
		
		int sum=Integer.parseInt(s1) + Integer.parseInt(s2);
		System.out.println(sum); */
		
//		String s1="10.5";
//		String s2="12.5";
//		
//		double multi=Double.parseDouble(s1) * Double.parseDouble(s2);
//		System.out.println(multi);
//		
		int x=100;
		boolean b=true;
		
		String s1=String.valueOf(x);
		String b2=String.valueOf(b);
		System.out.println(s1);
		System.out.println(b2);
	
	}

}
