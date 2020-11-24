package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
	/*Using system.out.print() only, and not System.out.println(),
	because we want to display result on the same line*/
        System.out.print(a+" "+b+" ");

        for(int i=2; i<number; i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}
