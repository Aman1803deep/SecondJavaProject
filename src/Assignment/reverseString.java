package Assignment;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
	
	     // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Reverse the string using a loop
        String reversedString = reverseString(inputString);
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);
        
        // Close the scanner
        scanner.close();
    }

    public static String reverseString(String str) {
        String reversed = ""; 
        
      
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i); 
        }
        
        return reversed;
	}
}
	
