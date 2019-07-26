package Jets;

import java.util.Scanner;

public class Menu {

public int launchMenu() {
	// TODO Auto-generated constructor stub

	Scanner kb = new Scanner(System.in);
	
	System.out.println("**************Welcome to Jet selector.******************");
	System.out.println("Scanner\n" + 
			"	1. List fleet\n" + 
			"	2. Fly all jets\n" + 
			"	3. View fastest jet\n" + 
			"	4. View jet with longest range\n" + 
			"	5. Load all Cargo Jets\n" + 
			"	6. Dogfight!\n" + 
			"	7. Add a jet to Fleet\n" + 
			"	8. Remove a jet from Fleet\n" + 
			"	9. Quit");
	System.out.print("Select an option within this menu: ");
	int menu = kb.nextInt(); 
	
	return menu;
	}
}//end class
/*	public static int readUserInput(Scanner kb) {
		 //long term goal is to check for correct in put.
		
	}
}
*/