//**************************************************************************
// FILE: Assignment2.java
// Name: Frank Stranathan
// Student ID: 1222843323
// Description:This program displays multiple gym membership options and prints selected options picked by the user
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

//import required classes
import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment2
{
	public static void main(String[] args)
	{
		//create scanner object and format numbers like currency
		Scanner read = new Scanner(System.in);
		DecimalFormat look = new DecimalFormat("####0.00");

		//declare variables
		String customerName = "";
		int memberCategory;
		int numPeople;
		char buyShirt;
		char delivery = 'N';
		final double SHIRT_PRICE = 24.99;
		final double DELIVERY_FEE = 4.99;
		final double MONTH1 = 44.500;
		final double MONTH3 = 120.150;
		final double MONTH6 = 226.950;
		final double MONTH12 = 427.200;
		double shirtCost = 0.00;
		double memberCost = 0.00;
		double deliveryCost = 0.00;
		double totalCost;
		double perPerson = 0.00;


		//print membership menu
		//System.out.println("* * * * * Mountainside Fitness Center Program * * * * *");
		//System.out.println("Category #1\tMonth-To-Month Membership\t$44.50 per month");
		//System.out.println("Category #2\t3-Month Membership\t\t10% discount");
		//System.out.println("Category #3\t6-Month Membership\t\t15% discount");
		//System.out.println("Category #4\t12-Month Membership\t\t20% discount");

		//collect user input
		//System.out.println("\n Customer Name: ");
		customerName = read.nextLine();

		//System.out.println("Pick membership category (1~4): ");
		memberCategory = read.nextInt();

		//System.out.println("Number of people: ");
		numPeople = read.nextInt();

		//System.out.println("Do you want to purchase group sport shirts for each member?(Y/N): ");
		buyShirt = read.next().toUpperCase().charAt(0);
			if (buyShirt == 'N')
			{

			}
			else
			{
				//System.out.println("Do you want the shirts delivered? (Y/N): ");
				delivery = read.next().toUpperCase().charAt(0);
			}

		//calculate membership cost, shirt cost, shipping cost, and total cost
		if (memberCategory == 1)
		{
			memberCost = (numPeople * MONTH1);
			perPerson = MONTH1;
		}
		else
		{
			if (memberCategory == 2)
				memberCost = (numPeople * MONTH3);
			else if (memberCategory == 3)
					 memberCost = (numPeople * MONTH6);
				 else if (memberCategory == 4)
				 	   memberCost = (numPeople * MONTH12);
		}

		if (buyShirt == 'Y')
		{
			shirtCost = (numPeople * SHIRT_PRICE);
		}

		if (delivery == 'Y' && numPeople <= 10)
		{
			deliveryCost = (numPeople * DELIVERY_FEE);
		}
		else
		{
			if (delivery == 'N')
				deliveryCost = 0.00;
			else if (delivery == 'Y' && numPeople >= 10)
					deliveryCost = 50.00;
		}

		totalCost = (memberCost + shirtCost + deliveryCost);

		if (memberCategory == 1)
		{
			perPerson = MONTH1;
		}
		else
		{
			if (memberCategory == 2)
				perPerson = MONTH3;
			else if (memberCategory == 3)
					perPerson = MONTH6;
				 else if (memberCategory == 4)
				 		 perPerson = MONTH12;
		}

		//print invoice for user
		//System.out.println("======================================");
		//System.out.println("Mountainside Fitness Center Invoice");
		//System.out.println("Customer: " + customerName);
		//System.out.println(look.format(numPeople) + " " + "people @ " + look.format(perPerson) + " "+ "each = " + look.format(memberCost));
		//System.out.println("Delivery Charge = " + look.format(deliveryCost));
		//System.out.println("Total amount due = " + look.format(totalCost));
	}
}