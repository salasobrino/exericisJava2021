package apartmentComparison;

public class ApartmentComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apartment studioManhattan = new Apartment(1, 16, 5500);
		
		Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
		
		Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
		
		System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );
		// false
		
		System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );
		// true
		
		System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn) ); 
		// 71600
		
		System.out.println(fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );
		
		System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );
		// false
		
		System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );
		// true

	}
		
	
	  public void larger(Apartment x, Apartment y) {
		 
	  x.larger(y);
		  
	  }
	  
	  public void priceDifference(Apartment x, Apartment y) {
		  
		  x.priceDifference(y);
	  }
	  
	  public void moreExpensiveThan(Apartment x, Apartment y) {
		  
		  x.moreExpensiveThan(y);
		  
	  }
	

}
