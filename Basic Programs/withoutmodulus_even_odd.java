import java.util.*;
public class withoutmodulus_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=n-(n/2)*2;
		if(r==0){
		    System.out.println("even");
		}
		else{
		    System.out.println("odd");
		}
	}

}
