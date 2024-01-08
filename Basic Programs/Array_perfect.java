import java.util.*;

public class Array_perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int sum = 0;
			for (int j = 1; j < a[i]; j++) {
				if (a[i] % j == 0) {
					sum = sum + j;
				}
			}
			if (temp == sum) {
				System.out.println(temp + " perfect");
			}
			else {
				System.out.println(temp + " not perfect");
			}

		}
	}

}
