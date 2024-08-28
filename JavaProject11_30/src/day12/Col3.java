package day12;

import java.util.HashMap;

public class Col3 {	
	public static void main(String[] args) {			
		HashMap<String , String> obj = new HashMap<String, String>();
		obj.put("name", "croma");
		obj.put("address", "b 21");
		obj.put("mob", "34343456");
				
		System.out.println(obj.size());
		System.out.println(obj.get("address"));
		System.out.println(obj.containsKey("mob"));
		System.out.println(obj.isEmpty());
	}
}
