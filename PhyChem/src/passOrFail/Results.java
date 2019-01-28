package passOrFail;

public class Results {
	
	private int math, chem, phys;
	
	public void maths (int a) {
		
	}
	
	public void chemistry(int a) {
		
	}
	
	public void physics(int a) {
		
	}
	
	public void showResults() {
		int total = math + chem + phys;
		int per = total / 450;
		
		System.out.println("total marks" + total);
		System.out.println("Percent" + per);
	}

}
