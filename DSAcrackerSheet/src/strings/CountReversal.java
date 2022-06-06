package strings;

import java.util.Stack;

public class CountReversal {

	public static void main(String[] args) {
		String S = "}}}}}}{}{}}}{{}}}}{}}{{{}{}{}{}}{{{{}}}{}}";
		System.out.println(countRev(S));
	}

	static int countRev(String s)
    {
		if(s.length()==0)
			return -1;
		
	Stack<Character> stack = new Stack<Character>();
	
	stack.push(s.charAt(0));
	
	for(int i=1;i<s.length();i++) {
		
		if(!stack.isEmpty() && s.charAt(i)=='}')
		if(stack.peek()=='{' )
			stack.pop();
		else {
			stack.push(s.charAt(i));
		}
		else
			stack.push(s.charAt(i));
			
	}

	StringBuilder sb = new StringBuilder();
	
	while(!stack.empty()) {
		sb.append(stack.peek());
		stack.pop();
	}
	
	String ss = sb.reverse().toString();
	System.out.println(ss);
	int count=0;
	
	if(sb.length()%2!=0)
		return -1;
	for(int i=1;i<ss.length();i++) {
		if(ss.charAt(i)!=ss.charAt(i-1)) {
			if(ss.charAt(i)=='{' && ss.charAt(i-1)=='}') {
				count=count +2;
				i++;
			}
		}else {
			count++;
			i++;
		}
		
		}
			
	
//	System.out.println(sb.reverse());
       return count;
    }	
}
