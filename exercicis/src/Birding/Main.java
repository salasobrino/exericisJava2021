package Birding;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//init, in this case, reader and handle events: while
		System.out.println("loading ...."  + "\n");
		
		Scanner scanner = new Scanner(System.in);
		BirdDatabase db = new BirdDatabase();
		
		while (true) {
			
	    	
			String command = ask(scanner, "Option?");
				if (command.equals("Quit")) {
					break;
				} else if (command.equals("Add")) {
					add(scanner,db);
				} else if (command.equals("Observation")) {
					observation(scanner,db);
				} else if (command.equals("Show")) {
					show(scanner,db);
				} else if (command.equals("Statistics")) {
					statistics(scanner,db);
				} else {
					System.out.println("Unknown command!");
				}
			}
		}
	
		public static String ask(Scanner input, String option) {
			
			System.out.println(" Choose one option ...\n"); 
			System.out.println(" Add: Add a new Bird");
			System.out.println(" Observation: How Observation the birds do you do?");
			System.out.println(" Show: Show birds that you see");
			System.out.println(" Statistics: Statistics the birds observations");
			System.out.println(" Quit: Scape");
						
			Scanner scanner = new Scanner(System.in);
			
			String choose = scanner.nextLine();
			
		   	return choose;
					
		}
		public static void add(Scanner input, BirdDatabase db) { 
			Scanner scanner = new Scanner(System.in);
			String add1 = scanner.nextLine();
			String add2 = scanner.nextLine();
			db = new BirdDatabase(add1,add2);
			db.addBird(add1, add2);
			
			System.out.println(db);
			
			
		}
		public static void observation(Scanner input, BirdDatabase db) {
			Scanner scanner = new Scanner(System.in);
			String observ = scanner.nextLine();
			
			
			if(db.observation(observ)){
				System.out.println("What was observed:? " + db.getName());
				
			} else {
				
				System.out.println("Is not a bird!\n");
			}
		
		}
		public static void show(Scanner input, BirdDatabase db) { }
		public static void statistics(Scanner input, BirdDatabase db) { }

		

	}


