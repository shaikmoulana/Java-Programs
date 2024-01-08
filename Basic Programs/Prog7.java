/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Prog7
{
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	
	if((x==0)&&(y==0)){
	    System.out.println("origin");
	}
	else if(x==0){
	    System.out.println("lies on x-axis");
	}
	else if(y==0){
	    System.out.println("lies on y-axis");
	}
	
	
	}
}

