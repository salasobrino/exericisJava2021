package Birding;

import java.util.Objects;

public class Bird {

	private String name;

	private String latinName;

	public Bird() {
		super();
	}
	
	public Bird(String name) {
		this.name=name;
	}

	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatinName() {
		return this.latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}

	public void addBird(String name, String latinName) {
		setName(name);
		setLatinName(latinName);

	}

	public String toString() {
		return "Name: " + name + ", " + "Latin Name: " + latinName + "\n";
	}
	
	public boolean observation(String name) {
		Bird birdName = new Bird(name);
		
		if(this.name==birdName.getName()) {
			
			return true;		
			
		}
		
		return false;
		
	}
	
	public int numObserv(String name) {
		Bird birdName = new Bird(name);
		
		int i=0;
		if(this.name==birdName.getName()) {
			
			i = i + 1;
			return i;
		}
		
		return 0;
	}
	
	public String toStatistics() {
		
				
			return  "Name: " + name + ", " + "Latin Name: " + latinName + " --> " + "Number Observations" + numObserv(name) +"\n";
		
				
	}

	
	  @Override public boolean equals(Object o) {
	  
			/*
			 * if(this==o) return true; if(o==null || getClass() !=o.getClass()) return
			 * false; Bird bird = (Bird) o; return Objects.equals(name,
			 * bird.name)&&Objects.equals(latinName, bird.latinName);
			 */
	  
	  //name.equals(bird.name) && latinName.equals(bird.latinName);
	  
	  Bird a = (Bird) o;
	  
	  return this.name.equals(a.name)||this.latinName.equals(a.latinName);
	  
	  
	  }
	  
	  @Override public int hashCode() { return Objects.hash(name, latinName); }
	 
}
