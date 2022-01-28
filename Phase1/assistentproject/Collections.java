package com.assistentproject;
import java.util.*;

public class Collections {
             	public static void main(String[] args) {
				 System.out.println("ArrayList");
				 ArrayList<String> city=new ArrayList<String>();   
			     city.add("TamilNadu");//
			     city.add("Bangalore");    	   
			     System.out.println(city);  
				
				
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector();
			      vec.addElement(23); 
			      vec.addElement(50); 
			      System.out.println(vec);
				
				
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("King");  
			      names.add("john");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			     
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(235);  
			       set.add(236);  
			       set.add(237);
			       set.add(238);
			       System.out.println(set);
			       
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(22);  
			       set2.add(23);  
			       set2.add(24);
			       set2.add(25);	       
			       System.out.println(set2);
			      	} 
			      }  
			}


