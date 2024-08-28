package day5;

public class Methods {
	
	public static void main(String[] args) {
		int a = 20 , b= 90;
		Logic obj = new Logic();
		obj.condition(a,b);
		int x = obj.Add(a , b);
		
		System.out.println(x);
		
		String uname  = obj.Name();
		System.out.println(uname);
		
		int x1 = obj.Calculation(a);
		System.out.println(x1);
		boolean b1 = obj.TestEven();
		System.out.print(b1);
	}
}
