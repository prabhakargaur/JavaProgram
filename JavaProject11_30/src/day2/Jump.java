package day2;

public class Jump {	
	public static void main(String[] args) {		
			int a = 10 , b=20;
		char n = '-';
		switch (n) {
		case '+':
			System.out.println(a+b);
			break;			
		case '-':
			System.out.println(a-b);
			break;
		case 'c':
			System.out.println("cat");
			break;
		default:
			System.out.println("exit");
			break;
		}
	}

}
