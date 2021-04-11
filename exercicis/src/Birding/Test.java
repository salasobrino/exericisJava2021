package Birding;

import java.util.ArrayList;

public class Test {
	
	public static void testAdd() {
		BirdDatabase db= new BirdDatabase();
		
		Bird un = new Bird("Raven", "Corvus Corvus");
		Bird dos = new Bird("Seagull", "Dorkus Dorkus");
		Bird tres = new Bird("Falcio", "de Clatell Blanc");
		
		db.addBird(un);
		db.addBird(dos);
		db.addBird(tres);
		
		un.toString();
		dos.toString();
		tres.toString();
		
		
	}
	
	public static void testObserv() {
		BirdDatabase db= new BirdDatabase();
		
		Bird un = new Bird("Raven", "Corvus Corvus");
		Bird dos = new Bird("Seagull", "Dorkus Dorkus");
		Bird tres = new Bird("Falcio", "de Clatell Blanc");
		
		db.addBird(un);
		db.addBird(dos);
		db.addBird(tres);
	}

}
