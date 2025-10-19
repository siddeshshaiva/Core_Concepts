package Grooming;

public class UniqueChar {
	public static void main(String[] args) {
		String input="abca";
		int count=0;
		for(int i=0;i<=input.length()-3;i++) {
			char a=input.charAt(i);
			char b=input.charAt(i+1);
			char c=input.charAt(i+2);
			if(a!=b &&b!=c && a!=c) {
				count++;
				
			}
		}
		System.out.println("unique Triplets: "+count);
	}
	

}
