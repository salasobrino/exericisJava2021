package Birding;

import java.util.ArrayList;

public class Utilities {
	
	public static void printListExtended(ArrayList<Bird> birds) {
		System.out.println("Birds Addeds");
		System.out.println("------------------------------------------------------------");
		
		
		
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}
	
	public static void printListObservations(ArrayList<Bird> birds) {
		
		System.out.println("Birds Observateds");
		System.out.println("------------------------------------------------------------");
		
		for (Bird bird : birds) {
			System.out.println(bird);
			
			System.out.println(bird.toString());
		
		
		}
	}
	
}
	
