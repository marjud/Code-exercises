import java.util.Arrays;

public class English {
	
	public void reverse(String msg) {
		
		String reverse = "";
		String[]m = msg.split("\\s");
		
		for (int i = m.length - 1; i >=0; i--) {
			reverse += (m[i] + " ");
		}
		
		System.out.println(reverse);
	}
	
	public void rev(String msg) {
	
		for(String word: msg.split(" ")) {
			System.out.println(word);
		}
	}
	
	public void find(String what, String msg) {
		String keyword = what;
		int count = 0;
		
		boolean found = Arrays.asList(what.split(" ")).contains(keyword);
		if (found) {
			System.out.println("Keyword found: " + keyword);
			for(int i = count; i < keyword.length(); i++) {
				count++;
			}
			//count = count + 1;
			System.out.println(count);
		}else {
			System.out.println("keyword not found");
		}
	}
	
	public void findAndReplace(String find, String replace, String msg) {
			
		System.out.println(msg.replace(find, replace));
	}
	
	public void findAndReplaceMe(String find, String replace, String msg) {
		String[]m = msg.split(" ");
		
		for(int i = 0; i < m.length; i ++) {
			if(m[i].equalsIgnoreCase(find)) { 
				m[i] = replace;
			}
		}
		System.out.println(Arrays.toString(m));
	}
	
}
