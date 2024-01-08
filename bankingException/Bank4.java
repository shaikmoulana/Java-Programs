package bankingException;
import java.util.*;

class custom extends Exception{
	custom(String str){
		super(str);
	}
}

class mbank{
	double a=0;
	void depo(double d) {
		a=a+d;
		System.out.println(a);
	}
	void with(double w) {
		if(a>w) {
			a=a-w;
			System.out.println(a);
		}
		else {
			System.out.println("insufficient amount");
		}
	}
	void amt() {
		System.out.println(a);
	}
}

public class Bank4 {
public static void main(String[] args) {
	String user="moulana";
	String pword="1234";
	mbank o=new mbank();
	Scanner s=new Scanner(System.in);
	String us=s.next();
	String pw=s.next();
	if( (us.equals(user)) && (pw.equals(pword)) ) {
		boolean flag=true;
		while(flag) {
			
		int i=s.nextInt();
		switch(i) {
		case 1:{
			System.out.println("deposite");
			o.depo(s.nextDouble());
			break;
		}
		case 2:{
			System.out.println("withdraw");
			o.with(s.nextDouble());
			break;
		}
		case 3:{
			System.out.println("balance");
			o.amt();
			break;
		}
		case 4:flag=false;break;
		default:{
			System.out.println("invalid");
		}
			
		}
	}
		
	}
	
	
}
}
