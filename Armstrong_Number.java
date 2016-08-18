package Ex;

import java.util.Scanner;

public class Armstrong_Number
{
 public static void main(String[] args)
 {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int m=n;
	 int a=String.valueOf(n).length();
	 int d=0;
	 for(int i=0;i<a;i++)
	 {
		 int b=m%10;
		 m=m/10;
		 int c=(int) Math.pow(b, 3);
		  d=d+c;
	 }
	 if(n==d)
	 {
	 System.out.println("Armstrong number");
	 }
	 else
	 {
		 System.out.println("Not Armstrong number");
	 }
	    
 }
}
