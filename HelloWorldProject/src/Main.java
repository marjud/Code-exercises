import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner inputFirstNum = new Scanner(System.in);  
	    System.out.println("Enter the fisrt number: ");
	    
	    Scanner inputsecondNum = new Scanner(System.in);  
	    System.out.print("Enter the second number: ");
	
	
	
    	int firstNumber = inputFirstNum.nextInt();  
    	int secondNumber = inputFirstNum.nextInt(); 
    	Calculator calc = new Calculator();
	    
		int total = Calculator.add(firstNumber, secondNumber);
		String outputMsg = "The sumation of " + firstNumber + " and " + secondNumber + " is " + total;
		System.out.println(outputMsg);
		
		
		total = calc.subtract(firstNumber, secondNumber);
		outputMsg = "The subraction of " + firstNumber + " and " + secondNumber + " is " + total;
		System.out.println(outputMsg);
		
		total = calc.multiply(firstNumber, secondNumber);
		outputMsg = "The multiplication of " + firstNumber + " and " +secondNumber + " is " + total;
		System.out.println(outputMsg);
		
		total = calc.divide(firstNumber, secondNumber);
		outputMsg = "The division of " + firstNumber + " and " + secondNumber + " is " + total;
		System.out.println(outputMsg);
		
		total = calc.mod(firstNumber, secondNumber);
		outputMsg = "The modulous of " + firstNumber + " and " + secondNumber + " is " + total;
		System.out.println(outputMsg);
		
		if (total > 500) {
			System.out.print("The total is greater than 500");
			}
		}
}
	
