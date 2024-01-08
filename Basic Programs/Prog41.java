import java.util.*;
public class Prog41
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int check=s.nextInt();
	int c=0;
	while(n>0){
	    int r=n%10;
	    n=n/10;
	    if(check==r){
	        c++;
	    }
	}
	System.out.println(check +" is occurred "+c+" times");
	}
}

