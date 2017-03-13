package Ex;

import java.util.Scanner;

public class Holiday_Or_Not {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String st=sc.next();
	String str[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	String stri="Sunday";
	for(int i=0;i<str.length;i++)
	{
		if(st.equalsIgnoreCase(str[i]))
		{
			if(st.equalsIgnoreCase(stri)){
			System.out.println("False");
			}
			else{
				System.out.println("True");
			}
		}
	}
}
}
