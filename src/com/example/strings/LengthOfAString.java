package com.example.strings;

import java.util.Scanner;
/*
 1.Write a program to find the length of a string.
   Input:
   Enter a string: hello world
   Output:
   The length of the string is: 11
*/

public class LengthOfAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");//Teekshi
		String inputStr = scanner.nextLine();
		System.out.print("The length of a string is:" + inputStr.length());//Teekshi.length()->7
		scanner.close();
	}
}
