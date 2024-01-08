package Revision;
import java.util.*;
public class FactorialRecursion {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(fact(n));
}
static int fact(int a) {
	return a*fact(a-1);
}
}
