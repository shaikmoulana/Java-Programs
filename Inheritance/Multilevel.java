package Inheritance;
class parent{
	void a() {
		System.out.println("a");
	}
}
class child extends parent{
	void b() {
		System.out.println("b");
	}
}

class child1 extends child{
	void c() {
		System.out.println("c");
	}
}
public class Multilevel{
	public static void main(String[] args) {
		child1 s=new child1();
		s.a();
		s.b();
		s.c();
	}
}


