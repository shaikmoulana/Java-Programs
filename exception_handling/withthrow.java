package exception_handling;
import java.util.*;

public class withthrow {
public static void main(String[] args) {
	try {
//		int a=9%0;
		throw new Exception("ghf");
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("hello");  
	}
}
}
