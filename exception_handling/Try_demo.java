package exception_handling;

public class Try_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			int c=a/b;		
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException s1) {
			System.out.println(s1);
		}
		
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		

		System.out.println("checking the exception");
		
	}

}
