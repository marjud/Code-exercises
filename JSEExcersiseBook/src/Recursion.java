
public class Recursion {

	public static void main(String[] args) {
		int firstNumber = 343;
		int secondNumber = 100;
		boolean notBig = true;
		int target = 800;
		
		int total = add(firstNumber, secondNumber);
		String outputMsg = "The sumation of " + firstNumber + " and " + secondNumber + " is " + total;
		System.out.println(outputMsg);
		while (total < target) {
			System.out.println("number is less than " + target+ " the program will iterate till " + target + " is achieved. " + total);
			total++;
			if (total >= target) {
				notBig = false;
			}
			System.out.println("Target reached: " + total);
		}  
		for (int i = total; i >target; i--) {
			if (i == 5)
				break;
			if(i == 10)
				continue;
			System.out.println(i);
		}
	}
	
	public static int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public int subtract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
		
	}
	
	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
		
	}
	public int divide(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
		
	}
	public int mod(int firstNumber, int secondNumber) {
		return firstNumber % secondNumber;
	}		
		
}



