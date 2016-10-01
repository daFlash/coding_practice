package legacy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	
	private static boolean isValid(String s) {
		Map hashmap = new HashMap<Character, Character> ();
		hashmap.put('(', ')');
		hashmap.put('[', ']');
		hashmap.put('{', '}');
		
		Stack<Character> stack = new Stack<Character> ();
		
		for (Character curr: s.toCharArray()) {
			if (hashmap.keySet().contains(curr)) {
				stack.push(curr);
			} else if (!stack.empty() && hashmap.get(stack.peek()) == curr) {
				stack.pop();
			} else
				return false;
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		Scanner sysinput = new Scanner(System.in);
		System.out.println("Enter String that consists of ( ) [ ] { }");
		String input = sysinput.nextLine();
		System.out.println("Validity of Parenthesis = "+ isValid(input));
	}

}
