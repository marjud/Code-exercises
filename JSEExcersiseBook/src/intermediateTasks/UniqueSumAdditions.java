package intermediateTasks;

import java.util.HashSet;

public class UniqueSumAdditions {
	
	public static HashSet<Integer> add(int a, int b, int c) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(a);
		hs.add(b);
		hs.add(c);
		
		Integer integerSum = hs.stream().mapToInt(Integer::intValue).sum();
        System.out.println("summation: " + integerSum);
	   
		return hs;
	}

}
