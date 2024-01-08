package Revision;

class Animal {
	int a=10;
	int b=20;
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
	int a=30;
	
    public void eat() {
    	int a=40;
//    	super.eat(); // Calls the eat method of the superclass
        System.out.println("Dog is eating");
        System.out.println(super.a);
    }
}

public class superkeyword {
public static void main(String[] args) {
	Dog o=new Dog();
	o.eat();
}
}
