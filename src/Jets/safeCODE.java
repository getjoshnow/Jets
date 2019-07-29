package Jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/*On program startup, populate the AirField with at least 5 Jets of different types.

These jets must be read from a text file, where each line in the file contains data for
 a single Jet object. (done)

This file exists at the root of your Eclipse project. It can be comma- or tab-separated; 
either implementation is acceptable.
The method to parse a file into Jet objects should return a List<Jet>. Its parameter 
can be a String file name.
Remember to use String.split(regex) to break each line in the file into data to create
 an individual jet.
*/
public class safeCODE {

	public static void main(String[] args) {
		populateAirfieldFromFile();	
		}

	public static List populateAirfieldFromFile() {
		
		List jets = new ArrayList<>(); // collection arraylist of 4? categories?
      
         
         try (BufferedReader bufIn = new BufferedReader(new FileReader("JetList.txt"))) {
             // passing file reader
             String line;
             while ((line = bufIn.readLine()) != null) {// give me the string into line variable
					jets.add(line);
					System.out.println(jets);
					
	
					

             System.out.println();}
         } catch (IOException e) {
             System.err.println(e);
         }
         
         System.out.println("test2\n\n");
         System.out.println(jets.get(0));
         return jets;
 }
	
//Nothing Relevant below ************************************************************************
	
	public safeCODE() { // no Argos-constructor 
		
	}
}
