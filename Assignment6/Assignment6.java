//**************************************************************************
// FILE: Assignment6.java
// Name: Frank Stranathan
// Student ID: 1222843323
// Description:Report sales revenue for employees of PPG
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

class Assignment6
{
	public static void main(String[] args)
	{
		//declare variables
		final int TEAM_SIZE = 30;
		String[] employeeName = new String[TEAM_SIZE];
		double[] employeeSales = new double[TEAM_SIZE];
		String employee;
		double revenue = 0;
		int counter1 = 0; //to collect user input
		boolean again = true; //to collect user input
		String notAgain; //to collect user input

		Scanner read = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$0,000.00");

		//collect user input
		while(again == true)
		{
			//System.out.print("\nEnter the salesperson name: ");
			employee = read.nextLine();
			employeeName[counter1] = employee;

			//System.out.print("\nEnter the salesperson revenue: ");
			revenue = read.nextDouble();
			read.nextLine();
			employeeSales[counter1] = revenue;
			counter1++;

			if(counter1 >= 30)
			{
				break;
			}

			//System.out.print("\nContinue(Y/N): ");
			notAgain = read.nextLine().toUpperCase();
			if(notAgain.equals("N"))
			{
				again = false;
			}
		}//end of while loop

		double total = getTotal(employeeSales, counter1); //method call
		double avgRevenue = getAvg(employeeSales, counter1); //method call
		int aboveAvg = countAboveAverage(employeeSales, counter1); //method call
		int mostSales = getHighestIndex(employeeSales, counter1); //method call
		int leastSales = getLowestIndex(employeeSales, counter1); //method call

		System.out.print("\n=== PPG Industries Sales Report ===" + "\n");
		System.out.print("Number of sales person: " + counter1 + "\n");
		System.out.print("Total sales revenue:\t" + money.format(total) + "\n");
		System.out.print("Average sales revenue:\t" + money.format(avgRevenue) + "\n");
		System.out.print(aboveAvg + " salesperson's revenue are above average" + "\n");
		System.out.print(employeeName[mostSales] + " has the highest sales revenue of " + money.format(employeeSales[mostSales]) + "\n");
		System.out.print(employeeName[leastSales] + " has the lowest sales revenue of " + money.format(employeeSales[leastSales]) + "\n");
		printPerformance(employeeSales, employeeName, revenue, counter1);

	} //end of main method

	public static double getTotal(double[] salesArray, int size)
	{
		double totalSales = 0;
		for(int i = 0; i < size; i++)
		{
			totalSales += salesArray[i];
		}
		return totalSales;

	}//end of getTotal Method

	public static double getAvg(double[] avgArray, int size)
	{
		double total = 0.0;
		double average = 0.0;
		for(int i = 0; i < avgArray.length; i++)
		{
			total += avgArray[i];
		}
		average = total / size;
		return average;

	}//end of getAvg method

	public static int getHighestIndex(double[] topSales, int size)
	{
		int highestIndex = 0;
		for(int i = 1; i < size; i++)
		{
			if(topSales[i] > topSales[highestIndex])
			{
				highestIndex = i;
			}
		}
		return highestIndex;
	}//end of getHighestIndex Method

	public static int getLowestIndex(double[] lowSales, int size)
	{
		int lowestIndex = 0;
		for(int i = 0; i < size; i++)
		{
			if(lowSales[i] < lowSales[lowestIndex])
			{
				lowestIndex = i;
			}
		}
		return lowestIndex;
	}//end of getLowestIndex Method

	public static int countAboveAverage(double[] aboveAvg, int size)
	{
		double[] avgSales = aboveAvg;
		int counter2 = 0;
		for(int i = 0; i < size; i++)
		{
			if(avgSales[i] >= getAvg(avgSales, size))
			{
				counter2++;
			}
		}
		return counter2;
	}//end countAboveAverage Method

	public static void printPerformance(double[] revenueArray, String[] nameArray, double avgRev, int size)
	{
		DecimalFormat money = new DecimalFormat("$0,000.00");
		System.out.print("\n=== Individual Sales Performance Report ===" + "\n");
		System.out.print("Name\t\t\t Sales Revenue\t\t Above Avg" + "\n");
		avgRev = getAvg(revenueArray, size);
		for(int i = 0; i < size; i++)
		{
			if(revenueArray[i] >= avgRev)
			{
				System.out.print(nameArray[i]+ "\t\t" + money.format(revenueArray[i]) + "\t\t" + "Yes" + "\n");
			}
			else
			{
				System.out.print(nameArray[i]+ "\t\t" + money.format(revenueArray[i]) + "\t\t" + "No" + "\n");
			}
		}
	}//end of printPerformance method

}//end of Assignment6 class