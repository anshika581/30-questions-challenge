import java.util.*;
import java.lang.*;
import java.io.*;
 
public class anuj581
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
 
        int count = 0;
        char last = s.charAt(0);
 
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == last) 
                count++;
            else last = s.charAt(i);
        }
 
        
        System.out.println(count);
    }   
}
