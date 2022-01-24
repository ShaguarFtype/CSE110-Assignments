/*-------------------------------------------------------------
// AUTHOR: Frank Stranathan
// ASU ID: 1222843323
// FILENAME: Lab9
// SPECIFICATION: this program tracks how much food monkeys eat in a week
//-----------------------------------------------------------*/

import java.util.Scanner;
import java.text.DecimalFormat;

class Lab9
{
	public static void main(String[] args)
	{
		//declare necessary constants and variables here
		final int NUM_MONKEY = 3;
		final int NUM_DAYS = 7;
		double groupTotal = 0;
		double dailyAvg = 0;
		double lowestAmt = 0;
		double total1 = 0;
		double total2 = 0;
		double total3 = 0;
		double totalMonday = 0;
		double avgMonday = 0;
		double totalSaturday = 0;
		double avgSaturday = 0;

		Scanner read = new Scanner(System.in);
		DecimalFormat fmt1 = new DecimalFormat("0.00");

		//Create a 2D array to hold the pounds of food consumed
		//by each monkey on each day of the week
 		double[][] food = new double[NUM_MONKEY][NUM_DAYS];

		//Use nested for loop to get data and fill in the 2D array
		for(int row = 0; row < food.length; row++)
		{
			//System.out.print("\nEnter pounds of food eat by monkey # " + (row + 1) + " on" + "\n");
			for(int col = 0; col < food[0].length; col++)
			{
				//System.out.print("on day " + (col + 1) + ":");
				food[row][col] = read.nextDouble();
			}

		}//end for loop

		//call the findGroupTotal() method and compute
		//the average amount of food the 3 monkeys ate per day
		groupTotal = findGroupTotal(food);
		dailyAvg = groupTotal / 7.0;
		System.out.print("\nAverage amount of food eaten per day " + "\n"
		+ "by the entire family of monkeys = " + fmt1.format(dailyAvg) + " pounds." + "\n");


		//call the findLeastAmtFood() method and compute
		//the least amount of food eaten all week by any one monkey
		lowestAmt = findLeastAmtFood(food);
		System.out.print("\nLeast amount of food eaten all week by any monkeys is: " + fmt1.format(lowestAmt) + " pounds.");


		//Find Monkey #1 total consumption of food during the week
		for(int day = 0; day < NUM_DAYS; day++)
		{
			total1 += food[0][day];
		}
		System.out.print("\nMonkey #1 eat total of " + fmt1.format(total1) + " pounds of food in this week." + "\n");

		//Find Monkey #2 total consumption of food during the week
		for(int day = 0; day < NUM_DAYS; day++)
		{
			total2 += food[1][day];
		}
		System.out.print("\nMonkey #2 eat total of " + fmt1.format(total2) + " pounds of food in this week." + "\n");


		//Find Monkey #3 total consumption of food during the week
		for(int day = 0; day < NUM_DAYS; day++)
		{
			total3 += food[2][day];
		}
		System.out.print("\nMonkey #3 eat total of " + fmt1.format(total3) + " pounds of food in this week." + "\n");

		//Find the average of food the 3 monkeys eat on Monday
		for(int monkey = 0; monkey < 3; monkey++)
		{
			totalMonday += food[monkey][0];
		}
		avgMonday = totalMonday / 3.0;
		System.out.print("\nThe 3 monkeys eat an average " + fmt1.format(avgMonday) + " pounds of food on Monday." + "\n");

		//Find the average of food the 3 monkeys eat on Saturday
       for(int monkey = 0; monkey < 3; monkey++)
       {
		   totalSaturday += food[monkey][5];
	   }
	   avgSaturday = totalSaturday / 3.0;
	   System.out.print("\nThe 3 monkeys eat an average " + fmt1.format(avgSaturday) + " pounds of food on Saturday.");


	}//End of main

		//This method takes a 2D array as input parameter and returns
		    //the sum of all elements inside
		    public static double findGroupTotal(double[][] a2DArray)
		    {
		        double total = 0.0;
		        for(int i = 0; i < a2DArray.length; i++)
		        {
					for(int j = 0; j < a2DArray[0].length; j++)
					{
						total += a2DArray[i][j];
					}
				}
				return total;
		    }//end findGroupTotal Method

		//This method takes a 2D array as input parameter and returns
		//the smallest element inside
		public static double findLeastAmtFood(double[][] a2DArray)
		{
		    double leastAmt = a2DArray[0][0];
		    for(int i = 0; i < a2DArray.length; i++)
		    {
				for(int j = 0; j <a2DArray[0].length; j++)
				{
					if(a2DArray[i][j] < leastAmt)
					{
						leastAmt = a2DArray[i][j];
					}
				}
			}
			return leastAmt;
		}//end of findLeastAmtFood Method

}//end of class