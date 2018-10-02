package com.jgate.packages;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
		// HashMap -- > key value pair ... HashMap class extends Map interface. 
		HashMap<String , Object> map = new HashMap<String, Object>();
		
		map.put("username", "userpoi");
		map.put("password", "user@poi1K!");
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
	}

}
