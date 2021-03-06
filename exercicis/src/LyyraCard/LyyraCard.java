package LyyraCard;

public class LyyraCard {
	
	private double balance;
	//add class Person
	Person name;
	//add class MyDate
	MyDate date;
	
	public LyyraCard(double balance) {
	this.balance = balance;
	}
	public double balance() {
	return this.balance;
	}
	public void loadMoney(double amount) {
	this.balance += amount;
	}
	public boolean pay(double amount){
		
		/*  the method checks if the balance of the card is at least the amount given
		 * as parameter if not, the method returns false meaning that the card could not
		 * be used for the payment if the balance is enough, the given amount is taken
		 * from the balance and true is returned
		 */
				
		if(getBalance()>=amount) {
			
			setBalance(getBalance()-amount);
			
			return true;
		}
		
		return false;
	
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}


}
