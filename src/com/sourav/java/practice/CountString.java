package com.sourav.java.practice;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string value");
		String inputString = scanner.next();
		System.out.println(inputString);
		System.out.println();
		System.out.println(countString(inputString));
		scanner.close();
	}

	public static String countString(String inputString) {
		String temproraryString = "";
		String resultantString = "";
		int counter = 1;
		int incrementor;
		for (incrementor = 0; incrementor < inputString.length(); incrementor++) {
			if (incrementor >= inputString.length() - 1) {
				temproraryString = inputString.charAt(incrementor) + "" + counter;
				resultantString = resultantString.concat(temproraryString);
				break;
			} else if (inputString.charAt(incrementor) == inputString.charAt(incrementor + 1)) {
				counter++;
				continue;
			}
			temproraryString = inputString.charAt(incrementor) + "" + counter;
			resultantString = resultantString.concat(temproraryString);
			counter = 1;
		}
		return resultantString.toString();
	}
}
