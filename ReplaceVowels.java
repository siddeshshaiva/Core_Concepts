package Grooming;

import java.util.Scanner;

public class ReplaceVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String: ");
		String str = sc.next();
		String vowels = "aeiouAEIOU";
		String result = "";
		int count = 1;

		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (vowels.indexOf(ch) != -1)
			{
				result += count;
				count++;
			} else {
				result += ch;
			}
		}

		System.out.println(result);
	}
}
