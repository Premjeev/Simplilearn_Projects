package com.method;

public class Overloadingmethod {
			
			public void area(int b,int h)
			    {
			         System.out.println("Area of Triangle : "+(0.23*b*h));
			    }
			    public void area(int r) 
			    {
			         System.out.println("Area of Circle : "+(2.55*r*r));
			    }

			    public static void main(String args[])
			   {

			    Overloadingmethod ob=new  Overloadingmethod();
			      ob.area(10,12);
			      ob.area(5);  
			   }
			}
