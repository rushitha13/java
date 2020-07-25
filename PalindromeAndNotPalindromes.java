package Question3;
import java.io.*;
import java.util.*;

public class PalindromeAndNotPalindromes {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n = sc.nextInt();
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		
		Palindromes p = (ArrayList<String> lists)-> 
		{
			ArrayList<String> result = new ArrayList<String>();
			for(String s:lists)
			{
				String temp1 = s;
				StringBuilder sb = new StringBuilder(s);
				String temp2 = sb.reverse().toString();
				if(temp1.equals(temp2))
				{
					result.add(temp1);
				}
			}
			return result;
		};
		
		System.out.println("Palindromes are " + p.returnPalindromes(list));
		
	}

}
