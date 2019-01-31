
public class Main {
	
	
	
	public static void main(String[] args) {
		
		Calculate c = new Calculate();
		try {
			c.pack();
			c.setSize(400,400);
			c.setVisible(true);
		
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Please enter two numbers");
		}
		catch(NumberFormatException e) {
			System.out.println("Only numerical values accepted");
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		
		

		}
	}
}
