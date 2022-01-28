package com.innerclasses;

public class Innerclass1 {

			 private String msg="Welcome to Core Java"; 
			 
			 class Inner{  
			  void hello(){System.out.println(msg+", Let us Start Learning Inner Classes");}  
			 }  


			public static void main(String[] args) {

				Innerclass1 obj=new Innerclass1 ();
				Innerclass1.Inner in=obj.new Inner();  
				in.hello();  
			}
		}


