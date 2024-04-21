package com.coderscampus.week2;

import java.util.Scanner;

public class Week2Example {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in number between 50 and 300");
		String userInput = scanner.nextLine();
		int convertedInput = Integer.parseInt(userInput);
		
		if (convertedInput >= 50 && convertedInput <= 300) {
		System.out.println("Yes!");
		} else {
			System.out.println("No!");
			
		}
	
		scanner.close();
		
	
	}
	
	
		
		
	}
	


