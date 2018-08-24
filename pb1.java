/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int n=s.nextInt();
		char[] a=s1.toCharArray();
		int l=s1.length();
		for(int i=l-n;i<l;i++)
		{
			System.out.print(a[i]);
		}
	}
}
