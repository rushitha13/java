package Question2;

import java.io.*;
import java.util.*;

public class ListOfThree {

	public static void main(String[] args) 
	{
		StartsWithA_HasThreeCharacters object = new StartsWithA_HasThreeCharacters();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		
		System.out.println("Strings starting with \"a\" and has 3 characters are ");
		List<String> result = object.returnExpected(list);
		for(String s : result)
		{
			System.out.println(s);
		}

	}

}
