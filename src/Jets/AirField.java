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

	public static List populateAirfieldFromFile() {
		
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
						int tempRange = Integer.parseInt(lineSplit[2]); //speed
						double tempSpeed = Double.parseDouble(lineSplit[1]);
						long tempPrice = Long.parseLong(lineSplit[3]);
						
						if (lineSplit[4].equalsIgnoreCase("fighter")) {
						// instanciate new jet
						jetslist.add(new FighterJet(tempS,tempSpeed,tempRange, tempPrice));
						}
						else {
						jetslist.add(new CargoPlane(tempS,tempSpeed,tempRange, tempPrice));

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
