package Assignment;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Enter a number: ");
	        
	        int number = scanner.nextInt();
	        
	        
	        if (number <= 1)
	        {
	        	 System.out.println(number + " is a prime number.");
	        	
	        }
	        
	        else {
	        	  System.out.println(number + " is not a prime number.");
	        }
	        
	  

	        // Close the scanner
	        scanner.close();
	}
	}
	   

