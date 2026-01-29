package stringcomperisation;

import java.util.HashSet;
import java.util.HashSet;

public class StringDemo 
{

	public static void main(String[] args) 
	{

		/*String s1="vasim";
		String s2 ="vasim";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		String s1="vasim";
		String s2=new String("vasim");
		String s3=s2;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s2.equals(s3));
		
	
		
		//string //stringbuffer// stringBuilder
		
		String s1="vasim";
		s1.concat("kapadia");
		
		System.out.println(s1);
		StringBuffer s=new StringBuffer("kapadia");
		s.append(" vasim");
		
		System.out.println(s);
		
		int a =100;
		int b= 200;
		int c= 500;
	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int count=1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			
			
				count++;	
		}
		
		System.out.println("number of word in a string "+ count);
		
		
		String arr[]= {"java","python","c++","java","php","php","c++"};
		
		HashSet <String>langs=new HashSet();
		
		boolean flag=false;
		
		for(String l:arr)
		{
			if (langs.add(l)==false)
			{
				System.out.println("Found duplicat value:" + l);
				flag=true;
				
			}
			
		}
			if(flag==false)
			{ 
				System.out.println("duplate not found");
			}
		
		*/
		
		Methodmain m=new Methodmain();
		m.m3("john",100/2);
		
		String va=m.m4("  vasim");
		System.out.println(va);
		System.out.println(m.m4("  vasim"));
		
	}

}
