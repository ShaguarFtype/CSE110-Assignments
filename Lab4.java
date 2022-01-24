/*-------------------------------------------------------------
// Author: Frank Stranathan
// ASU ID: your 10 digits ASU ID
// For: CSE 110 Lab #4
// Description: This program  takes a number input by a user and outputs the corresponding day of the week
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab4
{
	public static void main(String[] args)
	{
		//step 1) declare variables

		int userInput;

		//step 2) create scanner object

		Scanner scan = new Scanner(System.in);

		//step 3) get user input from keyboard

		//System.out.println("Enter an integer between 1 to 7: ");
		userInput = scan.nextInt();

		//step 4) validate user input

		if (userInput < 1 || userInput > 7)
		{
			System.out.println("Invalid input, input must be between 1 to 7");
		}
		else
		//step 5) write nested if else statement
		{
			if (userInput == 1)
			{
				System.out.println("Monday");
			}
			else if (userInput == 2)
						System.out.println("Tuesday");
				 else if (userInput == 3)
				 		 System.out.println("Wednesday");
				 	  else if (userInput == 4)
				 	  		  System.out.println("Thursday");
				 	  	   else if (userInput == 5)
				 	  	   		   System.out.println("Friday");
				 	  	   	    else if (userInput == 6)
				 	  	   	    		System.out.println("Saturday");
				 	  	   	    	 else if(userInput == 7)
				 	  	   	    	 		System.out.println("Sunday");
		}
		//step 6) Use switch statement
		switch (userInput)
		{
		    case 1: userInput = 1;
		    		System.out.println("Monday - by switch");
		            break;
		    case 2: userInput = 2;
		    		System.out.println("Tuesday - by switch");
		            break;
		    case 3: userInput = 3;
					System.out.println("Wednesday - by switch");
		            break;
		    case 4: userInput = 4;
					System.out.println("Thursday - by switch");
		            break;
		    case 5: userInput = 5;
					System.out.println("Friday - by switch");
		            break;
		    case 6: userInput = 6;
					System.out.println("Saturday - by switch");
		            break;
		    case 7: userInput = 7;
					System.out.println("Sunday - by switch");
		            break;
		  }
	}

}