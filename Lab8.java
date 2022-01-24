/*-------------------------------------------------------------
// AUTHOR: Frank Stranathan
// ASU ID: 1222843323
// FILENAME: Lab8
// SPECIFICATION: Learn how to define, initalize and use arrays
//-----------------------------------------------------------*/

import java.util.Scanner;
import java.text.DecimalFormat;

class Lab8
{
	public static void main(String[] args)
	{
		//Variable declaration
		int arraySize;
		double currentElement = 0;
		double sumElement = 0;
		double largeElement;
		int negElement;

		Scanner read = new Scanner(System.in);
		DecimalFormat fmt1 = new DecimalFormat("0.00");

		//collect user input
		//System.out.print("\n" + "Enter size of the array: ");
		arraySize = read.nextInt();

		//declare and create an array
		double[] sizeArray = new double[arraySize];

		//fill the array
		for(int i = 0; i < sizeArray.length; i++)
		{
			//System.out.print("\nEnter array element #" + " " + i + ": ");
			currentElement = read.nextDouble();
			sizeArray[i] = currentElement;
		}

		//display the elements of the array in reverse order
		System.out.print("\nArray content is: ");
		for(int i = sizeArray.length - 1; i >= 0; i--)
		{
			System.out.print(sizeArray[i] + " ");
			sumElement += sizeArray[i];
		}
		System.out.println();

		//count the number of negative elements and find the largest element inside an array
		negElement = 0;
		largeElement = sizeArray[0];
		for(int i = 0; i < sizeArray.length; i++)
		{
			if(sizeArray[i] < 0)
			{
				negElement++;
			}

			if(sizeArray[i] > largeElement)
			{
				largeElement = sizeArray[i];
			}
		}

		//display output
		System.out.print("\nSum of the array elements is " + sumElement + "\n");
		System.out.print("\n" + negElement + " " + "array elements are negative." + "\n");
		System.out.print("\nThe largest array element is " + largeElement + "\n");

	}//end main method

}//end class Lab8