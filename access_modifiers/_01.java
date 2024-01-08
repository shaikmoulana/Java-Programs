package access_modifiers;

class _01 {
	private void z1() {
		System.out.println("private");
	}
	public static void main(String[] args) {
		_01 s=new _01();
		s.z1();
	}

}
