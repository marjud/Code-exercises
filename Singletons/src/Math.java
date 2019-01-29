
public class Math {
	
	static Math x;
	
	private Math() {
		System.out.println("I am the constructor, I am always executed");
		
	}
	
	public static Math createObject() {
		if(x == null) {
			x = new Math();  
			System.out.println("object created");
		}
		else {
			System.out.println("object not created");
		}
		return x;
	}	
	public static Math sameObject() {
		if(x == null) {
			x = new Math();
			System.out.println("object created method 2");
		}
		else {
			System.out.println("object not created");
		}
		return x;
	}
		
}		
