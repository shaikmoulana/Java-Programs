package abstraction; 
abstract class parenta{
	abstract void a();
	void c() {
		System.out.println("Non-Abstract method 2");
	}
}
public class Abstract_and_NonAbstract extends parenta{
	void a() {
		System.out.println("Abstract Method");
	}
	void b() {
		System.out.println("Non-Abstract Method");
	}
	public static void main(String[] args) {
		Abstract_and_NonAbstract s=new Abstract_and_NonAbstract();
		s.a();
		s.b();
		s.c();
	}
}