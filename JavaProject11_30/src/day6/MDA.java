package day6;

public class MDA {

	public static void main(String[] args) {
		
		int a[][] = {  
							{1,2,3} , 
							{4,5,6} , 
							{7,8,9}
					};
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

//i=1;1<3;2
//j=0;0<3;1