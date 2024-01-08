/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Prog45
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
// 	int b=s.nextInt();
	int count=0;
	for(int i=2;count<=n;i++){
	int c=0;    
	for(int j=2;j<i;j++){
	    if(i%j==0){
	        c++;
	    }
	}
	
	if(c==0){
	    System.out.print(" "+i);
	    count++;
	}
	
	}
	}
	
}
