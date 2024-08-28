package day5;

public class Swap {

	
	void Logic(int a , int b)
	{
		a = a + b;
		b = a-b;
		a= a-b;
		
		System.out.println(a + " " + b);
				
	}
}
