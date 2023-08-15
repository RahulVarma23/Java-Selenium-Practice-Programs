package string.problems;

public class ReverseVowels {
	
	public static String reverseVowels(String s) {
        char arr [] = s.toCharArray();
        int left =0;
        int right=s.length()-1;        
        while(left<right){
            
           if(isVowel(arr[left]) && isVowel(arr[right])) {
               swap(arr,left,right);
               left++;
               right--;
           }      
            if(!isVowel(arr[left])){
                left++;
            }
            if(!isVowel(arr[right])){
                right--;
            }                     
        }
        return new String (arr);  
    }
    
    private static void swap(char [] arr ,int i ,int j){
        char temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    
    private static boolean isVowel(char letter){
        char ch = Character.toLowerCase(letter);
        return ch=='a' || ch == 'e' || ch =='i' || ch =='o' || ch=='u';
    }

	public static void main(String[] args) {
		System.out.println(reverseVowels("hello"));
	}

}
