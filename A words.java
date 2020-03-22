//https://codeforces.com/problemset/problem/59/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class anuj581
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.next();

		int count1=0;
		int count2=0;

		for(int i=0;i<s.length();i++){
			if(Character.isLowerCase(s.charAt(i)))
					count1++;
			if(Character.isUpperCase(s.charAt(i)))
					count2++;
		}
			if(count1>=count2)
			System.out.print(s.toLowerCase());
		
			if(count1<count2)
			System.out.print(s.toUpperCase());
	}
}		
	
