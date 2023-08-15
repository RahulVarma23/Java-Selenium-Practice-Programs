package variables;

public class Test {

	public static void main(String[] args) {
		for(Colour c : Colour.values()) {
			System.out.println(c);
		}	
		System.out.println("Index of Green: "+Colour.valueOf("RED").ordinal());	
		System.out.println(Colour.YELLOW.getValue());
	}
}
