package Jets;

import java.util*;
private static final int MACH = 1234; //MACH IS Km/h
private String model;
private int range;
private double speed;
private long price;

public class Jets{
//*********************************************************************************************
CargoPlane cp1 = new CargoPlane("737 MAX",	839,	3,850, 99700000.00, CARGO);
CargoPlane cp2 = new CargoPlane("747(1982)",	907, 	10800, 83000000.00, CARGO);
CargoPlane cp3 = new CargoPlane("767 (1981))",	850,12200, 220000000.00, CARGO);
CargoPlane cp4 = new CargoPlane("777(Triple Seven - 1994)",945,9700, 300000000.00, CARGO);
CargoPlane cp5 = new CargoPlane("Boeing 787 Dreamliner (2009)",956, 13620, 292000000.00, CARGO);

//******************************************************************************************************888

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
//		launch(kb);
		
//		Jet.FighterJet() fj = new Jet.FighterJet();
		//will need parse() 
		//will need collection()
		//will need
		
		String str = "Welcome,20,30,40"; 
		String [] arrOfStr = str.split(","); 
		for(String a:arrOfStr) 
			System.out.println(a); 
		
		//List <CargoPlanes()> planes = new ArrayList<>();
		
		System.out.print(cp1);
		
		
		planes.add(cp1);
		planes.add(cp2);
		planes.add(cp3);
		planes.add(cp4);
		
		
//CREATE SHIT  ******************************************************************
		
		ArrayList<> jetsList = new ArrayList<>();
		
		jetList.
		
		CargoPlane cj = new CargoPlane("testplane", 0, 0, 0); //Instantiation
		
		nameArray[0] = cj.setModel();
		
		
		
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
}
/*
//************************************ FIGHTERMethod fight *******************************************************************8

public static List<Set<String>> populateAirfieldFromFile() {
	
	List<Set<String>> jets = new ArrayList<>(); // collection arraylist of 4? categories?
	for (int i = 0; i < jets.size(); i++) {
		jets.add(shL);
	}
	
	// tree set
	try (BufferedReader bufIn = new BufferedReader(new FileReader("JetList.txt"))) {
		// passing file reader
		String line;
		while ((line = bufIn.readLine()) != null) {// give me the string into line variable
			if ( counter = 0) { //reads all first arrays to contain String.
				String[] planeRecord = line.split(", ");
				else
					Set<String> shL;
				System.out.println(planeRecord[0]);
				jets.get(index).add(line);
			}
			System.out.println();
		} catch (IOException e) {
			System.err.println(e);
		}
		
		
		return jets;
	}
//************************************ CLASS ALLLL JETLIST *******************************************************************8
public class CargoPlane extends Jet implements CargoCarrier{

	public CargoPlane(String model, int range, double speed, long price) {
		super(model, range, speed, price);
	}
//************************************ CARGO PLANE *******************************************************************8
	public FighterJet(String model, int range, double speed, long price) {
		super(model, range, speed, price);
	}
	
	
//************************************ FIGHTERJET *******************************************************************8
	public  static void fight() {
		
		System.out.println("Fight initiated: Incoming Missle to Your location. \n\n. Run.");
	}
	
//************************************ AirField  *******************************************************************8

         public class NameApp {

        		public static void main(String[] args) {
        			// TODO Auto-generated method stub
        		    String fileName = "names.txt";
        		     try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
        		          String line;
        		          while ((line = bufIn.readLine()) != null) {
        		            String[] planetRecord = line.split(", ");
        		            System.out.println(planetRecord[0]);
        		          }
        		        }
        		        catch (IOException e) {
        		          System.err.println(e);
        		        }
        			//read from .txt
        			
        			
//        			Add each name to a List.
        			
        			
        		//	Add each name to a Set.
        			
        			
        			
        	//Display the size of the List, the size of the Set, and the number of lines		
        		    
         
         
         
//************************************ NAME ADDER   *******************************************************************8
//RANDOM*************************************************************************************
	public JetsApplication() {
		
		
	}
	public class StringSplitTest { //spliting into separate strings
		String str = "Welcome:dear guest"; 
		String [] arrOfStr = str.split(":"); 
		for(String a:arrOfStr) 
		System.out.println(a); } 
	}
	
	
public static void listFleet(List<Set<String>> jets) {
 	   
        for (int i = 0; i <jets.size();	i++) { 
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
	public static int readUserInput(Scanner kb) {
			 //long term goal is to check for correct in put.
			
		}
	}
	
	
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
	case 9: quit =true;
		break;
	default: System.out.println("error switch");
		
	}
	return quit;
}private static void Dogfight(List<Set<String>> jets) {
	// makes all fighter jets fight.
	
	for (int i = 0; i <jets.size(); i++) {
		// enables fight ()
    }
}
	
private static void loadAllCargoJets(List<Set<String>> jets) {
	// TODO Auto-generated method stub
	for (int i = 0; i <jets.size(); i++) {
		// enables load ()
    }
}
private static void viewJetWithLongestRange(List<Set<String>> jets) {
	// TODO Auto-generated method stub
	int maxRange = jets.getClass().getRange(0);
	int maxIndex;
	for (int i = 0; i <jets.size(); i++) {
		if (Range>maxRange) {
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
	for (int i = 0; i <jets.size(); i++) {
		if (speed>maxSpeed) {
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
	
	
	 Jet.CargoPlane(String model, int range, double speed, long price);
	 
	
	
	//(userPlaneName,userPlaneRange,userPlaneSpeed,userPlanePrice);
	strList.add(0, "Queen of Hearts"); // command for adding jet(one variable)
	
}
private static void flyAllJets(List<Set<String>> jets) {

	for (int i = 0; i <jets.size(); i++) {
		
		System.out.println(jets.get(i)); // print original set
    }
}
//*******************************************************************************************
public void fly() {
System.out.print(range/speed);
System.out.print(": amount of time(hrs) the jet can fly until it runs out of fuel. \n");
}
public double getSpeedInMach() {
	System.out.print(speed/MACH);
	System.out.println(" The Speed ");
	return 0.0;
}
*/

} 

