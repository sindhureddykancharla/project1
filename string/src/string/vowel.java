package string;

public class vowel 
{
	public static void main(String[] args) 
	{
		String s="is7";
		System.out.println("print vowels: ");
		printVowels(s);
		System.out.println("print consonants: ");
		printConsonants(s);
		System.out.println("print digits: ");
		printDigits(s);
		System.out.println("print expressions: ");
		processExpression(s);
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
	static void processExpression(String s)
	{
	String answer="1";
	String num1="12";
	String num2="33";
	 answer=num1+num2;
	 System.out.println(answer);
	}
}