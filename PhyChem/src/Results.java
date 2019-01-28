
public class Results {
	
	public void physics(int a) {
		if (a >= 0 && a <= 150){
			phys = a;
		}
		else {
			invalid();
		}
	}
	
	public void chem(int a) {
		if (a >= 0 && a <= 150){
			chem = a;
		}
		else {
			invalid();
		}
	}
	
	public void invalid() {
		System.out.println("Score not correct");
	}
	
	private int phys, chem;
	
	public void showResults() {
		int per;
		int total = phys + chem;
		per = total * 100/300;
		
		if ((chem > 150) || (phys > 150)){
			System.out.println("Error");

		}else {
			System.out.println("total marks" + total);
			System.out.println("Percent" + per);

		}
		
		//System.out.println("Total marks" + total());
		//System.out.println("Percent" + per);
			
		}
			
	
	
	
	
	
	

}
