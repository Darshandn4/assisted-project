package com.DarshanJava;
import java.util.*;
public class Maps {
public static void main(String[] args) {
						
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tom");    
	      hm.put(2,"May");    
	      hm.put(3,"Cat");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"banglore");  
	      ht.put(5,"mysuru");  
	      ht.put(6,"Jaipur");  
	      ht.put(7,"Jhamdespur");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	   	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Anni");    
	      map.put(9,"Car");    
	      map.put(10,"Camel");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
