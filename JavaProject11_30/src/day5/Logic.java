package day5;

public class Logic {
	 void condition(int a , int b)
	 {			
		if(a<b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}	 
	 int Add(int a , int b)
	 {	 	
		 int c = a + b;
		 return c;		 
	 }
	 
	 String Name()
	 {
		 String username  = "abcd";
		 return username;
	 }
	 
	 int Calculation(int a)
	 {
		 int res = a + (1000*5)/100;
		 return res;
	 }
	 
	 boolean TestEven()
	 {
		 boolean status;
		 if(11 % 2==0)
		 {
			 status=true;
		 }
		 else
		 {
			 status=false;			 
		 }
		 return status;
	 }
}
