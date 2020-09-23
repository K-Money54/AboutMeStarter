/*
 * Programmer: Kayden Dunlop
 * Date: September 22, 2020
 * Purpose: to say my name, age and then let time pass, and say what it is now.
 */

public class AboutMe {
    public static void main (String [] args) {
		String myName = "Kayden";
		int myAge = 16;	
		double myHeightInMetres = 1.82;
			
        System.out.println("Hi, my name is " + myName +".");
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        myAge = 18;
        myHeightInMetres = 2;
      
        // Print the new values
        System.out.println("Some time passes...");
        System.out.println("I am now " + myAge + " years old.");
        System.out.println("I have grown and am " + myHeightInMetres + " m tall.");
        
    }
}
