package com.Amodifiers;

		class defAccessspecifier1
		{ 
		  void display() 
		     { 
		         System.out.println("You are using default access specifier"); 
		     } 
		} 

		public class Accessspecifier1 {

			public static void main(String[] args) {
				//default
				System.out.println("Default Access Specifier");
				defAccessspecifier1 obj = new defAccessspecifier1(); 		  
		        obj.display(); 

			}
		

	}