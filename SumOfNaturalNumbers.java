package Logical;

import java.util.Scanner;

public class SumOfNaturalNumbers
{
  public static void main(String[] args) 
    {
     int a=1;
     int sum=0;
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     while(n>=a)
     {
    	 sum+=a;
    	 a++;
     }
     System.out.println(sum);
	}

}
