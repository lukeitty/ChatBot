import java.util.Scanner;

/**
* This is a Chat Bot Program
* This program will talk to you and you can answer questions.
* You can leave the conversation by saying "Bye" or "bye"
* @author: Luke Ittycheria
* @version: 2.0
*/

public class ChatBot
{
	
	/**
	* This is the main method that the java interpreter calls
	* @param args This is a command line argument
	*/

	public static void main(String[] args)
	{
		// create/construct a Scanner obj
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = kb.nextLine();
		
		
		while(!(name.equals("Bye") || name.equals("bye")))
		{
			System.out.print("Hi " + name + "!. How are you doing today? ");
			String input = kb.nextLine();
			System.out.println("Your answer is: " + input);
		
		
			System.out.print("How old are you? ");
			int age = kb.nextInt();
		
			if (age > 30)
			{
				System.out.println(name + ", you are old!");
		
			}
		
			else
			{
				System.out.println("nice!");
			}	
			
			System.out.print("How tall are you: ");
			double height = kb.nextDouble();
			//to get rid of the newline character left by you kb.nextDouble()
			kb.nextLine(); //This is return the newLine() character as String but we don't store it in any String
			if (height > 6.0)
			{
				System.out.println(name + ", you are tall!");
			}
		
			else if (height > 5.0)
			{
				System.out.println(name + ", good height");
			}
		
			else
			{
				System.out.println(name + ", you are short! :P");
			}
			System.out.println("I would like to chat again!");
			System.out.print("Please enter your name: ");
			name = kb.nextLine();
				
		}
				
	
	}


}