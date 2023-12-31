package stack;

import java.util.Stack;

public class ValidParantheses {
	
	public static boolean isValid(String s) {
		Stack <Character> stack = new Stack<Character> () ;
		for(char c : s.toCharArray()){
            if(c =='(' || c == '{' || c=='['){
                stack.push(c);
            }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();                
            }else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();                
            }else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }else {
            	return false;
            }
        }
		return stack.size()==0 ? true:false;	
	}
	
	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
	}
}
