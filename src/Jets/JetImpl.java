package Jets;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JetImpl extends Jet {  //User Story #9

	public JetImpl(String model, double speed,int range,  long price) {
		super(model,  speed,range, price);
	}


	public static void addAJetToFleet(List jets, Scanner kb) {
		
		// TODO Auto-generated method stub
		System.out.print("\nWelcome to Airplane Add:\nEnter name of the plane:" );
		String userPlaneName = kb.next();
		System.out.print("\nEnter speed of the plane in MPH" );
		double userPlaneSpeed = kb.nextDouble();
		System.out.print("\nEnter range of the plane:(whole numbers)" );
		int userPlaneRange = kb.nextInt();
		System.out.print("\nEnter price of the plane:" );
		long userPlanePrice = kb.nextLong();
		
		
		jets.add(new JetImpl(userPlaneName, userPlaneSpeed, userPlaneRange, userPlanePrice));

	}
}
