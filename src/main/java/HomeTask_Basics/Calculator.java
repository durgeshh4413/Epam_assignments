package HomeTask_Basics;

import java.util.Scanner;

public class Calculator {

	 public static void main(String[] args) {
	        int a,b,c;
	       System.out.println("Enter operation which needs to perform: 1.Add 2.Substract 3.Multiply 4.Divide ");
	       
	       Scanner sc=new Scanner(System.in);
	       c=sc.nextInt();
	        System.out.println("Enter first number : ");
	        a=sc.nextInt();
	        System.out.println("Enter second number : ");
	        b=sc.nextInt();
	      
	       
	       
	       switch(c){
	            case 1: 
	                System.out.println("Addition of two numbers is : "+(a+b));
	                break;
	            case 2: 
	               System.out.println("Substraction of two numbers is : "+(a-b));
	                break;
	            case 3:
	                System.out.println("Multiplication of two numbers is : "+(a*b));
	                break;
	            case 4:
	             System.out.println("Divide of two numbers is : "+(a/b));
	             System.out.println("Reminder of two numbers is : "+(a%b));
	                break;
	       }
	    }


}
