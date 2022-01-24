/*-------------------------------------------------------------
// AUTHOR: Frank Stranathan
// FILENAME: Lab5
// SPECIFICATION: This program performs 3 different arithmetic
// operations depending on the user input
// FOR: CSE 110 Lab #5
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab5
{
	public static void main(String[] args)
	{
		//declare variables create scanner object

		Scanner read = new Scanner(System.in);
		int choice = 0; //initalize do-while loop
		int m;
		int sum = 0;
		int j = 0;
		int n;
		int fact = 1;
		int num = 0;
		int rem = 0;

		//create the do - while loop

		do
		{
				System.out.println("\n1) Calculate the sum of integers 1 to m");
				System.out.println("2) Calculate the factorial of a given number");
				System.out.println("3) Find the first digit of a given number");
				System.out.println("4) Quit");
				//System.out.println("Please choose your choice from the following menu");
				choice = read.nextInt();

				//Write the switch statement nested in the do-while loop

				switch(choice)
				{
					case 1:
						 //System.out.println("\nEnter the number: ");
						 m = read.nextInt();
							while (j <= m)
							{
								sum = sum + j;
								j++;
							}
						 System.out.println("\nThe sum of 1 to" + " " + m +" "+ "is" + " " + sum);
					break;

					case 2:
						 //System.out.println("Enter the number: ");
						 n = read.nextInt();
						 for (int i = 1; i <= n; i++)
						 	 {
								 fact = fact * i;
							 }
						 System.out.println("\nThe factorial of" + " " + n + " "+ "is" + " " + fact);
						break;

					case 3:
						 //System.out.println("Enter the number: ");
						 num = read.nextInt();
						 while (num != 0)
						 {
							 rem = num%10;
							 num = num/10;
						 }
						 System.out.println("\nThe leftmost digit is" + " " + rem);
					break;
		        }
		}
		while (choice != 4);
	}
}