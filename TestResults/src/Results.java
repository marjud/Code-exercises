
public class Results {
	
private int math, chem, phys;
	
	public void maths (int a) {
		if(a >=0 && a <=150) {
			math = a;
		}else {
			System.out.println("Wrong input for math");
		}
	}
	
	public void chemistry(int a) {
		if(a >=0 && a <=150) {
			chem = a;
		}else {
			System.out.println("Wrong input for chem");
		}
		
	}
	
	public void physics(int a) {
		if(a >=0 && a <=150) {
			phys = a;
		}else {
			System.out.println("Wrong input for phys");
		}
		
	}
	
	public void showResults() {
		int total = math + chem + phys;
		int per = total *100/ 450;
		if(total >= 0) {
			retakeExam();
			
		}else {
			System.out.println("invalid input");
		}
		
		System.out.println("Total marks: " + total);
		System.out.println("Percent: " + per);
	}
	
	public void goHome() {
		int pass = 60;
		if(math < pass && chem < pass && phys < pass) {
			System.out.println("Go Home!");
			printResults();
		}else {
			repeatCourse();
		}
		
	}
	
	public void repeatCourse() {
		int pass = 60;
		if(math < pass && chem < pass) {
			System.out.println("Failed 2 subjects, please repeat");
			printResults();
			
		}else if(math < pass && phys < pass) {
			System.out.println("Failed 2 subjects, please repeat");
			printResults();
		}else if(chem < pass && phys < pass) {
			System.out.println("Failed 2 subjects, please repeat");
			printResults();
		}
	}
	
	public void retakeExam() {
		int pass = 60;
		if(math < pass && chem > pass && phys > pass) {
			System.out.println("Failed 1 subject, please repeat exam");
			printResults();
			
		}else if(chem < pass && phys > pass && math > pass) {
			System.out.println("Failed 1 subject, please repeat exam");
			printResults();
		}else if(phys < pass && math > pass && chem > pass) {
			System.out.println("Failed 2 subjects, please repeat");
			printResults();
	}else {
		goHome();
	}
	
}
	
	public void printResults() {
		System.out.println("Maths: " + math);
		System.out.println("Chemistry: " + chem);
		System.out.println("Physics: " + phys);
	}

}
