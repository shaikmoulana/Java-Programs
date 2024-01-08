import java.util.*;
public class Prog24
{
    int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            n=n*fact(n-1);
            return n;
        }
    }   
	public static void main(String[] args) {
	Prog24 o=new Prog24();
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println(o.fact(n));
	}
}

