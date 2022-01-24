//**************************************************************************
// FILE: Assignment4.java
// Name: Frank
// Student ID: 1222843323
// Description: Assignment #4
// Instruction: //---- is where you need to write your own codes
//***************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

class Assignment4
{

   static Scanner scan = new Scanner(System.in);

   public static void main(String[] args)
   {
      Clothes oneCloth;

      //call method getClothesInfo() to get info. for oneCloth
      oneCloth = getClothesInfo();

      //call displayMenu() method to show the menu to user
      displayMenu();

      //Create two DecimalFormat objects used to format currency and percentage
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
               case 'S':	//change oneCloth size
                  {
                     String newSize, oldSize;
                     //System.out.print("\nEnter the new size: ");
                     newSize = scan.next();

                     //call Clothes accesscor to get its previous
                     //size before we change it, save it inside
                     //variable oldSize
                     oldSize = oneCloth.getSize();

                     //call Clothes class relevant mutator to change
                     //oneCloth size
                     oneCloth.setChangeSize(newSize);
                     System.out.print("\nThe size has been changed"
                            				+ " from " + oldSize + " to "
                            				+ newSize +"\n");
                  }
                  break;

               case 'C':	//change oneCloth color
                  {
                     String newColor, oldColor;
                     //System.out.print("\nEnter the new color: ");
                     newColor = scan.next();

                     //call Clothes relevant accessor to get its current color
                     //and save it inside variable oldColor
                     oldColor = oneCloth.getColor();

                     //call Clothes relevant mutator to change its color
                     //to the newColor
                     oneCloth.setChangeColor(newColor);
                     System.out.print("\nThe color has been changed"
                            				+ " from " + oldColor + " to "
                            				+ newColor + "\n");
                  }
                  break;

               case 'I':	//increase the price
                  {
                     double increaseRate;
                     //System.out.print("\nEnter the increase rate (0.08): ");
                     increaseRate = scan.nextDouble();

                     //call Clothes relevant method to raise the price
                     oneCloth.setRaisePrice(increaseRate);
                     double newPrice = oneCloth.getPrice();

                     System.out.print("\nPrice was increased by " + fmt2.format(increaseRate)
                            				+ ", the new price is " + fmt1.format(newPrice) +"\n");
                  }
                  break;

               case 'R':	//reduce the price
                  {
                     double decreaseRate;
                     //System.out.print("\nEnter the decrease rate (0.05): ");
                     decreaseRate = scan.nextDouble();

                     //call Clothes relevant method to reduce the price
                     oneCloth.setReducePrice(decreaseRate);
                     double newPrice = oneCloth.getPrice();
                     System.out.print("\nPrice was reduced by " + fmt2.format(decreaseRate)
                            				+ ", the new price is " + fmt1.format(newPrice) +"\n");
                  }
                  break;

               case 'P':  //call toString() to show the Clothes info. and print it on screen
                  System.out.print(oneCloth.toString());
                  break;
               case '?':  //display menu again
                  //call displayMenu() method here to show the menu
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
// getClothesInfo() method will allow user to enter a specific
// Clothes info. from keyboard, then create and return a Clothes
// object accordingly

   public static Clothes getClothesInfo()
   {
      //Local variables used to store a Clothes id, size
      //colr and price info.
      int itemId;
      String size, color;
      double price;

      System.out.print("\nWelcome to Target Clothing Dept");
	  System.out.print("\n==============================");
      //System.out.print("\nEnter clothes Id: ");
      //get user's input and store it inside variable itemId
      itemId = scan.nextInt();

      //System.out.print("\nEnter size: ");
      //get user's input and store it inside variable size
      size = scan.next();

      //System.out.print("\nEnter color: ");
      //get user's input and store it inside variable color
      color = scan.next();

      //System.out.print("\nEnter initial price: ");
      //get user's input and store it inside variable price
      price = scan.nextDouble();

	  //create a Clothes object by using above information
      Clothes aClothes = new Clothes(itemId, size, color, price);

      return aClothes;
   }

//****************************************************
// DisplayMenu() method display the menu on screen
   public static void displayMenu()
   {
      System.out.print( "\nChoose an Action\n");
	  System.out.print( "-------------------\n");
	  System.out.print( "S\t Change Clothes Size\n");
	  System.out.print( "C\t Change Clothes Color\n");
	  System.out.print( "I\t Increase the Price\n");
	  System.out.print( "R\t Reduce the Price\n");
	  System.out.print( "P\t Print Clothes Info\n");
	  System.out.print( "?\t Display the Menu\n");
      System.out.print( "Q\t Exit Program\n\n");
   }

} //end of Assignment4.java class