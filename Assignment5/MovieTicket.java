//**************************************************************************
// FILE: MovieTicket.java (Assignment #5)
// Name: Frank Stranathan
// Student ID: 1222843323
// Description: Assignment #5
// Course: ASU CSE110 Principles of Programming with Java
//***************************************************************************

import java.text.DecimalFormat;

class MovieTicket
{
	//declare instance variables
	private String title;
	private String row;
	private int seatNum;
	private double price;

	//write constructor
	public MovieTicket(String newTitle, String newRow, int newSeatNum, double newPrice)
	{
		title = newTitle;
		row = newRow;
		seatNum = newSeatNum;
		price = newPrice;

	}//End constructor

	//write accessor methods
	public String getTitle()
	{
		return title;

	}//End getTitle

	public String getRow()
	{
		return row;

	}//End getRow

	public int getSeatNum()
	{
		return seatNum;

	}//End getSeatNum

	public double getPrice()
	{
		return price;

	}//End getPrice

	//Write mutator methods
	public void setTitle(String newTitle)
	{
		title = newTitle;

	}//End setTitle

	public void setRow(String newRow)
	{
		row = newRow;

	}//End setRow

	public void setSeatNum( int newSeat)
	{
		seatNum = newSeat;

	}//End setSeatNum

	public void setAdjustPrice(double newPrice)
	{
		price = newPrice;

	}//End adjustPrice

	public void setDiscount(double discountRate)
	{
		price = price * (1 - discountRate);

	}//End of discount method

	public String toString()
	{
		DecimalFormat fmt = new DecimalFormat("$0.00");
		String ticketInfo = "";

		ticketInfo += "\nTitle:\t" + title
					  +"\nRow:\t" + row
					  +"\nSeat:\t" + seatNum
					  +"\nPrice:\t" + fmt.format(price)
					  +"\n\n";
		return ticketInfo;
	}


}//End of MovieTicket Class