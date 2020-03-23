import java.util.*;
import java.lang.*;
import java.io.*;
 
public class anuj581
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String s= sc.next();
        String temp = "";
        if(n%2==1){
            temp = s.substring(0,3);
            s = s.substring(3,s.length());
        } else{
            temp = s.substring(0,2);
            s = s.substring(2,s.length());
        }
        System.out.print(temp);
        for (int i =2; i <= s.length(); i+=2) {
            String t = s.substring(i-2,i);
            System.out.print("-"+t);
        }
		
	}	
}
