package abstraction;

abstract class parent{
	abstract void A();
}

class child extends parent{
	void A() {
		System.out.println("Abstract Method");
	}
}

public class Abstract_and_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child s=new child();
		s.A();
	}

}
