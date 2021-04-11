package Birding;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//init, in this case, reader and handle events: while
		System.out.println("loading ...."  + "\n");
		
		
		
			
		Scanner scanner = new Scanner(System.in);
		BirdDatabase db = new BirdDatabase();
		
		Test.testAdd();
		Test.testObserv();
		
		
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
		
			
		
			scanner.close();
			System.out.println("Finishing....\n" + "\n");
			
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
			ArrayList<Bird> birds = new ArrayList<Bird>();
			
			
			Scanner scanner = new Scanner(System.in);
			String add1 = scanner.nextLine();
			String add2 = scanner.nextLine();
			
			Bird bird=new Bird(add1, add2);
			
			if(db.addingBird(bird)==false) {
				
				System.out.println("Added");
											
			} else {
			
				System.out.println("Reffused");
			}
			
		
		}
			
		
		public static void observation(Scanner input, BirdDatabase db) {
			Scanner scanner = new Scanner(System.in);
			String observ = scanner.nextLine();
			
			System.out.println("What was observed:? ");
			
			Bird bird = new Bird(observ);
				if(bird.observation(observ)==true) {
				System.out.println("Bird" + bird + "has been observed");
				bird.numObserv(observ);
				System.out.println(bird.numObserv(observ));
				
			} else {
			
				System.out.println("Is not a Bird");
				
			}
			
			}
			
			
		public static void show(Scanner input, BirdDatabase db) { 
			Scanner scanner = new Scanner(System.in);
			String observ = scanner.nextLine();
			
			
			
		}
		public static void statistics(Scanner input, BirdDatabase db) {
			
			Scanner scanner = new Scanner(System.in);
			String observ = scanner.nextLine();
			Bird bird = new Bird();
			
			Utilities.printListObservations(null);
		}

		

	}


