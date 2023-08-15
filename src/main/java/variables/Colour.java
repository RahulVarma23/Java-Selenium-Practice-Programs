package variables;

public enum Colour {
	
	GREEN("test1"),
	RED("test2"),
	YELLOW("test3"),
	BLUE("test4");
	
	private final String value;

	Colour(String str) {
		this.value=str;
	}
	
	public String getValue() {
		return value;
	}

}
