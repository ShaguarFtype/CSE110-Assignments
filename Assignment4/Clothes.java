//**************************************************************************
// FILE: Assignment4.java (Clothes.java)
// Name: Frank Stranathan
// Student ID: 1222843323
// Description: Assignment #4
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.text.DecimalFormat;

class Clothes
{
	//Declare instance variables
	private int itemId;
	private String size;
	private String color;
	private double price;

	//Constructor Method
	public Clothes(int newId, String newSize, String newColor, double newPrice)
	{
		itemId = newId;
		size = newSize;
		color = newColor;
		price = newPrice;

	} //end of constructor class

	//Define Accessor Methods for instance variables
	public int getItemId()
	{
		return itemId;
	}

	public String getSize()
	{
		return size;
	}

	public String getColor()
	{
		return color;
	}

	public double getPrice()
	{
		return price;
	}

	//Define mutator methods
	public void setChangeId(int newId)
	{
		itemId = newId;
	}

	public void setChangeSize(String newSize)
	{
		size = newSize;
	}

	public void setChangeColor(String newColor)
	{
		color = newColor;
	}

	public void setRaisePrice(double increaseRate)
	{
		price = price * (1 + increaseRate);
	}

	public void setReducePrice(double decreaseRate)
	{
		price = price * (1 - decreaseRate);
	}

	//define toString() method
	public String toString()
	{
		DecimalFormat money = new DecimalFormat("$0.00");
		String clothInfo = "";

		clothInfo += "\nID:\t\t" + itemId + "\nSize:\t" + size
					  + "\nColor:\t" + color + "\nPrice:\t" + money.format(price) + "\n";
		return clothInfo;
	}




} //end Clothes Class