package Ex;

import java.util.Scanner;

public class PrimeNumber_Two_Intervals 
{
  public static void main(String[] args)
  {
	  Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int m=s.nextInt();
	    int k;
	    for(int i=n+1;i<m;i++)  {
	             k=0;
	             for(int j=2;j<i;j++)
	             {
	                      if(i%j==0)
	                      k++;
	             }
	             if(k==0)
	             System.out.println(i);
	    }
  }
}
