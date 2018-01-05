package com.htc.mt.main;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExtractDemo {
	public static void main(String[] args) {
		/*String input = "I have a cat, but I like my dog better.";

		Pattern p = Pattern.compile("(mouse|cat|dog|wolf|bear|human)");
		Matcher m = p.matcher(input);

		List<String> animals = new ArrayList<String>();
		while (m.find()) {
			System.out.println("Found a " + m.group() + ".");
			animals.add(m.group());
		
		}*/
		
		/*Pattern p = Pattern.compile("a+b");
		 Matcher m = p.matcher("b");
		 boolean b = m.matches();
		 System.out.println(b);
		*/
		
		String email="bhavani@gmail.com";
		Pattern pattern=Pattern.compile("^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$");
		Matcher m=pattern.matcher(email);
		if(m.matches())
		{
			System.out.println("valid email");
		}
		else
		{
			System.out.println("Invalid email");
		}
		
		
	}
}