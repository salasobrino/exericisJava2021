package LyyraCard;

public class CashRegister {
	
	private double cashInRegister; // the amount of cash in the	register
	private int economicalSold; // the amount of economical lunches	sold
	private int gourmetSold; // the amount of gourmet lunches sold
	
	public CashRegister() {
		cashInRegister=1000.0;
	}
	
	/*
	 * public CashRegister(double cashInRegister, int economicalSold, int
	 * gourmetSold) { // at start the register has 1000 euros cashInRegister=1000.0;
	 * this.cashInRegister=cashInRegister; this.economicalSold=economicalSold;
	 * this.gourmetSold=gourmetSold; }
	 */
	
	public double getCashInRegister() {
		return cashInRegister;
	}

	public void setCashInRegister(double cashInRegister) {
		this.cashInRegister = cashInRegister;
	}

	public int getEconomicalSold() {
		return economicalSold;
	}

	public void setEconomicalSold(int economicalSold) {
		this.economicalSold = economicalSold;
	}

	public int getGourmetSold() {
		return gourmetSold;
	}

	public void setGourmetSold(int gourmetSold) {
		this.gourmetSold = gourmetSold;
	}

	public double payEconomical(double cashGiven) {
	
	// the price of the economical lunch is 2.50 euros
	double priceEconomicLunch=2.50;
		// if the given cash is at least the price of the lunch:
	if(cashGiven>=priceEconomicLunch){
		// the price of lunch is added to register	
		economicalSold=getEconomicalSold()+1;
		// the amount of the sold lunches is incremented by one
		cashInRegister=getCashInRegister()+2.5;
		
		double returnCash = cashGiven - priceEconomicLunch;
		// the method returns cashGiven - lunch price
		return returnCash;
	}
		
	// if not enough money is given, all is returned and nothingelse happens
	 double returnCash = cashGiven;
	
	 return returnCash;
	 
	}
	
	public double payGourmet(double cashGiven) {
	// the price of the gourmet lunch is 4.00 euros
	double priceGourmetLunch=4.0;
	// if the given cash is at least the price of the lunch:		
	if(cashGiven>=priceGourmetLunch){
	// the price of lunch is added to the register	
		gourmetSold=getGourmetSold()+1;
	// the amount of the sold lunches is incremented by one	
		cashInRegister=getCashInRegister()+4.0;
	// the method returns cashGiven - lunch price	
		double returnCash = cashGiven - priceGourmetLunch;
		
		return returnCash;
	}	
	// if not enough money is given, all is returned and nothing else happens
	double returnCash = cashGiven;
	
	 return returnCash;
		
	}
	
	//public boolean payEconomical(LyyraCard card) {
	// the price of the economical lunch is 2.50 euros
	// if the balance of the card is at least the price of the lunch:
	// the amount of sold lunches is incremented by one
	// the method returns true
	// if not, the method returns false
	//double priceEconomical = 2.50;	
	
	
		
	//}
	
	//public boolean payGourmet(LyyraCard card) {
	// the price of the gourmet lunch is 4.00 euros
	// if the balance of the card is at least the price of the lunch:
	// the amount of sold lunches is incremented by one
	// the method returns true
	// if not, the method returns false
	//}
	
	public void loadMoneyToCard(LyyraCard card, double sum) {
	// ...
	}
	
	public String toString() {
	return "money in register "+cashInRegister+ "\n"+
			"economical lunches sold: "+economicalSold+"\n"+ "gourmet lunches sold: "+gourmetSold;
	}

}
