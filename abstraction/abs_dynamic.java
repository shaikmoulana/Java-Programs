package abstraction;

abstract class cse{
	abstract void sec1();
}
abstract class ece{
	abstract void sec2();
}
class kits extends cse{
	void sec1() {
		System.out.println("section 1");
	}
	void sec2() {
		System.out.println("section 2");
	}
}

public class abs_dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kits o=new kits();
		o.sec1();
		o.sec2();
		
	}

}
