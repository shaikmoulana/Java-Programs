package exception_handling;

public class Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try {
		System.out.println(a/b);
		}
		finally{
			System.out.println("final block");
		}
	}

}


//		catch(ArithmeticException e){
//			System.out.println(e);
//			
//		}


//		int n[]=new int[5];
//		try {
//			n[10]=20;
//			System.out.println(n);
//		}
//		catch(ArrayIndexOutOfBoundsException y) {
//			System.out.println(y);
//		}