import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    Student(String firstname, String lastname, int identification, int[] scores)
    {
        super(firstname,lastname,identification);
        this.testScores = scores;
    }
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here

    public char calculate()
    {
        int sum = 0;
        int sum1 = 0;
        int i;
        char a='O';
       for(i=0;i<testScores.length;i++)
        {
            sum+=testScores[i];
        }
        sum1 = sum/testScores.length;
        //char ch = '0';
        if(sum1>=90&&sum1<=100)
            a = 'O';
        else if(sum1>=80&&sum1<90)
        a='E';
        else if(sum1>=70&&sum1<80)
        a='A';
        else if(sum1>=55&&sum1<70)
        a='P';
        else if(sum1>=40&&sum1<55)
        a='D';
        else if(sum1<40)
        a='T';
        return a;
    }
    
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
