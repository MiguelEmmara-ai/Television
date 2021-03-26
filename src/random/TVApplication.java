package random;

import java.util.Scanner;

public class TVApplication 
{
	public static void main(String[] args) 
	{
		// Instances that will be used for user's input.
		Scanner scanner = new Scanner(System.in);
		int userSelection = 0;
		
		// Initialises Television and RemoteControl objects for use.
		Television tv = new Television();
		RemoteControl rc = new RemoteControl(tv);
		
		// Do while loop to keep looping until user selects to go outside (6).
		do
		{
			// Outputs the state of the television.
			System.out.println(rc.getTelevision() + "\n");
			
			// Outputs the remote control menu.
			printRemoteMenu();
			
			// Gets user's desired operation.
			userSelection = scanner.nextInt();
			
			// States user's selection and perform relevant tasks.
			executeUserSelection(userSelection, rc);
		} while(!(userSelection == 6));

		// Closes the scanner as it is not used anymore.
		scanner.close();
	}

	public static void printRemoteMenu()
	{
		System.out.println("Press a Button on the Remote Control");
		System.out.println("1. Power 2. Volume Up by 50% 3. Volume Down by 50% 4. Channel Up 5. Channel Down 6. Go outside");
	}
	
	public static void executeUserSelection(int userSelection, RemoteControl rc)
	{
		// Switch case to determine what tasks to perform 
		// depending on user's selected operation.
		switch(userSelection)
		{
		case 1:
			System.out.println("Power Button Pressed\n");
			rc.powerButton();
			break;
		case 2:
			System.out.println("Volume Up by 50% Button Pressed\n");
			rc.volumeUpByHalf();
			break;
		case 3:
			System.out.println("Volume Down by 50% Button Pressed\n");
			rc.volumeDownByHalf();
			break;
		case 4:
			System.out.println("Channel Up Button Pressed\n");
			rc.channelUpButton();
			break;
		case 5:
			System.out.println("Channel Down Button Pressed\n");
			rc.channelDownButton();
			break;
		case 6:
			break;
		default: // If user makes an invalid selection...
			System.out.println("Please enter a valid number (1-6)\n");
		}
	}
}
