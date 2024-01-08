package Polymorphism;

public class Overloadding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload s=new overload();
	      s.add();
	      s.add(10);
	       s.add(10,20);
	       s.add(4.5,6.7);
	       s.add(9,8.7);
	       s.add("h");
	       s.add(1,2,4);
	       s.add(1,2.6,8);

	   }
}
	class overload{
	    void add(){
	        System.out.println("Method 1");
	    }
	    void add(int a){
	        System.out.println("Method 2");
	    }
//	     void add(int b){
//	         System.out.println("Method 3");
//	     }
	    void add(int a, int b){
	        System.out.println("Method 4");
	    }
//	     void add(int x,int y){
//	         System.out.println("Method 5");
//	     }
	    void add(double a,double b){
	        System.out.println("Method 6");
	    }
	    void add(int a,double b){
	        System.out.println("Method 7");
	    }
	    
	    void add(String a){
	        System.out.println("Method 8");
	    }
	    void add(int a,int b,int c){
	        System.out.println("Method 9");
	    }
	    void add(int a,double b,int c) {
	    	System.out.println("Method 10");
	    }

}
