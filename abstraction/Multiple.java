package abstraction;

interface parent1{
	void A();
}
interface parent2{
	void B();
}
class child1 implements parent1,parent2{
	public void A() {
		System.out.println("Method 1");
	}
	public void B() {
		System.out.println("Method 2");
	}
}

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 s=new child1();
		s.A();
		s.B();
	}

}
