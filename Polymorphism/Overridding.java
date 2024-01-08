package Polymorphism;

public class Overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ride1 s=new ride1();
		s.add();

	   }
}
class override{
    void add(){
	    System.out.println("parent");
	}
}
 class ride1 extends override{
	 void add() {
		 System.out.println("child");
	 }
}
