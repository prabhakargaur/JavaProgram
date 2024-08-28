package day11;

import java.util.ArrayList;

public class Col1 {	
	public static void main(String[] args) {		
		ArrayList<String> obj = new ArrayList<String>();		
		obj.add("Ravi");
		obj.add("90909090");
		obj.add("90.90");
		obj.add("7");		
		//System.out.println(obj.size());
		//System.out.println(obj.contains("7"));
		//System.out.println(obj.get(2));
		//obj.remove(0);
		//System.out.println(obj);	
		//obj.clear();
		//System.out.println(obj);
		
		for (String string : obj) {
			System.out.println(string);
		}
	}
}
