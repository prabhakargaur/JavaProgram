package day6;

public class Array1 {
	
	public static void main(String[] args) {
		
		//int a[] = {1,2,3,4,5,1,2,3,4,5,1,2,3,4};
		
		char name[] = {'a' , 'b' ,'c','a' , 'b' ,'c'};		
		
		int x = name.length;
		System.out.println(x);
		
		try {
		 for(int i=0; i<x;i++)
		 {
			 System.out.println(name[i]);
		 }
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
