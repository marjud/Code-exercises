
public class Bank {
	
	static int dollar;
	static {
		dollar = 95;
	}
	
	public void setDollar(int a) {
		dollar = a;
	}
	
	public void amount(int x) {
		System.out.println(x * dollar);
	}

}
