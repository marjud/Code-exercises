
public class Rando  {
	
	ClassOne one = new ClassOne();
	
	public void Rando() {
		System.out.println("what can this access?");
		one.msg();
		one.inheritThis();
	}

}
