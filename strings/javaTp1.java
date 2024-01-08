package strings;
import java.util.*;
public class javaTp1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	char c[]=s1.toCharArray();
	int co=0;
	for(int i:c) {
		co++;
	}
	System.out.println(co);

}
}
