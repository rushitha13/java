package Question1;

import java.util.ArrayList;
import java.io.*;
import java.util.*;


public class FindingAverage {

	public static void main(String[] args) 
	{
		Average  average = new Average();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		
		System.out.println("average of " + list + " is " + average.findAverage(list));

	}

}
