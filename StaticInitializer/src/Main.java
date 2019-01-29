
public class Main {

	public static void main(String[] args) {
		Bank lloyds = new Bank();
		Bank hsbc = new Bank();
		Bank santan = new Bank();
		What ref = new What();
		
		lloyds.amount(100);
		lloyds.setDollar(50);
		lloyds.amount(110);
		
		hsbc.amount(110);
		hsbc.setDollar(70);
		hsbc.amount(110);
		
		lloyds.amount(110);
		santan.amount(110);
		
		ref.One();
		ref.show();
		
	}

}
