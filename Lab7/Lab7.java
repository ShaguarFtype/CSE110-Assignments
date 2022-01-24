/*-------------------------------------------------------------
// AUTHOR: Frank Stranathan
// ASU ID: 1222843323
// FILENAME: Lab7
// SPECIFICATION: Create student object and update major
//-----------------------------------------------------------*/

import java.util.Scanner;

class Lab7
{
	public static void main(String[] args)
	{
		//create scanner object
		Scanner read = new Scanner(System.in);

		//declare variables to store user input
		String firstName;
		String lastName;
		int studentId;
		String major;
		int gradePoints;
		int totalCredits;

		//collect user input
		//System.out.print("Enter first name: ");
		firstName = read.nextLine();

		//System.out.print("Enter last name: ");
		lastName = read.nextLine();

		//System.out.print("Enter student major: ");
		major = read.nextLine();

		//System.out.print("Enter Student ID: ");
		studentId = read.nextInt();

		//System.out.print("Enter # of points: ");
		gradePoints = read.nextInt();

		//System.out.print("Enter # of credits: ");
		totalCredits = read.nextInt();

		Student student1 = new Student(studentId, firstName, lastName, major, gradePoints, totalCredits);

		//call the getFullName() method to get the full name of the student.
		System.out.print("\nStudent Name:\t" + student1.getFullName() + "\n");

		//call the getId() method to get the ID of the student
		System.out.println("\nStudent ID:\t" + student1.getId() + "\n");

		//call the toString() method to get every info. of the student
		//show it on screen
		System.out.print(student1.toString());

		//Attempt to change the major to 'International Affairs' with 10 points and 500 credits
		//by calling changeMajor(String newMajor, int newPoints, int newCredits)
		//Note: if your program was designed correctly, this should not succeed, it should print the 'Invalid attempt" message.
		student1.changeMajor("International Affairs", 10, 500);

		//call getMajor() method and store the student's old major into variable oldMajor
		//String oldMajor = //----;
		student1.getMajor();
		String oldMajor = major;

		//Change the students major to
		//'International Affairs' by calling changeMajor(String newMajor) method
		student1.changeMajor("International Affairs");


		// Print out the following message on screen
		// <Student full name> has changed major from <Student_old_major> to <Student_new_major>
		System.out.println(student1.getFullName() + " has changed major from " + oldMajor + " to " + student1.getMajor() + "\n");

		//call toString() method to print student1's info. again on screen
		System.out.print(student1.toString());


	}//End of Main Method


}//End of Lab7 class
