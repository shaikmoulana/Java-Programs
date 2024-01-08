
class Parent{
	void A() {
		System.out.println("method a");
	}
	void B() {
		System.out.println("method b");
	}
}
	
class child1 extends Parent{
	void C() {
		System.out.println("method c");
	}
}

public class Inherit_Single{
public static void main(String[] args) {
//Inherit_Single s=new Inherit_Single();	
	child1 s=new child1();
s.A();
s.B();
s.C();
}

}