package access_modifiers;
class pv2{
	public void z1() {
		System.out.println("private");
	}	
}
public class _02 {
public static void main(String[] args) {
	pv2 s=new pv2();
	s.z1();
}

}
