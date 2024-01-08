package strings;

class Person{
	String name="moulana";
}
class Employee extends Person{
	double salary=246000.5;
	int year=2023;
	String NInumber="MI16";
}

public class Prog13_Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee o=new Employee();
		System.out.println(o.name+ " "+ o.salary+" "+o.year+" "+o.NInumber);
		
	}

}
