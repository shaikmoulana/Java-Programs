package Inheritance;

class Parent1{
	void a() {
		System.out.println("a");
	}
}
class Parent2{
	void b() {
		System.out.println("b");
	}
}

class ch1 extends Parent1{
	void c() {
		System.out.println("c");
	}
	
}

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch1 s=new ch1();
		s.a();
		s.c();
		
	}

}
