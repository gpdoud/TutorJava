package com.maxtrain;

public class Tutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String answer = null;
		do {
			print("Enter code: ");
			String code = scanner.nextLine();
			switch(code.toLowerCase()) {
			case "a":
				println("Alligator");
				break;
			case "b":
				println("Bird");
				break;
			case "c":
				println("Cat");
				break;
			case "d":
				println("Dog");
				break;
			default:
				println("Not a valid input!");
				break;
			}
			print("Play again? ");
			answer = scanner.nextLine();
		} while(answer.equalsIgnoreCase("y"));
		println("Done...");
	}
	private static void print(String msg) {
		System.out.print(msg);
	}
	private static void println(String msg) {
		print(msg);
		System.out.println();
	}

}
