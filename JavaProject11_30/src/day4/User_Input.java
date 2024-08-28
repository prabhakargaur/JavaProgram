package day4;

import java.util.Scanner;

public class User_Input {

	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int output = (a+b+c+d)/4;
		System.out.println(output);
		
	}
}
