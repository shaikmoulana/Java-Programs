package Revision;
import java.util.*;

class override{
	void add(int a,int b,int e) {
		System.out.println("hii");
	}
}
class child extends override{
	void add(int c,int d) {
		System.out.println("hello");
	}
}

public class overloadride {
public static void main(String[] args) {
	override o=new child();
	o.add(12,23,7);
	
	
}
}
