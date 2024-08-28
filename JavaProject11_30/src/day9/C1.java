package day9;

public class C1 extends P{

	@Override
	void Add() {		
		int a = 10 , b=90;
		System.out.println(a+b);		
	}

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.Add();
	}
}
