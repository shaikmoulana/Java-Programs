package bankingException;
import java.util.*;

public class Bank {
	double amt=0;
	
	void Deposite(double d) throws CustomException{
		if(d>500) {
			amt=amt+d;
			System.out.println("Deposited successfully");			
		}
		else {
			throw new CustomException("Please  Deposite more than 500/-");
		}
	}
	void Withdraw(double w) throws CustomException {
		if(amt>w) {
			amt=amt-w;
			System.out.println("Take the money");			
		}
		else {
			throw new CustomException("Insufficient balance");
		}
	}
	
	void Balance() {
		System.out.println("Balance amount: "+amt);
	}
	
	
	public static void main(String[] args) {
		String username="moulana";
		String password="5961";
		Scanner sc=new Scanner(System.in);
		Bank o1=new Bank();
		int c=0;
		boolean flag=true;
		while(c<3){
			System.out.print("Please enter username: ");
			String un=sc.next();
			System.out.print("Please enter PassWord: ");
			String pw=sc.next();
			if( (username.equals(un)) && (password.equals(pw)) ) {
				System.out.println("Welcome to Miracle Bank");
				System.out.println("Enter 1 for Deposit.");
				System.out.println("Enter 2 for Withdraw.");
				System.out.println("Enter 3 for Balance.");
				System.out.println("Enter 4 for Exit");
				while(flag) {
				int x=sc.nextInt();
				switch(x) {
				case 1:{
					System.out.print("Enter Deposite money: ");
					try {
						o1.Deposite(sc.nextDouble());						
					}
					catch(CustomException str) {
						System.out.println(str.getMessage());
					}
					break;
				}
				case 2:{
					System.out.print("Enter withdraw money: ");	
					try {
						o1.Withdraw(sc.nextDouble());								
					}
					catch(CustomException str) {
						System.out.println(str.getMessage());
					}
					break;
				}
				case 3:{
					o1.Balance();
					break;
				}
				case 4:flag=false;break;
				
				default:System.out.println("invalid number");
			}
		}
				
		break;
		}
			else {	
				
				System.out.println("Please enter correct username/password");
			}					
			c++;
		}
		try {
			if(flag) {
				throw new CustomException("Many attemps ");
			}
		}
		catch(CustomException str) {
			System.out.println(str.getMessage());
		}
//		System.out.println(d);
//		System.out.println(w);
//		System.out.println(amt);
		
		
		
	}

}

class CustomException extends Exception{
	CustomException(String str){
	super(str);	
	}
}





