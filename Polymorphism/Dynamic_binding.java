package Polymorphism;

class cse{
	void sub1() {
		System.out.println("subject 1");
	}
	void sub2() {
		System.out.println("subject 2");
	}
	void sub3() {
		System.out.println("subject 3");
	}
	void sub4() {
		System.out.println("subject 4");
	}
}
class ece extends cse{
	void sub1() {
		System.out.println("ece subject 1");
	}
	void sub2() {
		System.out.println("ece subject 2");
	}
	void sub5() {
		System.out.println("subject 5");
	}
	void sub6() {
		System.out.println("subject 6");
	}
}


public class Dynamic_binding {
	public static void main(String[] args) {
//	ece o=new ece();
//	cse o=new cse();
	cse o=new ece();
	o.sub1();
	o.sub2();
	o.sub3();
	o.sub4();
//	o.sub5();
//	o.sub6();
}
}
