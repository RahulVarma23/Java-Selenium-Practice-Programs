package interview.problems;

public class OccurenceWithoutLoop {
	
	String str = "electrical";
	
	 void findCount() {		
		int count = str.length() - str.replace("e", "").length();		
		System.out.println(count);
	 }
	

	public static void main(String[] args) {
		OccurenceWithoutLoop t = new OccurenceWithoutLoop();
		t.findCount();
	}
}
