package com.Threads;

		public class Mythread extends Thread
		{
		 	public void run()
		 	{
		  		System.out.println("Concurrent Thread Started Running..");
		}
		 	public static void main( String args[] )
		 	{
		  		Mythread mt = new  Mythread();
		  		mt.start();
		 	}
		}
