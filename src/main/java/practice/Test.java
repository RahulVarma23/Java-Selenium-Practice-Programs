package practice;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		String jewels = "Af";
		String stones = "AaaaddfFf";
		int count = 0;

		List<Character> list = new ArrayList<>();

		for(char ch : jewels.toCharArray()) {
			list.add(ch);
		}

		for(char c: stones.toCharArray()) {

			if(list.contains(c)){
				count++;
			}
		}
		System.out.println(count);
	}
}
