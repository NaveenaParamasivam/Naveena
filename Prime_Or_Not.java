package Ex;

import java.util.Scanner;

public class Prime_Or_Not 
{
  public static void main(String[] args)
  {
	  Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a=n/2;
	    int flag=0;
	    for(int i=2;i<n;i++)
	    {
	    if(a%i==0)
	    {
	    	System.out.println("Not Prime");
	    	flag++;
	    	break;
	    }
	    }
	    if(flag==0)
	    {
	    	System.out.println("Prime");
	    }
  }
}
