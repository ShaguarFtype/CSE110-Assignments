//**************************************************************************
// FILE: Assignment3.java
// Name: Frank Stranathan
// Student ID: 1222843323
// Description: Converts KM to miles, displays triangle, predicts bacteria population
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment3
{
	public static void main(String[] args)
	{
		//create scanner object and format miles output
		Scanner read = new Scanner(System.in);
		DecimalFormat fmt1 = new DecimalFormat("0.000");

		//declare variables
		int choice;
		int numRow;
		double num = 1;
		double miles = 0;
		int counter = 1;
		final double KILO = 0.6214; //kilometers to miles
		int bacteria;
		double rate;
		int numDay;

		do
		{
			//print menu
			System.out.println();
			System.out.println("1) Convert kilometers into miles");
			System.out.println("2) Display a triangle shape");
			System.out.println("3) Predict bacteria's population");
			System.out.println("4) Quit");
			System.out.println();

			//Ask user to pick from above menu
			//System.out.println("Please choose from above menu: ");
			choice = read.nextInt();
				while(choice < 1 || choice > 4)
				{
					System.out.println("Wrong choice! You can pick 1 to 4 only");
					System.out.println("please re-enter: ");
					choice = read.nextInt();
				}
			//write switch statement
			switch (choice)
			{
				//Convert KM to Miles
				case 1:
					//System.out.println("Please enter a positive integer: ");
					num = read.nextInt();

						//input validation
						while(num < 0)
						{
							System.out.println("Error, number must be positive");
							//System.out.print("Please enter a positive integer: ");
							num = read.nextInt();
						}
						System.out.println();
						System.out.println();
					System.out.print("Kilos\tMiles");

					for(int i = 1; i<= num; i++)
					{
						miles = (i * 1.0) * KILO;
						System.out.print("\n" + i + "\t" + fmt1.format(miles));

					}
					System.out.println();
					break;

				case 2:
					//print triangle based on number of rows entered
					//System.out.println("Please enter number of rows: ");
					numRow = read.nextInt();

					//input validation
					while (numRow < 1)
					{
						System.out.println("Error, number of rows must be positive");
						//System.out.println("Please enter number of rows: ");
						numRow = read.nextInt();
					}
					System.out.println();

					for(int i = 1; i <= numRow; i++)
					{
						for(int j = i; j < numRow; j++)
						{
							System.out.print(" ");
						}
						for(int j = 1; j < i; j++)
						{
							System.out.print("^");
						}
						for(int j = 1; j <= i; j++)
						{
						System.out.print("^");
						}
						System.out.println();
					}
					break;

				case 3:

					//Print bacteria population based on user input
					//System.out.println("Enter the starting number of bacterias (2 or more): ");
					bacteria = read.nextInt();

					while(bacteria < 2)
					{
						System.out.println();
						System.out.println();
						System.out.println("Error, starting number must be at least 2");
						//System.out.print("Please re-enter: ");
						bacteria = read.nextInt();
					}

					//System.out.println("Enter the daily population increase rate as a percentage(e.g 3.5): ");
					rate = read.nextDouble();
					while(rate <= 0)
					{
						System.out.println("Error, increase rate must be positive");
						//System.out.print("Please re-renter: ");
						rate = read.nextDouble();
					}
					//System.out.println("Enter the number of days the bacterias will be left to multiply: ");
					numDay = read.nextInt();

					for(int i = 1; i <= numDay; i++)
					{
						bacteria *= 1 + (rate * 0.01);
						System.out.print("\nPopulation after day " + i + ":" + " " + bacteria);
					}
					System.out.println();
				break;
			}

		} while (choice != 4);

	}
}