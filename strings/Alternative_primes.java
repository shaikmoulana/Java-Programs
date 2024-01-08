package strings;
import java.util.*;
public class Alternative_primes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; count < 2 * n; i++) {
			int c = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					c++;
					}
			}
			if (c == 0) {
				count++;
				if (count % 2 == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
}