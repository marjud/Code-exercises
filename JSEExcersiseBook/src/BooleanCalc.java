
public class BooleanCalc {

	public static void main(String[] args) {
		System.out.print(add(59, 88, true));
		

	}
	
	public static int add(int firstNumber, int secondNumber, boolean large) {
		int total = firstNumber + secondNumber;
		if (total > 1000 && large) {
			System.out.println("Answer is greater than 1000");
		}
		else if (total< 1000 && large) {
			System.out.println("Answer is less than 1000");
		}
		return total;
	}
	
	public int subtract(int firstNumber, int secondNumber, boolean large) {
		return firstNumber - secondNumber;
		
	}
	
	public int multiply(int firstNumber, int secondNumber, boolean large) {
		return firstNumber * secondNumber;
		
	}
	public int divide(int firstNumber, int secondNumber, boolean large) {
		return firstNumber / secondNumber;
		
	}
	public int mod(int firstNumber, int secondNumber, boolean large) {
		return firstNumber % secondNumber;
	}		
		
}


