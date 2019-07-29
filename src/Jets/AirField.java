package Jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AirField {

/*	public static void main(String[] args) {
        List <CargoPlane> jetslist = new ArrayList<CargoPlane>(); //User Story #2 requirements

		
        jetslist = populateAirfieldFromFile();	 //meets User Story #3 requirement from text
		
		}
*/
	public static List populateAirfieldFromFile() {
		
 //works List jets = new ArrayList<>(); // collection arraylist of 4? categories?
      
         List <Jet> jetslist = new ArrayList<Jet>(); // collection arraylist of 4? categories?
        
         try (BufferedReader bufIn = new BufferedReader(new FileReader("JetList.txt"))) {
             // passing file reader
             String line;
             while ((line = bufIn.readLine()) != null) {// give me the string into line variable
					// break up string 

						String delims = "[,]+";
						String[] lineSplit = line.split(delims);
			
						//public Jet(String model, int range, double speed, long price) {
						//convert happens here.
						String tempS = lineSplit[0]; 
						int tempI = Integer.parseInt(lineSplit[1]);
						double tempD = Double.parseDouble(lineSplit[2]);
						long tempP = Long.parseLong(lineSplit[3]);
						
						if (lineSplit[4].equalsIgnoreCase("fighter")) {
						// instanciate new jet
						jetslist.add(new FighterJet(tempS, tempI,tempD, tempP));
						}
						else {
						jetslist.add(new CargoPlane(tempS, tempI,tempD, tempP));

						}
						
          /*   System.out.println(lineSplit[0]);
             System.out.println(lineSplit[1]);
             System.out.println(lineSplit[2]);
             System.out.println(lineSplit[3]);
             */
             }
         } catch (IOException e) {
             System.err.println(e);
         }
         
         return jetslist;
 }
	
//Nothing Relevant below ************************************************************************
	
	public AirField() { // no Argos-constructor 
		
	}
}
