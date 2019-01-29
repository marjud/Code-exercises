public class Xyz {
	
	public String digitsToWords(int number) {
		String input = "";
		String units[] = {"zero", "one", "two", "three", "four", "five", "six", "seven",
				"eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen",
				"seventeen", "eighteen", "nineteen"};
		
		String tens[] = {"ten", "twenty", "thirty", "fourty", "fifty", "seventy", "eighty", "ninety"};
		
			
		
		if (number == 0) {
			return "zero";
		}
		if(number < 0) {
			String numberString = "" + number;
			numberString = numberString.substring(1);
			return "negative" + digitsToWords(Integer.parseInt(numberString));
		}
		if((number / 1000000) > 0) {
			input += digitsToWords(number / 1000000) + "Milli";
			number %= 1000000;
		}
		if((number / 1000) > 0) {
			input += digitsToWords(number / 1000) + "thousand";
			number %= 1000;
		}
		if((number / 100)> 0) {
			input +=digitsToWords(number/ 100) + "hunnit";
			number %= 100;
		}
		
		if (number > 0 ) {
			if (number < 20) {
				input += units[number];
			}
						
			else {
				input += tens[number /10];
				if((number % 10 ) > 0) {
					input += "-" + units[number % 10];
				}
			}
		}
		
		
		return input;
	}

}
