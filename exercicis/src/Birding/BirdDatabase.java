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
	public ArrayList<Bird> getBirds() {
		//this.birds=new ArrayList<Bird>();
		
		return this.birds;
		} 
	
	public int getIndex() {
		return this.index;
	}
	
	public boolean addingBird(Bird bird) {
		
		if(this.birds.contains(bird)) {
		
			return true;
			
		} else {
		
			return false;
		}
		
	}
	
	public void addBird(Bird b) {
		
		if(addingBird(b)==false) {
		this.birds.add(b);
		System.out.println("The Bird " + b.toString() + "is added");
		} else {
		birds.remove(b);
		System.out.println("The Bird is not added");
		}
	}
	
		
	/*
	 * public void addBird(String name, String latinName) { Bird nameBird = new
	 * Bird(); nameBird.setName(name); nameBird.setLatinName(latinName);
	 * 
	 * }
	 */
	

	public void printList(ArrayList<Bird> birds) {
		
		for (Bird bird : birds) {
			System.out.println(bird);
		}
				
	}
	
	
	/*
	 * public boolean observation(Bird birdObserv) {
	 * 
	 * if(this.birds.contains(birdObserv)) { return true; } else { return false; }
	 * 
	 * }
	 */
	
	/*
	 * public void observ(Bird birdObs) {
	 * 
	 * int num = 0; if(observation(birdObs)==true) {
	 * 
	 * num= num + 1; }
	 * 
	 * }
	 */
	/*
	 * public void countObservations(Bird birdObserv) {
	 * 
	 * int number=0; if(observation(birdObserv)) { number++;
	 * 
	 * }
	 * 
	 * }
	 */
	
	public void statistic(ArrayList<Bird> birds) {
		
		for(Bird b : birds) {
		
		System.out.println(b.toStatistics());
		
		}
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
