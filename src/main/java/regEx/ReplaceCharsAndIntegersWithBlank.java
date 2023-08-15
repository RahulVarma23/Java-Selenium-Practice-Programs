package regEx;

class ReplaceCharsAndIntegersWithBlank { 
	
	public static void main(String[] args) {

		String str = "a3_n}).<]d$k7?*k@";
		
		String str1 = str.replaceAll("[\\W_]", "");
		
		System.out.println(str1);
		
	}
}
