package test;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Run1 {

	public static void main(String[] args) {

//    ********************************************************************************
//		//Reverse an array without taking another array
//    
//		int[] a = new int[] {1,2,3,4,5,6,7,8,9,10};
//		int temp = 0;
//		for(int i=0;i<a.length/2;i++) {
//			temp=a[i];
//			a[i]=a[(a.length-1)-i];
//			a[(a.length-1)-i]=temp;
//			
//		}
//		System.out.println(Arrays.toString(a));
//
//	**********************************************************************************
		
//		//Shorting an array
//		
//		int[] a = {5,4,1,10,7};
//		int temp = 0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			
//		}
//	System.out.println(Arrays.toString(a));
//		
//  ***********************************************************************************		
		
//		//Convert String into an character array
//		
//		String s1 = "Nitin";
//		char[] c1 = new char[s1.length()] ;
//		for(int i=0;i<s1.length();i++) {
//			c1[i]=s1.charAt(i);
//		}
//		System.out.println(Arrays.toString(c1));
//		
//     **********************************************************************************
		
		//Palindrome
		
		
//		String s1 = "Rahul";
//		String s2 = "";
//		s1=s1.toLowerCase();
//		for(int i=s1.length()-1;i>=0;i--) {
//			s2+=s1.charAt(i);
//		}
//		if(s2.equals(s1)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not a Palindrome");
//		}
//		
//		xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		//Checking Palindrome using characters
		
//		String s3 ="NiTIn";
//		s3=s3.toLowerCase();
//		boolean a =true;
//		for(int i=0;i<s3.length()/2;i++) {
//		if(s3.charAt(i)!=s3.charAt((s3.length()-1)-i)){
//			a=false;
//			break;
//		}	
//		}
//		if(a) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not a Palindrome");
//		}
//		
//		***********************************************************************************
		
		
//		//Reverse a Sentence
//		
//		String s1 = " Hi This is Nitin ";
//		String s2 ="";
//		String[] s3 = s1.split(" ");
//		for(int i=s3.length-1;i>=0;i--) {
//			s2=s2+" "+s3[i];
//			s2=s2.trim();
//			
//		}
//		System.out.println(s2);
//		
//		xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		
//		//Reverse a Sentence as well as the word
//		String inputString = "This is Rahul";
//        String[] words = inputString.split(" ");
//        String reverseString = "";
//        
//        for (int i = 0; i < words.length; i++) 
//        {
//            String word = words[i];
//            
//            String reverseWord = "";
//            
//            for (int j = word.length()-1; j >= 0; j--) 
//            {
//                reverseWord = reverseWord + word.charAt(j);
//            }
//            System.out.println(reverseString = reverseString + reverseWord + " ");
//           
//        }
//        
//      *****************************************************************************************  
		
//		//Find Duplicate element in an Array
//		
//		
//		int[] a = {2,3,4,2,4,2,4,2,4};
//		for(int i=0;i<a.length;i++) {
//			
//			for(int j=i+1;j<a.length;j++) {
//			
//			if((a[i]==a[j]) && (i!=j)) {
//				System.out.println(a[j]+" ");	
//			}
//		}
//		}
		
//		*****************************************************************************************
		
//		//Duplicate element in array using HashSet
//		
//		int[] arr = {2,3,4,2,3,3,2};
//		 HashSet<Integer> set = new HashSet<Integer>();
//		 
//		 for(int i=0;i<arr.length;i++) {
//			 if(!set.add(arr[i])) {
//				 System.out.println("Duplicate array found "+arr[i]);
//			 }
//		 }
		 
//		 xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		 
		  int[] intArr = new int[] { 1, 2, 1, 2, 1, 3, 4, 6, 2, 8 };
		  
		  int[] intArr1 = new int[5];

	        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

	        for (int i = 0; i < intArr.length; i++) {
	            // take first element and then matched complete array
	            int temp = intArr[i];
	            int count = 0;

	            for (int j = 0; j < intArr.length; j++) {
	                if (temp == intArr[j]) {
	                    // element matched -- break
	                    count++;
	                }
	            }
	            map.put(temp, count);
	        }

	        LinkedHashSet<Integer> duplicate = new LinkedHashSet<Integer>();
	        LinkedHashSet<Integer> noDuplicate = new LinkedHashSet<Integer>();
	        
	        for (int i = 0; i < intArr.length; i++) {
	            if (map.containsKey(intArr[i])) {
	                System.out.println("Key :" + intArr[i] + " Value : " + map.get(intArr[i]));

	                if (map.get(intArr[i]) > 1) {
	                    // means repeated character
	                    duplicate.add(intArr[i]);
                        
	                    
	                } else {
	                    // non repeated character
	                    noDuplicate.add(intArr[i]);
	                }
	                
	                
	            
	            }}
	        Iterator it = duplicate.iterator();
	        while(it.hasNext()) {
	        	System.out.println("Duplicate Element");
	        	System.out.println(it.next());
	        }
	        
	        Iterator it1 = noDuplicate.iterator();
	        while(it1.hasNext()) {
	        	System.out.println("Non Duplicate Element");
	        	System.out.println(it1.next());
	        }
		 
// This is commented
		
		
		
		
		
    }
    }


