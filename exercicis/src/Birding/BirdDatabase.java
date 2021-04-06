package Birding;

import java.util.ArrayList;
import java.util.List;

public class BirdDatabase {
	
	private int index;
	private ArrayList <Bird> birds;
	
	public BirdDatabase() {
		this.birds = new ArrayList<Bird>();
		
	}
	
	public BirdDatabase(int index) {
		this.index=index;
		this.birds = new ArrayList<Bird>();
		
	}
	
		
	public void addBird(Bird b) {
		this.birds.add(b);
	}
	
		
	public void addBird(String name, String latinName) {
		Bird nameBird = new Bird();
		nameBird.setName(name);
		nameBird.setLatinName(latinName);
		
	//	setName(name);
	//	setLatinName(latinName);
	}
	
	public boolean findBird(String name) {
		
			
		if(this.birds.equals(name)) {
			return true;
			
		}
		return false;
		
	}
	
	public ArrayList<Bird> getBirds() {
		this.birds=new ArrayList<Bird>();
		
		return this.birds;
		}
	
	public void printList(ArrayList<Bird> birds) {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
				
	}
	
	//public boolean observation(String bird) {
		
		/*
		 * if(bird.equals(getName())) { return true; } else { return false; }
		 */
	public boolean observation(String bird) {
		if (birds.equals(bird)) {
			return true;
		}
		
		return false;
		
	}
		
//	}
	
	/*
	 * public void show() {
	 * 
	 * Utilities list= new Utilities();
	 * 
	 * System.out.println(list.printListExtended(ArrayList<BirdDatabase>)); }
	 */


	/*
	 * public String getName() { return name; }
	 * 
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * 
	 * public String getLatinName() { return latinName; }
	 * 
	 * 
	 * public void setLatinName(String latinName) { this.latinName = latinName; }
	 * 
	 * public String toString() {
	 * 
	 * return "Name: " + name + "\n" + "Latin Name: " + latinName + "\n"; }
	 */
	

}
