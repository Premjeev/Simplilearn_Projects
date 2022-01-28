package com.assistentproject;
import java.util.*;

public class Maps {

         public static void main(String[] args) {
		  
          HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Raju");    
	      hm.put(2,"Rocky");    
	      hm.put(3,"Dharun");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      ht.put(4,"Alan");  
	      ht.put(5,"Marry");  
	      ht.put(6,"Rosse");  
	      ht.put(7,"Michael");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Khali");    
	      map.put(9,"Rosse");    
	      map.put(10,"Marry");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}

