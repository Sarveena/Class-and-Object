Create a class named Team with the following private member variables/attributes. 
String name; 
String coach; 
String location; 
String  players 
String  captain 

Include appropriate getters and setters. 
[Naming Convention: 
getters : getName getCoach .. 
setters : setName, setCoach...] 
  
Include a method in the class named displayTeamDetails(). In this method, display the details of the delivery in the format shown in the sample output. This method does not accept any arguments and its return type is void. 

Create another class called Main and write a main method to test the above class. 

 Input and Output Format: 
 Refer sample input and output for formatting specifications. 
All text in bold corresponds to input and the rest corresponds to output. 

 Sample Input and Output : 
Enter the team name 
CSK             
Enter the coach name 
Stephen Fleming 
Enter the location name 
Chennai 
Enter the players name 
MS Dhoni,Aswin,Raina,Hussey,Maxwel,Bravo,Morkel,Jadeja,Mohit Sharma,Hayden,du plessis,Abhinav Mukund 
Enter the captain name 
MS Dhoni 
Team Details 
Team : CSK 
Coach : Stephen Fleming 
Location : Chennai 
Players : MS Dhoni,Aswin,Raina,Hussey,Maxwel,Bravo,Morkel,Jadeja,Mohit Sharma,Hayden,du plessis,Abhinav Mukund 
Captain : MS Dhoni 


public class Team
{
String name; 
String coach; 
String location; 
String players;
String captain;

    public String getName()
    {
        return name;
    }
  
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getCoach()
    {
        return coach;
    }
    
    public void setCoach(String coach)
    {
        this.coach = coach;
    }
    
     public String getLocation()
    {
        return location;
    }
  
    public void setLocation(String location)
    {
        this.location = location;
    }
    
     public String getPlayers()
    {
        return players;
    }
  
    public void setPlayers(String players)
    {
        this.players = players;
    }
    
     public String getCaptain()
    {
        return captain;
    }
  
    public void setCaptain(String captain)
    {
        this.captain = captain;
    }
    public void displayTeamDetails(){
        System.out.println("Enter the team name");
        System.out.println("Enter the coach name");
        System.out.println("Enter the location name");
        System.out.println("Enter the players name");
        System.out.println("Enter the captain name");
        
        
        
    System.out.println("Team Details");
    System.out.println("Team : "+this.getName());
     System.out.println("Coach : "+this.getCoach());
      System.out.println("Location : "+this.getLocation());
       System.out.println("Players : "+this.getPlayers());
        System.out.println("Captain : "+this.getCaptain());
}
}

import java.util.*;

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String coach = sc.nextLine();
        String location = sc.nextLine();
        String players = sc.nextLine();
        String captain = sc.nextLine();
        Team t = new Team();
        t.setName(name);     
        t.setCoach(coach);
        t.setLocation(location);
        t.setPlayers(players);
        t.setCaptain(captain);
        t.displayTeamDetails();
    }
}

