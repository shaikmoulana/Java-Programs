package bankingException;
import java.util.*;

public class Bank1 {
	double amt=100;
	
	void Deposite(double d) {
		if(d>500) {
			amt=amt+d;
			System.out.println("Deposited successfully");			
		}
		else {
			System.out.println("Please  Deposite more than 500/-");
		}
	}
	
	void Withdraw(double w) {
		if(amt>w) {
			amt=amt-w;
			System.out.println("Take the money");			
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	
	void Balance() {
		System.out.println("Balance amount: "+amt);
	}
	
	public static void main(String[] args) {
		String username="moulana";
		String password="5961";
		Scanner sc=new Scanner(System.in);
		Bank1 o1=new Bank1();
		int c=0;
		while(c<3){
			System.out.print("Please enter username: ");
			String un=sc.next();
			System.out.print("Please enter PassWord: ");
			String pw=sc.next();
			if( (username.equals(un)) && (password.equals(pw)) ) {
				System.out.println("Welcome to Miracle Bank");
				System.out.println("Enter 1 for deposit.");
				System.out.println("Enter 2 for withdraw.");
				System.out.println("Enter 3 for balance.");
				
				int x=sc.nextInt();
				switch(x) {
				case 1:{
					System.out.print("Enter Deposite money: ");
					o1.Deposite(sc.nextDouble());
					break;
				}
				case 2:{
					System.out.print("Enter withdraw money: ");				
					o1.Withdraw(sc.nextDouble());		
					break;
				}
				case 3:{
					o1.Balance();
					break;
				}
				default:System.out.println("invalid number");
			}
				break;
			}
			else {	
				System.out.println("Please enter correct username/password");
			}					
			c++;
		}
		
	}

}