package interview2.questions;

public class ReverseEachWordInString {
	public static String reverseWords(String s) {        
        String output = "";      
        String [] arr = s.split("\\s+");
     
        for(int i=0;i<arr.length;i++) {
        	String reverse="";
        	char [] charArray = arr[i].toCharArray();
        	for(int j=charArray.length-1;j>=0;j--) {
        		reverse+=charArray[j];
        	}        	
        	output +=reverse+" ";
        }
              
        return output.trim();
    }
  
   public static void main(String[] args) {
	 System.out.println(reverseWords("I love my India"));
   }
}
