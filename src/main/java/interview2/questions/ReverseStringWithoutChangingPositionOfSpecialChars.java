package interview2.questions;

public class ReverseStringWithoutChangingPositionOfSpecialChars {

	public static void main(String[] args) {
		String str = "Rahul$Va@rma%";
		System.out.println(reverse(str));
	}

	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();

		char [] charArray = str.toCharArray();

		for(char ch : charArray) {
			if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
				sb.append(ch);
			}
		}
		sb.reverse();
		int alphaIndex=0;

		for(int i=0;i<charArray.length;i++) {
			if(Character.isAlphabetic(charArray[i]) || Character.isDigit(charArray[i]) ){
				charArray[i]=sb.charAt(alphaIndex++);
			}
		}

		return new String(charArray);
	}
	
	public static String reverseString(String str) {
		  char[] arr = str.toCharArray();
		  int i=0;
		  int j=str.length()-1;

		  while (i<j) {

		   if (alphaNumericCheck(arr[i]) && alphaNumericCheck(arr[j])) {
		    char tmp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = tmp;
		    i++;
		    j--;
		   } else if (!alphaNumericCheck(arr[i])) {
		    i++;
		   } else if (!alphaNumericCheck(arr[j])) {
		    j--;
		   }
		  }
		  return String.valueOf(arr);
	}

	public static boolean alphaNumericCheck(char ch) {
        // Alphabet a to z
        return (ch >= 48 && ch <= 57) // Numeric 0 to 9
                || (ch >= 65 && ch <= 90) // Alphabet A to Z (caps)
                || (ch >= 97 && ch <= 122);
	}
}
