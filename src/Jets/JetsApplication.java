package Jets;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class JetsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		launch(kb);
	}
	public JetsApplication() {
		
		
	}
public static void listFleet(List<Set<String>> jets) {
 	   
        for (int i = 0; i <jets.size();	i++) { 
        System.out.println(planetRecord[0]);
        System.out.println(jets.get(i)); // print original set
        }
    } // needs to be tied to menu.
	
public static void displayUserMenu() {
		
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

		}
	/*	public static int readUserInput(Scanner kb) {
			 //long term goal is to check for correct in put.
			
		}
	}
	*/
	
public static void launch(Scanner kb) {
	boolean quit;
	List<Set<String>> jets;
	jets = AirField.populateAirfieldFromFile(); //returns jetlist into mainlaunch()
	
	do {
		displayUserMenu();
		int userNum = kb.nextInt(); 
		quit = methodCaller(userNum, jets);
	}while(quit);
	System.out.println("Thank you for using Jet Selector!");

	} // done!

public static boolean methodCaller (int UserNum, List<Set<String>> jets ) {
	boolean quit = false;
	switch (UserNum) {
	case 1: listFleet(jets);
		break;
	case 2: flyAllJets(jets);
		break;
	case 3: viewFastestJet(jets);
		break;
	case 4: viewJetWithLongestRange(jets);
		break;
	case 5: loadAllCargoJets(jets);
		break;
	case 6: Dogfight(jets);
		break;
	case 7: addAJetToFleet(jets);
		break;
	case 8: removeAJetFromFleet(jets);
		break;
	case 9: quit();
		quit =true;
		break;
	default: System.out.println("error switch");
		
	}
	return quit;
}/*
private static void flyAllJets() {
	// TODO Auto-generated method stub
	   
    for (int i = 0; i <jets.size(); i++) {
    System.out.println(jets.); // print original set
    }
} // needs to be tied to menu.
}*/
private static void addAJetToFleet(List<Set<String>> jets) {
	// TODO Auto-generated method stub
	System.out.print("\nWelcome to Airplane Add:\nEnter name of the plane:" );
	userPlaneName = next();
	System.out.print("\nEnter range of the plane:" );
	userPlaneRange = next();
	System.out.print("\nEnter range of the plane:" );
	userPlaneRange = next();
	System.out.print("\nWelcome to Airplane Add:\nEnter name of the plane:" );
	userPlaneName = next();
	
}
private static void flyAllJets(List<Set<String>> jets) {

	for (int i = 0; i <jets.size(); i++) {
		
		System.out.println(jets.get(i)); // print original set
    }
}

}
