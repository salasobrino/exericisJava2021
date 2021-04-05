package Birding;

public class Menu {
	
		
	public Menu() {
			
	}
	
	
	
	public void Options(String option ) {
		
		if(option.equals("Option?")) {
			System.out.println("Option?" + "Quit" + "Add" + "Observation");
			
		}
		
		System.out.println("Bye");
		
	}
	
	public String toString() {
		
		return "Option?" + "Quit" + "Add" + "Observation";
	}

}
