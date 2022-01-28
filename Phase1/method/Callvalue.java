package com.method;

public class Callvalue {
		//call by value

		int val=200;

		int operation(int val) {
			val =val*30/100;
			return(val);
		}

		public static void main(String args[]) {
			Callvalue d = new Callvalue();
			System.out.println("Before operation value of data is "+d.val);
			d.operation(100);
			System.out.println("After operation value of data is "+d.val);
			}
		
	}

