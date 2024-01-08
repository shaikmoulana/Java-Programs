import java.util.*;
public class Prog1234
{
    void posneg(int n){
        if(n>0){System.out.println("positive");}
        else{System.out.println("negative");}
    }
    
    void even(int n){
        if(n%2==0){System.out.println("even");}
        else{System.out.println("odd");}
    }
    
    void leap(int n){
        if((n%400==0) || (n%4==0)&&(n%100!=0))
        {
            System.out.println("leap year");
        }
        else{System.out.println("not leap year");}
    }
    
    void div35(int n){
        if((n%3==0)&&(n%5==0)){
            System.out.println("divisible by 3 & 5");
        }
        else{System.out.println("divisible not by 3 & 5");}
    }
    
	public static void main(String[] args) {
    Prog1234 o=new Prog1234();
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    o.posneg(n);
    o.even(n);
    o.leap(n);
    o.div35(n);
	}
}

