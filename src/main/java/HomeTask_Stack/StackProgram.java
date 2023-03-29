package HomeTask_Stack;

import java.util.Scanner;
import java.util.Stack;

public class StackProgram {
	public static boolean balanaced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c =='[' || c == '(' || c == '{') {
				stack.push(c);
			}else if(c == ']') {
				if(stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			}else if(c == ')') {
				if(stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}else if(c == '}') {
				if(stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(sc.hasNext()) {
		String input = sc.next();
		System.out.println(balanaced(input));
	}
	sc.close();
}
}
