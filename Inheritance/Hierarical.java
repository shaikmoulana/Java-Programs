package Inheritance;
class p1{
	void a() {
		System.out.println("a");
	}
}
class c1 extends p1{
	void b() {
		System.out.println("b");
	}
}

class c2 extends p1{
	void c() {
		System.out.println("c");
	}
}
public class Hierarical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c2 s1=new c2();
		s1.a();
		c1 s2=new c1();
		s2.b();
		
	}

}
