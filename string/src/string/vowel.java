package string;

public class vowel 
{
	public static void main(String[] args) 
	{
		String s="how are45 sindhu67";
		System.out.println("print vowels: ");
		printVowels(s);
		System.out.println("print consonants: ");
		printConsonants(s);
		System.out.println("print digits: ");
		printDigits(s);
	}

	static void printVowels(String s) 
	{
String vowels="aeiouAEIOU";
		for (int i = 0; i < s.length(); i++)
		{

			if(vowels.indexOf(s.charAt(i))!=-1)
			{
				System.out.println(s.charAt(i));
		}
	}
	}
	static void printConsonants(String s) 
	{
String consonants="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
		for (int i = 0; i < s.length(); i++)
		{

			if(consonants.indexOf(s.charAt(i))!=-1)
			{
				System.out.println(s.charAt(i));
		}
	}
	}
	static void printDigits(String s) 
	{
String digits="0123456789";
		for (int i = 0; i < s.length(); i++)
		{

			if(digits.indexOf(s.charAt(i))!=-1)
			{
				System.out.println(s.charAt(i));
		}
	}
	}
}