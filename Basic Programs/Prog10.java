import java.util.*;
public class Prog10
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	int z=s.nextInt();
    int n=x>y?x:y;
    int m=z>n?z:n;
	System.out.println(m);
	
	
	}
}

