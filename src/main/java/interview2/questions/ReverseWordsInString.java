package interview2.questions;

public class ReverseWordsInString {
	
	  public static String reverseWords(String s) {        
	        String output = "";
	        if(s.isEmpty() || s==null) {
	        	return s;
	        }
	        String [] arr = s.split("\\s+");
	        for(int i=arr.length-1;i>=0;i--){
	            output +=arr[i]+" ";
	        }        
	        return output.trim();
	    }
	  
	  public static void main(String[] args) {
		System.out.println(reverseWords("my name"));
	  }
}
