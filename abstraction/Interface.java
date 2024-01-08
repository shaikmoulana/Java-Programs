package abstraction;

interface Parent{
	void A();
}

class Child implements Parent{
	public void A() {	//Gurthupettuko e public keyword anedi
		System.out.println("Interface");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child s=new Child();
		s.A();
	}

}
