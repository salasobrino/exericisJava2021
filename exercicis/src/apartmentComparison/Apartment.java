package apartmentComparison;

public class Apartment {
private int rooms;
private int squareMeters;
private int pricePerSquareMeter;

public Apartment (int rooms, int squareMeters, int pricePerSquareMeter){
	
	this.rooms = rooms;
	this.squareMeters = squareMeters;
	this.pricePerSquareMeter = pricePerSquareMeter;
	
	}

public boolean larger (Apartment otherApartment) {
	  	  
	  if(this.squareMeters>otherApartment.squareMeters) {

	  return true;
	  
	  }
	  
	  return false; 
}

public int priceDifference(Apartment otherApartment) {
		
	int i = this.squareMeters*this.pricePerSquareMeter;
	int ii = otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
	
	return Math.abs(ii-i);
		
}

public boolean moreExpensiveThan(Apartment otherApartment) {
	
	int i = this.squareMeters*this.pricePerSquareMeter;
	int ii = otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
	
	if(i>ii) {
		
		return true;
	}
	
	return false;
	
}

//do all getters and setters with Eclipse's Source.

public int getRooms() {
	return rooms;
}

public void setRooms(int rooms) {
	this.rooms = rooms;
}

public int getSquareMeters() {
	return squareMeters;
}

public void setSquareMeters(int squareMeters) {
	this.squareMeters = squareMeters;
}

public int getPricePerSquareMeter() {
	return pricePerSquareMeter;
}

public void setPricePerSquareMeter(int pricePerSquareMeter) {
	this.pricePerSquareMeter = pricePerSquareMeter;
}



}