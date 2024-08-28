package day7;
class GP
{
	int a = 10 , b=20;
} 
class P extends GP
{
	void add()
	{
		System.out.println(a+b);
	}
}
class C extends P
{
	void sub()
	{
		System.out.println(a-b);
	}
}
public class Singlelevel {	
	public static void main(String[] args) {		
		C obj = new C();
		obj.add();
		obj.sub();
	}
}
