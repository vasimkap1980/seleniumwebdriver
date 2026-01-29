package class1;

public class ConstrututorDemo {
	
	int x,y;
	
	ConstrututorDemo()
	{
		x=10;
		y=20;
	}

	ConstrututorDemo(int a,int b)
	{
		x=a;
		y=b;
	}
	
	void sum()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) 
	
	{	
		ConstrututorDemo aim=new ConstrututorDemo();
		ConstrututorDemo con=new ConstrututorDemo(200,300);
		
		aim.sum();
		con.sum();
	}

}
