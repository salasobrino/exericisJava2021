package Birding;

import java.util.ArrayList;

public class Utilities {
	
	public static void printListExtended(ArrayList<Bird> birds) {
		System.out.println("Birds");
		System.out.println("------------------------------------------------------------");
		
		
		
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}

}
