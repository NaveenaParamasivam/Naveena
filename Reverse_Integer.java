import java.util.Scanner;

public class Reverse_Integer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rev = s.nextInt();
		String a = String.valueOf(rev);
		StringBuffer str = new StringBuffer(a);
		System.out.println(str.reverse());
	}
}
