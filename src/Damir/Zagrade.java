package Damir;
import java.util.Stack;

public class Zagrade {
	     
	public static void main(String[] args) {
	
		Stack<Character>  open = new Stack<Character>();
		Stack<Character>  closed = new Stack<Character>();
		String in = "( {[ ({ }) ] } )";				
		String input = in.replaceAll("\\s+","");
				
		int i;
		for( i=0; i<input.length(); i++){
			char s = input.charAt(i);
			if(s == '('  || s == '[' ||   s == '{' )
				open.push(s);					
		}		
		
		i = (i)/2;
		boolean is = true;
		
		for(int j=i; i<input.length(); j++){
				
			if(open.peek() == '(' && input.charAt(i) != ')'){
				is = false;
				break;
			}
				
			if(open.peek() == '[' && input.charAt(i) != ']'){
				is = false;
				break;
			}
				
			if(open.peek() == '{' && input.charAt(i) != '}'){
				is = false;
				break;
			}
			open.pop();
			i++;
				
		}
		
		if(is)
			System.out.println("PODUDARAJU SE");
		else
			System.out.println("NE PODUDARAJU SE");
			
	}		
}
