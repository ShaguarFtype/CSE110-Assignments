//**************************************************************************
// FILE: Assignment5.java
// Name: Frank Stranathan
// Student ID: 1222843323
// Description: Assignment 5, Movie Ticket Program
// Instruction: //---- is where you need to write your own codes
//***************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

class Assignment5
{

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
   {
      MovieTicket oneMovieTicket;

      oneMovieTicket = getMovieTicketInfo(); //call method getMovieTicketInfo() to get info. for oneMovieTicket

	  //call displayMenu() method to show the menu to user
      displayMenu();

	  //Two DecimalFormat object used to format currency and percentage
      DecimalFormat fmt1 = new DecimalFormat("$0.00");
      DecimalFormat fmt2 = new DecimalFormat("0.00%");

      char choice;
      do {
         //System.out.print("\nPlease enter a command: ");
         choice = (scan.next().toUpperCase()).charAt(0);

         if (choice != 'Q' )
         {
            switch (choice)
            {
               case 'T':
			   {	//change oneMovieTicket's title
			        String newTitle, oldTitle;
			        //System.out.print("\nEnter the new title: ");
			        //this line was needed to skip the line break caused by next()
			        //nextInt() or nextDouble() etc
			        scan.nextLine();
					newTitle = scan.nextLine();

			        //call MovieTicket class's accesscor to get its old
					//title before we change it, save it inside
					//variable oldTitle
                     oldTitle = oneMovieTicket.getTitle();
                     oneMovieTicket.setTitle(newTitle);
			         System.out.print("\nThe ticket title has been changed"
			       				+ " from " + oldTitle + " to "
			       				+ newTitle +"\n");
			   }
			   break;

               case 'R':
                  { //change oneMovieTicket's row number
                     String newRow, oldRow;
                     //System.out.print("\nEnter the new row: ");
                     //this line was needed to skip the line break caused by next()
					 //nextInt() or nextDouble() etc
					 scan.nextLine();
					 newRow = scan.nextLine();


                     //call MovieTicket class's accesscor to get its old
					 //row before we change it, save it inside
					 //variable oldRow
                     oldRow = oneMovieTicket.getRow();
                     oneMovieTicket.setRow(newRow);
                     System.out.print("\nThe ticket row has been changed"
                            				+ " from " + oldRow + " to "
                            				+ newRow + "\n");
                  }
                  break;

               case 'N':
                  { //change oneMovieTicket's seat number
                     int newSeatNum, oldSeatNum;
                     //System.out.print("\nEnter the new seat number: ");
                     newSeatNum = scan.nextInt();
                     oldSeatNum = oneMovieTicket.getSeatNum();
                     oneMovieTicket.setSeatNum(newSeatNum);
                     System.out.print("\nThe ticket seat number has been changed"
                            				+ " from " + oldSeatNum + " to "
                            				+ newSeatNum + "\n");
                  }
                  break;

               case 'I':
                  { //Adjust or increase the ticket price
                     double oldPrice, newPrice;
                     //System.out.print("\nEnter the new adjusted price: ");
                     scan.nextLine();
                     newPrice = scan.nextDouble();
                     oldPrice = oneMovieTicket.getPrice();
                     oneMovieTicket.setAdjustPrice(newPrice);

                     System.out.print("\nPrice was adjusted from " + fmt1.format(oldPrice)
                            				+ " to new price of " + fmt1.format(newPrice) +"\n");
                  }
                  break;

               case 'D':
                  { //discount the ticket price
                     double discountRate;
                     //System.out.print("\nEnter the discount (e.g. 0.05 for 5%): ");
                     discountRate = scan.nextDouble();
                     oneMovieTicket.setDiscount(discountRate);
                     double newPrice = oneMovieTicket.getPrice();
                     System.out.print("\nPrice was reduced by " + fmt2.format(discountRate)
                            				+ ", the new price is " + fmt1.format(newPrice) +"\n");
                  }
                  break;

               case 'S':  //call toString() to show the MovieTicket's info.
                  System.out.print(oneMovieTicket.toString());
                  break;
               case '?':  //display menu again
                  displayMenu();
                  break;
               default:
                  System.out.print("\nUnknown command\n");
                  break;
            } //end switch
         } //end if
      } while(choice != 'Q');
   } //end of main()

//***************************************************************
// getMovieTicketInfo() method will allow user to enter a ticket's
// info. from keyboard, then create and return a MovieTicket
// object accordingly
   public static MovieTicket getMovieTicketInfo()
   {
      //Local variables used to store a MovieTicket's title, row
      //& seat number, price info.
      String title, row;
      int seatNum;
      double price;
      System.out.print("\nWelcome to Harkins Theatre");
      System.out.print("\n==========================");

      //System.out.print("\nEnter movie title: ");
      //get user's input and store it inside variable title
      title = scan.nextLine();

   	  //System.out.print("\nEnter ticket row: ");
      //get user's input and store it inside variable row
      row = scan.nextLine();

      //System.out.print("\nEnter ticket number: ");
      //get user's input and store it inside variable seatNum
      seatNum = scan.nextInt();

      //System.out.print("\nEnter ticket price: ");
      //get user's input and store it inside variable price
      price = scan.nextDouble();

	  //create a MovieTicket object by using above information
      MovieTicket aMovieTicket = new MovieTicket(title, row, seatNum, price);

      return aMovieTicket;
   } //end of getMovieTicketInfo()

//****************************************************
// DisplayMenu() on screen
   public static void displayMenu()
   {
      System.out.print( "\nChoose an Action\n");
      System.out.print( "-------------------\n");
      System.out.print( "T\t Change Movie Ticket Title\n");
      System.out.print( "R\t Change Movie Ticket Row\n");
      System.out.print( "N\t Change Movie Ticket Number\n");
      System.out.print( "I\t Adjust Movie Ticket Price\n");
      System.out.print( "D\t Discount the Price\n");
      System.out.print( "S\t Show Movie Ticket Info.\n");
      System.out.print( "?\t Display the Menu\n");
      System.out.print( "Q\t Exit Program\n\n");
   } //end of displayMenu()

} //end of class