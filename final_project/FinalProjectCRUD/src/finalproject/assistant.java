package finalproject;

import java.util.Scanner;

public class assistant {
	
	private static Scanner input = new Scanner(System.in);

	public static int intSelection(String message) {
		int i;
		while(true) {
			System.out.print(message + ": ");
			try {
				i=Integer.parseInt(input.nextLine());
				return i;
			} catch (Exception e) {
				System.out.println("Wrong input");
			}
		}
	}
	
	
public static int intSelection(String message, int min, int max) {
		
		int i;
		while(true) {
			System.out.print(message + ": ");
			try {
				i=Integer.parseInt(input.nextLine());
				if(i<min || i>max) {
					System.out.println("Given number is out of range (" + min + "-" + max + ")");
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Wrong input!");
			}
		}
	}


public static String acceptString(String message) {
	String s;
	while(true) {
		System.out.println(message + ": ");
		s = input.nextLine();
		if(s.trim().isEmpty()) {
			System.out.println("No input recieved. Please try again.");
			continue;
		}
		return s;
	}
	
}
	
	
	
	}
	

