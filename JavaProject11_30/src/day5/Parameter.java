package day5;

public class Parameter {
	
	public static void main(String[] args) {
		
		int x = 10 , y=90;
		
		Parameter obj = new Parameter();
		obj.A(x , y);
	}
	
	void A(int x , int y)
	{
		System.out.println(x + y);
	}

}
