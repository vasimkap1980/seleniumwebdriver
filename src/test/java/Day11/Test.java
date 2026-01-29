package Day11;

public class Test 
{
	
	
	
	 void m1(int number) { number=number+10;
	  System.out.println("value in the methord:" + number); }
	 
		
	int number;
	
	void m2(Test t)
	{
		t.number=t.number+10;
		System.out.println("value in the methord :"+ t.number);
	}
}
