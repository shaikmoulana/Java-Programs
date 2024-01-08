package access_modifiers;

class C1{
	void M1() {
		System.out.println("Default Method");
	}
}

public class DefaultClass {
	public static void main(String[] args) {
		C1 s=new C1();
		s.M1();
	}

}
