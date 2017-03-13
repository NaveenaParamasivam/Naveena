package Ex;

import java.util.Scanner;

public class Reverse_Without_Vowels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	StringBuffer sb=new StringBuffer(str);
	sb.reverse();
	System.out.println(sb);
	StringBuffer s=new StringBuffer(sb);
	char c[]={'a','e','i','o','u'};
	for(int i=0;i<str.length();i++)
	{
		for(int j=0;j<c.length;j++){
			if(s.charAt(i)==c[j])
			{
				s.deleteCharAt(i);
		        
			}
	}
}
	
}
}
