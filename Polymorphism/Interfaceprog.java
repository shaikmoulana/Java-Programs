package Polymorphism;
import java.util.*;

interface A{
	void fun1();
}
interface B{
	void fun2();
}

class C implements A,B{
	public void fun1() {
		System.out.println("A fun");
	}
	public void fun2() {
		System.out.println("B fun");
	}
}

public class Interfaceprog {
public static void main(String[] args) {
	C o1=new C();
	o1.fun1();
	o1.fun2();
	
}
}
