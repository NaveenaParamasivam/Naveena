package Ex;

import java.util.Scanner;

public class Even_Numbers
{
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a=s.nextInt();
	    for(int i=n+1;i<a;i++)
	    {
	    	if(i%2==0)
	    	{
	    	  System.out.println(i);
	    	}
	    }
}
}
