package Birding;

import java.util.ArrayList;

public class BirdDatabase {
	
	String name;
	String latinName;	
	
	public BirdDatabase() {
		
	}
	
	
	public BirdDatabase(String name, String latinName) {
		
		this.name=name;
		this.latinName=latinName;
				
	}
	
	public void addBird(String name) {
		setName(name);
		
	}
	
	public void addBird(String name, String latinName) {
		setName(name);
		setLatinName(latinName);
	}
	
	public boolean observation(String bird) {
		
		if(bird.equals(getName())) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	/*
	 * public void show() {
	 * 
	 * Utilities list= new Utilities();
	 * 
	 * System.out.println(list.printListExtended(ArrayList<BirdDatabase>)); }
	 */


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLatinName() {
		return latinName;
	}


	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	
	public String toString() {
		
		return "Name: " + name + "\n" + "Latin Name: " + latinName + "\n";
	}
	
	

}
