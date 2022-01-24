/*-------------------------------------------------------------
// AUTHOR: Frank Stranathan
// FILENAME: Lab 6
// SPECIFICATION: Convert Tempature, find number of characters, determine if number is prime
// FOR: CSE 110 Lab #6
//-----------------------------------------------------------*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab6
{
	public static void main(String[] args)
	{
		 Scanner read = new Scanner(System.in);
		 int choice;

		 do
		 {
		            displayMenu();
		            choice = read.nextInt();
		            read.nextLine();

		            switch (choice)
		            {
		                case 1:
		                        //System.out.print("Enter the number: ");
								int num = read.nextInt();

		                        boolean primeNum = checkPrime(num);

		                        if(primeNum == true)
								   	System.out.println(num + " is prime");
								else
								 	System.out.println(num + " is NOT a prime");
                			break;

		                case 2:
		                		//System.out.print("\nEnter the fahrenheit tempature: ");
		                		double farenTemp = read.nextDouble();

		             			DecimalFormat case2 = new DecimalFormat("0.00");
		             			double celcius = tempConvert(farenTemp);
		             			System.out.println("Fahrenheit" + " " + farenTemp + " " + "degree is equivalent to Celcis" + " " + case2.format(celcius) + " " + "degree");

		                    break;
		                case 3:
								//System.out.print("\nEnter a sentence: ");
								String sentence = read.nextLine();
								System.out.println();

								int numOfE = countE(sentence);
								System.out.println("The sentence contains" + " " + numOfE + " " + "'e'" + " " + "and" + " " + "'E'");
		                        break;
					}
         } while(choice != 4);
	}

	public static void displayMenu()
	{
		System.out.println("ASU CSE110 Lab #6 - Methods");
		System.out.println();
		System.out.println("1) Check to see whether a number is prime or not");
		System.out.println("2) Convert temperature from Fahrenheit to Celsius");
		System.out.println("3) Count the number of character 'e' & 'E' in a string");
		System.out.println("4) Quit");
		System.out.println();
		//System.out.print("Please choose your choice from above menu: ");
		System.out.println();
	}//End Menu Method


	public static boolean checkPrime(int num)
	{
		int check;

		for(int i = 2; i < num; i++)
		{
			check = (num % i);
			if(check == 0)
				return false;
		}
		return true;
    }//End checkPrime Method

    public static double tempConvert(double farenTemp)
    {
		double F = farenTemp;
		double tempature = (5.0/9.0) * (F-32);
	    return tempature;

    }//End tempConvert Method

    public static int countE(String line)
	{
		int numOfE = 0;    //a counter

		for (int index = 0; index < line.length(); index++)
		{
		    if((line.charAt(index)) == ('e') || line.charAt(index) == ('E'))
		        numOfE++;
		}
		return numOfE;

    }//End countE Method


}//End public class