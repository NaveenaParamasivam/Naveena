package Logical;

import java.util.Scanner;

public class Reverse_Number {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	String str=""+a;
	StringBuffer sb=new StringBuffer(str);
	sb.reverse();
}
}
