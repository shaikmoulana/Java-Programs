package Inheritance;
class p{
	void A() {
		System.out.println("a");
	}
}
class c extends p{
	void B() {
		System.out.println("b");
	}
}
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c s=new c();
		s.A();
		s.B();
	}

}
