package arrays;

public class Arrays {

	public static void main(String[] args) {
		int firstNumber = 43;
		int secondNumber = 0;
		int [] collection = {1,2,3,4,5,6,7,8,9,10};
		int [] needsPopulating = new int [30];
		
		/**int result = Calc.add(firstNumber, secondNumber, false);
		System.out.print(result);
		**/
		
		Calc calc = new Calc();
		
		firstNumber = collection[2];
		secondNumber = collection[4];
		int result = calc.subtract(firstNumber, secondNumber);
		for (int i = 0; i < 10; i++) {
		System.out.println(result);
		}
		
		for (int i: collection) {
			System.out.println("Number :" + i);
		}
		
		for(int i = 1; i < needsPopulating.length; i++) {
			needsPopulating[i] = i + 1; 
			System.out.println(i);
		}
		
		for(int item: needsPopulating) {
			item = item *10;
			System.out.println(item);
		}
	}
}
