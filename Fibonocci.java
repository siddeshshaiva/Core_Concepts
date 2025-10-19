package Grooming;

import java.util.ArrayList;

public class Fibonocci {
	public static void main(String[] args) {
		int [] input= {10,20,30,40,50,60,70,80};
		ArrayList<Integer> output=new ArrayList<>();
		int a=0,b=1;
		while(a<input.length) {
			output.add(input[a]);
			int next=a+b;
			a=b;
			b=next;			
		}
		System.out.println("output: "+output);
}
}
