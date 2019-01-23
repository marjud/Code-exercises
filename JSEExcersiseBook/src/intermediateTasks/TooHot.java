package intermediateTasks;

public class TooHot {

	public static void main(String[] args) {
		int tempurature = 91;
		boolean isSummer;
		
		if (tempurature >= 60 && tempurature <=90) {
			isSummer = false;
			System.out.print("It's not summer");
			}
		else if(tempurature >= 90 && tempurature <=100) {
			isSummer = true;
			System.out.print("It's summer");
		}
		
	}

}
