package exept;

public class Main {

	public static void main(String s[]) {
		int a ,b, c;
		a = b = c = 0;
		try {
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			
			c = a / b;
			System.out.println("Result: " + c);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Please enter two numbers");
		}
		catch(NumberFormatException e) {
			System.out.println("Only numerical values accepted");
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		finally {
			System.out.println("Finally Block Always Executed");
		}
	}

}
