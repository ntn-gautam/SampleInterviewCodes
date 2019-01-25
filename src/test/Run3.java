package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Run3 {

	public static void main(String[] args) {
		
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		
		String[] arr1 = {"U.P","Delhi","Haryana","U.P","M.P"};
		ArrayList<String> aL1 = new ArrayList<String>(Arrays.asList(arr1));
		
		String[] arr2 = {"Jammu","Kashmir","Karnataka"};
		ArrayList<String> aL2 = new ArrayList<String>(Arrays.asList(arr2));
		
		map.put(1, aL1);
		map.put(2, aL2);
		
		for(Map.Entry<Integer, ArrayList<String>> hash:map.entrySet()) {
			int key = hash.getKey();
			ArrayList<String>  value =hash.getValue();
			
			System.out.println(key+"  "+value);
			
			if(key==2) {
			Iterator<String> it2 = value.iterator();
			while(it2.hasNext()) {
				System.out.println(it2.next());
			}
		}
		}
		
		
		
		

	}

}
