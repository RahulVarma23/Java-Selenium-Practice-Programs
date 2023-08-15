package latest;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindMaxRepeatingCharacter {
	
	static char findMaxRepeating(String str){
		HashMap <Character,Integer> hm = new HashMap <Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		int max =0;		
		
		Set <Character> setOfKeys = hm.keySet();
		
		for(char c :setOfKeys ) {
			if(hm.get(c)>max) {		
				max=hm.get(c);
			}
		}
		System.out.println("max occurances:" + max);
		char maxCharacter = Character.MIN_VALUE;
		for(Entry<Character,Integer> entry : hm.entrySet()) {
			if(entry.getValue()==max) {
				maxCharacter=entry.getKey();
			}
		}    
		return maxCharacter;	
	}
	
	
	static char findMaxRepeating1(String str){
		char maxCharacter = Character.MIN_VALUE;
		
		int [] array = new int [26];

		for (int i=0;i<str.length();i++) {	
			int position = str.charAt(i)-'a';
			array[position]+=1;
		}
	
		int maxcount=0;
		for (int i=0;i<array.length;i++) {	
			if(maxcount<array[i]) {
				maxCharacter= (char) ((i) +'a');
				maxcount=Math.max(maxcount, array[i]);
			}
		}
		return maxCharacter;	
	}

	public static void main(String[] args) {
		System.out.println("max occuring character: "+ findMaxRepeating("technoeecreditstwert"));
		
		//System.out.println(findMaxRepeating1("technoeecreditstwert"));
		
		
	}

}
