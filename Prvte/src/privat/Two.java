package privat;

public class Two extends One{
	
	static One x = new One();
	
	public static void main(String[] args) {
		gop();
	}
	
	public static void gop() {
		System.out.println("b");
		System.out.println("a: " + a);
		x.message();
	}
}
