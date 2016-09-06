import java.util.Scanner;

public class String_Reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuffer st = new StringBuffer(str);
		System.out.println(st.reverse());
	}
}
