package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
	int number = sc.nextInt();
	if (number>0){
        	int a = 0;
        	int b = 1;
        	System.out.print(a+" "+b+" ");

        	for(int i=2; i<number; i++){
            		int c = a+b;
            		a = b;
            		b = c;
            	System.out.print(c+" ");
        	}
	}
	else{
		System.out.println("You cannot get Finbonacci for negative integers.");
	}
    }
}
