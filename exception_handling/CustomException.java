package exception_handling;
import java.util.*;
public class CustomException {

	public static void main(String[] args) throws InvalidAgeException {
	try {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		if(age<18) {	
			throw new InvalidAgeException("not eligible");
		}
	}
	catch(InvalidAgeException x){
		System.out.println("not eligible to vote");
		x.getMessage();
	}
		
	}

}

class InvalidAgeException extends Exception{
	InvalidAgeException(String e){
		super(e);
	}
}