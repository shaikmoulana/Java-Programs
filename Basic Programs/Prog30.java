import java.util.*;
public class Prog30
{
    
	public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int temp=n;
    int p=0;
    while(n>0){
        int r=n%10;
        p=p*10+r;
        n=n/10;
        }
    if(p==temp){
        System.out.println("palindrome");    
    }
    else{
        System.out.println("Not palindrome");
    }

	}	
}

