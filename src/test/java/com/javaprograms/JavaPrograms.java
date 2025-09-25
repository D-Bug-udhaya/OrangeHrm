package com.javaprograms;

import java.util.Scanner;
public class JavaPrograms {
	public static void reverseEachWord() {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the word:");
			String w = s.nextLine();// D-Bug Technology	
			String[] word = w.split(" ");
			for(String s1:word) {
				char[] ch = s1.toCharArray();
				for(int i=ch.length-1;i>=0;i--) { //i=2 2>=0
					System.out.print(ch[i]); //ch[2] 
				}
				System.out.print(" ");
			}		
	}
	
	public static void fibo() {
		
		int a=0,b=1;
		int n=5;
		System.out.println(a+" "+b+" ");
		
		
	}
	
	public static void main(String[] args) {
		//reverseEachWord();
		fibo();
	}
}
