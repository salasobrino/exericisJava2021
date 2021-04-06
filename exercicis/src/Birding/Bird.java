package Birding;

import java.util.Objects;

public class Bird {
	
	private String name;
	
	private String latinName;
	
	public Bird() {
		
	}
	
	public Bird(String name, String latinName){
		this.name=name;
		this.latinName=latinName;
	}

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
	
	
@Override
public boolean equals(Object o) {
	if(this==o) return true;
	if(o==null || getClass() !=o.getClass()) return false;
	Bird bird = (Bird) o;
	return name.equals(bird.name) && latinName.equals(bird.latinName);
}

@Override
public int hashCode() {
	return Objects.hash(name, latinName);
}

}
