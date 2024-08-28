package day9;

abstract class Abs
{
	abstract void Demo();
}
public class Child extends Abs {	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.Demo();
	}
	@Override
	void Demo() {
		int r=5;
		double pie = 2.14;		
		double output = pie * r * r;
		System.out.println(output);
	}
}
