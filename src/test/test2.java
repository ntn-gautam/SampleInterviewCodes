package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class test2 {

	public static void main(String[] args) {
		
		int[] a = {1,2,4,1,2,1,2,1,2,7,8,9};
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		
		for(int i=0;i<a.length;i++) {
			int count =0;
			int temp =a[i];
			for(int j=0;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					count++;
					}
		}
			map.put(temp,count);
		}
		
		HashSet<Integer> duplicate = new HashSet<Integer>();
		HashSet<Integer> noDuplicate = new HashSet<Integer>();
		
		for(int j=0;j<a.length;j++) {
		
		System.out.println("Key : "+a[j]+" Value :"+map.get(a[j]));
		
		
		if(map.get(a[j]) > 1) {
			duplicate.add(a[j]);
		}else {
			noDuplicate.add(a[j]);
		}}
		Iterator it = duplicate.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");		
		
		}
		
		
		
		
		
		
        
	}

}
