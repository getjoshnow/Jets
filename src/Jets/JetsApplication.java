package Jets;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class JetsApplication {

	public static void main(String[] args) { 		// meets User Story #1 requirement 

		
		//	Scanner kb = new Scanner(System.in);
//		launch(kb);
		
//		Jet.FighterJet() fj = new Jet.FighterJet();
		//will need
        List <CargoPlane> jetslist = new ArrayList<CargoPlane>(); 
        jetslist = AirField.populateAirfieldFromFile();
        
  //      displayUserMenu(); // User Story #4 Requirements
        listFleet(jetslist); // User Story #5 Requirements
        System.out.println("program working");

/*		
		List mylist = new ArrayList<>();
		
		mylist.add("object 1");
		
		Iterator iterator = mylist.iterator();
		while (iterator.hasNext()){
			Object next = iterator.next();
			
			
		}
	
		for (int i = 0; i < mylist.size(); i++) {
			
			System.out.println(mylist);
		}
		*/
	}
public static void listFleet(List jets) { //User Story #5

		for (int i = 0; i < jets.size(); i++) {
			
			System.out.print("#"+i+" ");
			System.out.println(jets.get(i)); // print original set
		}
	} // needs to be tied to menu.
	
		
}	
		
	/*	
		
		
		ArrayList jetsList = new ArrayList();
				
		jetList.
		
		CargoPlane cj = new CargoPlane("testplane", 0, 0, 0); //Instantiation
		

		
	    // For ArrayList 
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(3); 
        System.out.println("ArrayList : " + list.toString());
        
        
        // Creating a mutable list using Arrays.asList() 
        List<Integer> list = new ArrayList<>( 
            Arrays.asList(1, 2, 3)); 
  
        
        // Print the list 
        System.out.println("List : " + list.toString()); 
  
        list.add(5); 
  
        // Print the list 
        System.out.println("Modified list : " + list.toString()); 
    }

}}

	/

	public JetsApplication() {

	}

	public static void listFleet(List jets) { User Story #5

		for (int i = 0; i < jets.size(); i++) {
			System.out.println(jets.get(i)); // print original set
		}
	} // needs to be tied to menu.

	public static void displayUserMenu() { User Story #4 Requirements
		System.out.println("**************Welcome to Jet selector.******************");
		System.out.println("Scanner\n" + "	1. List fleet\n" + "	2. Fly all jets\n" + "	3. View fastest jet\n"
				+ "	4. View jet with longest range\n" + "	5. Load all Cargo Jets\n" + "	6. Dogfight!\n"
				+ "	7. Add a jet to Fleet\n" + "	8. Remove a jet from Fleet\n" + "	9. Quit");
		System.out.print("Select an option within this menu: ");

	}

	public static int readUserInput(Scanner kb) {
		// long term goal is to check for correct in put.

	}

	}

	public static void launch(Scanner kb) {
		boolean quit;
		List<Set<String>> jets;
		jets = AirField.populateAirfieldFromFile(); // returns jetlist into mainlaunch()

		do {
			displayUserMenu();
			int userNum = kb.nextInt();
			quit = methodCaller(userNum, jets);
		} while (quit);
		System.out.println("Thank you for using Jet Selector!");

	} // done!

	public static boolean methodCaller(int UserNum, List<Set<String>> jets) {
		boolean quit = false;
		switch (UserNum) {
		case 1:
			listFleet(jets);
			break;
		case 2:
			flyAllJets(jets);
			break;
		case 3:
			viewFastestJet(jets);
			break;
		case 4:
			viewJetWithLongestRange(jets);
			break;
		case 5:
			loadAllCargoJets(jets);
			break;
		case 6:
			Dogfight(jets);
			break;
		case 7:
			addAJetToFleet(jets);
			break;
		case 8:
			removeAJetFromFleet(jets);
			break;
		case 9:
			quit = true;
			break;
		default:
			System.out.println("error switch");

		}
		return quit;
//********************************MENU METHODS*************************************************
	}

	private static void Dogfight(List<Set<String>> jets) {
		// makes all fighter jets fight.

		for (int i = 0; i < jets.size(); i++) {
			// enables fight ()
		}
	}

	private static void loadAllCargoJets(List<Set<String>> jets) {
		// TODO Auto-generated method stub
		for (int i = 0; i < jets.size(); i++) {
			// enables load ()
		}
	}

	private static void viewJetWithLongestRange(List<Set<String>> jets) {
		// TODO Auto-generated method stub
		int maxRange = jets.getClass().getRange(0);
		int maxIndex;
		for (int i = 0; i < jets.size(); i++) {
			if (Range > maxRange) {
				maxRange = jets.getRange();
				maxIndex = jets.get(i);
			}
			System.out.println("The Longest Range Vehicle is:");
			System.out.println(jets.get(maxIndex));
			// enables load ()
		}
	}

	private static void viewFastestJet(List<Set<String>> jets) {
		// TODO Auto-generated method stub
		int maxSpeed = jets.getClass().getSpeed(0);
		int maxIndex;
		for (int i = 0; i < jets.size(); i++) {
			if (speed > maxSpeed) {
				maxSpeed = jets.getRange();
				maxIndex = jets.get(i);
			}
			System.out.println("The Longest Range Vehicle is:");
			System.out.println(jets.get(maxIndex));
			// enables load ()
		}
	}

	private static void removeAJetFromFleet(List<Set<String>> jets) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number you would like to remove:");
		int removeNum = kb.nextInt();

		String removed = strList.remove(removeNum);
		System.out.println(removed); // Alice

	}

private static void addAJetToFleet(List<Set<String>> jets, Scanner kb) {
	// TODO Auto-generated method stub
	System.out.print("\nWelcome to Airplane Add:\nEnter name of the plane:" );
	String userPlaneName = kb.next();
	System.out.print("\nEnter range of the plane:(whole numbers)" );
	int userPlaneRange = kb.nextInt();
	System.out.print("\nEnter speed of the plane in MPH" );
	double userPlaneSpeed = kb.nextDouble();
	System.out.print("\nEnter price of the plane:" );
	long userPlanePrice = kb.nextLong();
	
	
	 CargoPlane.(String model, int range, double speed, long price);

	// (userPlaneName,userPlaneRange,userPlaneSpeed,userPlanePrice);
	strList.add(0,"Queen of Hearts"); // command for adding jet(one variable)

}

private static void flyAllJets(List<Set<String>> jets) {

	for (int i = 0; i <jets.size(); i++) {
		
		System.out.println(jets.toString()); // print original set
    }
}
}
}
*/
