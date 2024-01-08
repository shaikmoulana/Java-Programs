
import java.util.*;
public class Prog23
{
    // void factorial(){
    //     if(n==0){
    //         return 1;
    //     }
    //     else{
    //         return(n * factorial(n-1)); 
    //     }
    // }
    
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double n=s.nextDouble();
	double x=s.nextDouble();
	double fact=1;
	double sum=1;
	for(double i=1;i<=n;i++){
	    fact*=i;
	    sum+=(Math.pow(x,i)/fact);
	}
	System.out.println(sum);
	
	}
}

