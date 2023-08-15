package string.problems;
import java.util.HashMap;
import java.util.Set;

public class FindRepeatativeChars {

	public static void main(String[] args) {
		findRepeatativeCharacters("occassional");
	}

	private static void findRepeatativeCharacters(String str) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer> ();	
		char ch [] = str.toCharArray();	
		for(char c : ch) {
				hm.put(c, hm.getOrDefault(c, 0)+1);
		}	
		Set<Character>set =hm.keySet();	
		for(char key :set) {
			if(hm.get(key)>1) {
				System.out.println(key + " : " +hm.get(key));
			}
		}
	}
}
