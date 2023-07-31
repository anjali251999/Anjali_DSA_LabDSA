package com.gl.brackets;

import java.util.Scanner;

public class BracketsDriverClass {

	public static void main(String[] args) {

		System.out.println("Enter the input similar to as shown below:");
		System.out.println("Example: {[()]} OR {(]} OR {([])}}");
		Scanner scn = new Scanner(System.in);
		String bracketInput = scn.nextLine();
		MyStack ms = new MyStack();
		Boolean result = ms.checkBracket(bracketInput);
		if (result == true)
			System.out.println("Valid Expression");
		else
			System.out.println("Invalid Expression");
		scn.close();
	}

}
