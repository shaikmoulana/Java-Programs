import java.util.*;
public class Prog22
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	float n=s.nextFloat();
	float sum=0;
	for(float i=0;i<=n;i++){
	    sum+=(1/(Math.pow(2,i)));
	}
	System.out.println(sum);
	
	}
}

