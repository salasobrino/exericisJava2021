package LyyraCard;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LyyraCard cardOfPekka = new LyyraCard(10);
		System.out.println("money on the card " + cardOfPekka.balance() );
		boolean succeeded = cardOfPekka.pay(8);
		System.out.println("money taken: " + succeeded );
		System.out.println("money on the card " + cardOfPekka.balance() );
		succeeded = cardOfPekka.pay(4);
		System.out.println("money taken: " + succeeded );
		System.out.println("money on the card " + cardOfPekka.balance() ); 
	System.out.println("----------------------------------------------------------------------------------------");	
		
		CashRegister unicafeExactum = new CashRegister();
		double theChange = unicafeExactum.payEconomical(10);
		System.out.println("the change was " + theChange );
		theChange = unicafeExactum.payEconomical(5);
		System.out.println("the change was " + theChange );
		theChange = unicafeExactum.payGourmet(4);
		System.out.println("the change was " + theChange );
		System.out.println( unicafeExactum );

	
	}
	
	
}
				
				

	

