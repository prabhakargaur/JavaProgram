package day7;
class SM
{
	int a=90 , b= 100;
}
class Teach extends SM
{
	void swapwiththird()
	{
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}
}
class Students extends SM
{
	void swapwithoutthird()
	{
		a = a+b;
		b = a-b;
		a= a-b;
		System.out.println(a);
		System.out.println(b);
	}
}
public class hirerical {
	public static void main(String[] args) {		
		Teach obj = new Teach();
		obj.swapwiththird();
	}

}
