package interview.problems;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void findUniqueCharacters(String str) {
		HashSet <Character>hs= new HashSet <Character>();
		for (Character ch : str.toCharArray()) {
			if(hs.add(ch)==true) {
				System.out.print(ch);
			}
		}
	}
	
	public static void findUniqueCharacters1(String str) {
		HashMap <Character,Integer>hm= new HashMap <Character,Integer>();
		for (Character ch : str.toCharArray()) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		
		System.out.println(hm.keySet());
		Set<Character>hs = hm.keySet();
		for (char key: hs) {
			if(hm.get(key)==1) {
				System.out.println("Unique key: "+key);
			}
		}
	}

	public static void main(String[] args) {
		findUniqueCharacters("occassional");
	}
}
