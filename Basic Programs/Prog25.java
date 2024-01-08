import java.util.*;
public class Prog25
{
    
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int c=0;
    while(n>0){
        int r=n%10;
        c=c+1;
        n=n/10;
    }
    System.out.println(c);
	}
}

