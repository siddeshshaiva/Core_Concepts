package Grooming;

public class ConvertCase {
	public static void main(String[] args) {		
		String input="HELLO WORLD!";
		String result=" ";
		boolean upper=true;
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isLetter(ch)) {
				if(upper) 
					result+=Character.toUpperCase(ch);				
				else 
					result+=Character.toLowerCase(ch);				
				upper=!upper;
			}
			else
				result+=ch;
		}
		System.out.println(result);	
	}
}
