/*-------------------------------------------------------------
// AUTHOR: Frank Stranathan
// ASU ID: 1222843323
// FILENAME: Student
// SPECIFICATION: Create student object and update major
//-----------------------------------------------------------*/

class Student
{
	//Define Instance Variables
	private int studentId;
	private String firstName;
	private String lastName;
	private String major;
	private int gradePoints;
	private int totalCredits;

	//Define the constructor
	public Student(int Id, String fName, String lName, String major, int points, int credits)
	{
		studentId = Id;
		firstName = fName;
		lastName = lName;
		this.major = major;
		gradePoints = points;
		totalCredits = credits;
	}

	//method to get the Id of the student object
	public int getId()
	{
		return studentId;
	}

	//method to get full name of the student
	public String getFullName()
	{
		return firstName + " " + lastName;
	}

	//method to get student major
	public String getMajor()
	{
		return major;
	}

	//method to get number of grade points
	public int getGradePoints()
	{
		return gradePoints;
	}

	//method to get number of credits
	public int getCredits()
	{
		return totalCredits;
	}

	//method to change major (change major name only)
	public void changeMajor(String newMajor)
	{
		major = newMajor;
	}

	//method to change major and update major
	public void changeMajor(String newMajor, int newPoints, int newCredits)
	{
		// If newPoints and newCredits are less than or equal to their respective instance variable, update
		// the students major variable to its new major. Otherwise, print an error message 'Invalid attempt
		if(newPoints <= gradePoints && newCredits <= totalCredits)
		{
			changeMajor(newMajor);
		}
		else
		{
			System.out.println("\nInvalid attempt" + "\n");
		}
	}

	public String toString()
	{
		String studentInfo = "";
		studentInfo = "ID:\t\t\t" + studentId + "\n"
					   + "Name:\t\t" + firstName + " " + lastName + "\n"
					   + "Major:\t\t" + major + "\n"
					   + "Points:\t\t" + gradePoints + "\n"
					   + "Credits:\t" + totalCredits + "\n";

		return studentInfo;
	}


}//End of Student Class