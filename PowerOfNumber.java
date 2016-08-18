package Ex;

import java.util.Scanner;

public class PowerOfNumber 
{
  public static void main(String[] args)
  {
	  Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a=s.nextInt();
	    int b=(int) Math.pow(n, a);
	    System.out.println(b);
  }
}
