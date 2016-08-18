package Ex;

import java.util.Scanner;

public class OddNumbers
{
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a=s.nextInt();
	    int count=0;
	    for(int i=n+1;i<a;i++)
	    {
	    	if(i%2!=0)
	    	{
	    	  count++;
	    	}
	    }
	    System.out.println(count);
}
}
