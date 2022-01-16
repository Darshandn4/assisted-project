package com.DarshanJava;
import java.util.Scanner;

public class ArithmeticCal {

	public static void main(String[] args) {
	Scanner Scan = new Scanner(System.in); 
		int num1 = 0;
		int num2 = 0;
		char Operator;
		double ans = 0.0;
		
		System.out.println("Enter the first number: ");
		num1 = Scan.nextInt();
		
		System.out.println("Enter the Second number: ");
		num2 = Scan.nextInt();
		
		System.out.println("Operator used ");
		Operator =  Scan.next().charAt(0);
		
		switch(Operator) {
		case '+' : ans = num1 + num2;
		             break;
		case '-' : ans = num1 - num2;
        break;
        
		case '*' : ans = num1 * num2;
        break;
        
		case '/' : ans = num1 / num2;
        break;
        
		}
		
		System.out.println(num1+" "+Operator+" "+num2+" "+ans);
	}
		
		

	}