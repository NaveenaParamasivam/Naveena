package Ex;

import java.util.Scanner;

public class Palindrome_Or_Not{
  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  String str=s.next();
	  String st="";
	  for(int i=str.length()-1;i>=0;i--){
		  char c=str.charAt(i);
		  st=st+c;
	  }
	  if(str.equalsIgnoreCase(st)){
		  System.out.println("palin");
	  }
	  else{
		  System.out.println("not palin");
	  }
  }
}
