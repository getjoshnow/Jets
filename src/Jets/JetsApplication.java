package Jets;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class JetsApplication {

	public static void main(String[] args) { 		// meets User Story #1 requirement 

		
		Scanner kb = new Scanner(System.in);
//		launch(kb);
		
//		Jet.FighterJet() fj = new Jet.FighterJet();
		//will need
        List <CargoPlane> jetslist = new ArrayList<CargoPlane>(); 
        jetslist = AirField.populateAirfieldFromFile();
        
        displayUserMenu(); // User Story #4 Requirements
        System.out.println();
        listFleet(jetslist); // User Story #5 Requirements
        System.out.println("program working");
        viewJetWithLongestRange(jetslist);  //User Story #7
        viewFastestJet(jetslist);//User Story #7
        removeAJetFromFleet(jetslist, kb);
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
	
		
public static void displayUserMenu() { //User Story #4 Requirements
	System.out.println("**************Welcome to Jet selector.******************");
System.out.println("Scanner\n" + "	1. List fleet\n" + "	2. Fly all jets\n" + "	3. View fastest jet\n"
		+ "	4. View jet with longest range\n" + "	5. Load all Cargo Jets\n" + "	6. Dogfight!\n"
		+ "	7. Add a jet to Fleet\n" + "	8. Remove a jet from Fleet\n" + "	9. Quit");
System.out.print("Select an option within this menu: ");

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
*/
	private static void viewJetWithLongestRange(List jets) { //User Story #7

		int maxRange = 0;
		int maxIndex = 0;
		int CurRange = 0;
		for (int i = 0; i < jets.size(); i++) {
			CurRange = ((Jet) jets.get(i)).getRange();
  			
  			if (maxRange < CurRange) {
 // 			System.out.println(maxRange);
				maxIndex = i;   //makes  current highest range
				maxRange = ((Jet) jets.get(i)).getRange();
			}
		}//for loop
			System.out.println("\n\nThe Longest Range Vehicle is: " + maxRange + " nautical miles");
			System.out.println(jets.get(maxIndex));
		
}

	private static void viewFastestJet(List jets) {//User Story #7
		double maxRange = 0;
		int maxIndex = 0;
		double CurRange = 0;
		for (int i = 0; i < jets.size(); i++) {
			CurRange = ((Jet) jets.get(i)).getSpeed();
  			
  			if (maxRange < CurRange) {
 // 			System.out.println(maxRange);
				maxIndex = i;   //makes  current highest range
				maxRange = ((Jet) jets.get(i)).getSpeed();
			}
		}//for loop
			System.out.println("\n\nThe Fastest Vehicle is: " + maxRange + " mph");
			System.out.println(jets.get(maxIndex));
		
}
	
	
	private static void removeAJetFromFleet(List jets, Scanner kb) { // works User Story #10
		listFleet(jets);
		System.out.print("Enter the number you would like to remove:");
		int removeNum = kb.nextInt();

		System.out.print("Removing Vehicle #"+removeNum); // Alice
		jets.remove(removeNum);
		System.out.print("Removed Vehicle #"+removeNum); // Alice
		listFleet(jets);
		
	}
/*


private static void flyAllJets(List<Set<String>> jets) {

	for (int i = 0; i <jets.size(); i++) {
		
		System.out.println(jets.toString()); // print original set
    }
}
}
*/
}

