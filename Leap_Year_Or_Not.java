package Logical;

import java.util.Scanner;

public class Leap_Year_Or_Not 
{
	public static void main(String[] args)
	{
      Scanner s=new Scanner(System.in);
      int year=s.nextInt();
      if(year%4==0)
      {
    	  System.out.println("Leap Year");
      }
      else
      {
    	  System.out.println("Not a Leap Year");
      }
	}

}
