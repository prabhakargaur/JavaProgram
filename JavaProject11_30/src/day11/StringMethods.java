package day11;

public class StringMethods {	
	public static void main(String[] args) {		
		String Fname = "PrAchI";
		String Lname = "Arachi";	
		String emp =""; 
		System.out.println(Fname.concat(Lname));
		System.out.println(Fname.length());
		System.out.println(Fname.charAt(2));
		System.out.println(Fname.contains("z"));  //imp		
		System.out.println(Fname.startsWith("P"));
		System.out.println(Fname.endsWith("I"));		
		System.out.println(Fname.toUpperCase().trim());
		System.out.println(Fname.toLowerCase());
		System.out.println(Fname.equals(Lname));
		System.out.println(Fname.trim());  //remove space
		System.out.println(emp.isEmpty());
		System.out.println(Fname.replace("Prachi", "Amit"));
		System.out.println(Fname.equalsIgnoreCase(Lname));
	}
}
