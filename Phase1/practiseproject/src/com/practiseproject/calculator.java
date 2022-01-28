package com.practiseproject;
import java.util.Scanner;
public class calculator {

	
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the two numbers");
int firstnum=scanner.nextInt();
int secnum= scanner.nextInt();
System.out.println("Enter the operator ");
char op=scanner.next().charAt(0);
double Ans=0;
switch(op){
case '+': Ans=firstnum+secnum;
break;
case '-': Ans=firstnum-secnum;
break;
case '*': Ans=firstnum*secnum;
break;
case '/': Ans=firstnum/secnum;
break;
	}
System.out.println("the answer is " +Ans);
	}
}
		
	


