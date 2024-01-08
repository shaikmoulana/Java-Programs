import java.util.*;
public class Prog21
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	float sum=0;
	for(float i=1;i<=n;i++){
	    sum=sum+(1/i);
	}
	System.out.println(sum);
	
	}
}

