package stat;

public class ABC {
	int x;
	
	public static void hello() {
		System.out.println("Hello world");
	}
	
	
	//cannot call x because this method is static
	public static void go() {
		x++;
		System.out.println(x);
	}

}
