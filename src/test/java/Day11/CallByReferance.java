package Day11;

public class CallByReferance {

	public static void main(String[] args)
	{
		Test test=new Test();
		test.number=100;
		
		System.out.println("value before methord:" + test.number);
		
		test.m2(test);
		System.out.println("value after methord:" + test.number);

	}

}
