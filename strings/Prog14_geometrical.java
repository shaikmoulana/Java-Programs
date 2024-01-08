package strings;

abstract class Shape{
	abstract void numberOfSidesO();
}

class Trapezoid extends Shape{
	void numberOfSidesO() {
		System.out.println("Trapezoid sides: 4");
	}
}

class Triangle extends Shape{
	void numberOfSidesO() {
		System.out.println("Triangle sides: 3");
	}
}

class Hexagone extends Shape{
	void numberOfSidesO() {
		System.out.println("Hexogone sides: 6");
	}
}
public class Prog14_geometrical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trapezoid o1=new Trapezoid();
		Triangle o2=new Triangle();
		Hexagone o3=new Hexagone();
		
	o1.numberOfSidesO();
	o2.numberOfSidesO();
	o3.numberOfSidesO();
		
		
	}

}
