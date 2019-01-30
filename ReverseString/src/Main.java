
public class Main {

	public static void main(String[] args) {
		English e = new English();
		
		//e.rev("hello london");
		
		//e.findAndReplace("Hello", "Hi", "Hello, my name is Jeff");
		
		e.find("hello", "hello, my name is Jeff hello hello");
		
		e.findAndReplaceMe("Hi", "****", "Hi my name is Jeff hi jeff");
	}

}
