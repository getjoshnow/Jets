package Jets;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class JetsApplication {

	public static void main(String[] args) { // meets User Story #1 requirement

		Scanner kb = new Scanner(System.in);
		launch(kb);

	}

	public static void launch(Scanner kb) {
		boolean quit;
		int userNum = 0;
		List<CargoPlane> jetslist = new ArrayList<CargoPlane>();
		jetslist = AirField.populateAirfieldFromFile();

		do {
			displayUserMenu(); // User Story #4 Requirements
			userNum = readUserInput(kb, 1, 9); // checks between min and max values
			quit = methodCaller(userNum, jetslist, kb);

		} while (!quit); // User Story #11 Requirement met
		System.out.println("Thank you for using Jet Selector!");

	} // done! (Party TIME!!! )

	public JetsApplication() {

	}

	public static void displayUserMenu() { // User Story #4 Requirements done!
		System.out.println("**************Welcome to Jet selector.******************");
		System.out.println("Scanner\n" + "	1. List fleet\n" + "	2. Fly all jets\n" + "	3. View fastest jet\n"
				+ "	4. View jet with longest range\n" + "	5. Load all Cargo Jets\n" + "	6. Dogfight!\n"
				+ "	7. Add a jet to Fleet\n" + "	8. Remove a jet from Fleet\n" + "	9. Quit");
		System.out.print("Select an option within this menu: ");

	}

	public static int readUserInput(Scanner kb, int min, int max) { // long term goal is to check
		int userNum = 0;
		userNum = kb.nextInt();
		while ((min > userNum) && (max < userNum)) {
			System.out.println("Please select within " + min + " - " + max); // User Story #4 Requirements
			userNum = kb.nextInt();

		}
		return userNum;

	}

	public static boolean methodCaller(int UserNum, List jets, Scanner kb) {
		boolean quit = false;
		switch (UserNum) {
		case 1:
			listFleet(jets); // User Story #5 Requirements
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
			JetImpl.addAJetToFleet(jets, kb);
			break;
		case 8:
			removeAJetFromFleet(jets, kb);
			break;
		case 9:
			quit = true;
			System.out.println("Quit Selected,");
			break;
		default:
			System.out.println("error switch");

		}
		return quit;

//********************************MENU METHODS*************************************************
	}

	private static void Dogfight(List jets) {
		// makes all fighter jets fight.

		for (int i = 0; i < jets.size(); i++) {
			
			if (jets.get(i) instanceof FighterJet) {
				System.out.println("Fighter jet "+i );
			}
		}
	}

	private static void loadAllCargoJets(List<Set<String>> jets) {

		for (int i = 0; i < jets.size(); i++) {
			
			if (jets.get(i) instanceof CargoPlane) {
				System.out.println("Cargo Jet "+i );
			}
		}
		
		
	}

	private static void viewJetWithLongestRange(List jets) { // User Story #7

		int maxRange = 0;
		int maxIndex = 0;
		int CurRange = 0;
		for (int i = 0; i < jets.size(); i++) {
			CurRange = ((Jet) jets.get(i)).getRange();

			if (maxRange < CurRange) {
				// System.out.println(maxRange);
				maxIndex = i; // makes current highest range
				maxRange = ((Jet) jets.get(i)).getRange();
			}
		} // for loop
		System.out.println("\n\nThe Longest Range Vehicle is: " + maxRange + " nautical miles");
		System.out.println(jets.get(maxIndex));

	}

	private static void viewFastestJet(List jets) {// User Story #7
		double maxRange = 0;
		int maxIndex = 0;
		double CurRange = 0;
		for (int i = 0; i < jets.size(); i++) {
			CurRange = ((Jet) jets.get(i)).getSpeed();

			if (maxRange < CurRange) {
				maxIndex = i; // makes current highest range
				maxRange = ((Jet) jets.get(i)).getSpeed();
			}
		} // for loop
		System.out.println("\n\nThe Fastest Vehicle is: " + maxRange + " mph");
		System.out.println(jets.get(maxIndex));

	}

	private static void removeAJetFromFleet(List jets, Scanner kb) { // works User Story #10 done.
		listFleet(jets);
		System.out.print("Enter the number you would like to remove:");
		int removeNum = kb.nextInt();

		System.out.print("Removing Vehicle #" + removeNum);
		jets.remove(removeNum);
		System.out.print("Removed Vehicle #" + removeNum);
		listFleet(jets);

	}

	private static void flyAllJets(List jets) { // User Story #6 Requirement ***

		for (int i = 0; i < jets.size(); i++) {
			((Jet) jets.get(i)).fly(); // print original set
		}

	}

	public static void listFleet(List jets) { // User Story #5 done.

		for (int i = 0; i < jets.size(); i++) {

			System.out.print("#" + i + " ");
			System.out.println(jets.get(i)); // print original set
		}
	}

}
