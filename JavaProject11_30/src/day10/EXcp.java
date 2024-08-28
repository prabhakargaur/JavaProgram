package day10;

public class EXcp {
	
	public static void main(String[] args) {
		
		//int a = 10 , b=0;		
		int a[] = {1,2,3};
		try
		{
			for(int i=0;i<=5;i++)
			{
				System.out.println(a[i]);
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
