package day9;

public class A {
	
		A()
		{
			System.out.println("hello");
		}
	
		A(int a)
		{
			System.out.println(a);
		}
	
	 public static void main(String[] args) {		
		A obj = new A();
		A obj2 = new A(10);
	}
}

// class name and const name both are same
// const cannot return any value.
// auto calling  