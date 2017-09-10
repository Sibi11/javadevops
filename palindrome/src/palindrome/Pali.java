package palindrome;

import java.util.Scanner;

public class Pali {
	public static void main(String[] args)
	{
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse="+rev);
		if(rev.equals(str))
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("Not palindrome");
		
		}
	}

}
