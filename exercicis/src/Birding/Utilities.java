package Birding;

import java.util.ArrayList;

public class Utilities {
	
	public static void printListExtended(ArrayList<BirdDatabase> bird) {
		System.out.println("Birds");
		System.out.println("------------------------------------------------------------");
		
		for (BirdDatabase birds : bird) {
			System.out.println(birds);
		}
	}

}
