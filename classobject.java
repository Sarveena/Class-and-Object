Venue
[Note :
Strictly adhere to the object oriented specifications given as a part of the problem statement.
Use the same class names and member variable names.
Create 2 separate classes in 2 separate files.] 

Create a class named Venue with the following member variables / attributes (Default access) 
Data Type	Variable Name
String	name
String	city
Create another class called Main and write a main method to test the above class. 

 Input and Output Format: 
 Refer sample input and output for formatting specifications. 
All text in bold corresponds to input and the rest corresponds to output. 

 Sample Input and Output : 
Enter the venue name 
M. A. Chidambaram Stadium 
Enter the city name 
Chennai 
Venue Details : 
Venue Name : M. A. Chidambaram Stadium 
City Name : Chennai


import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String city1 = sc.nextLine();
        Venue v = new Venue();
        v.name = name1;
        v.city = city1;
        System.out.println("Enter the venue name");
        System.out.println("Enter the city name");
        System.out.println("Venue Details :");
        System.out.println("Venue Name : "+v.name);
        System.out.println("City Name : "+v.city);        
        
    }
}

public class Venue{
    String name;
    String city;
}
