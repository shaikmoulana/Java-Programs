package Evaluation;
import java.util.*;
import java.io.*;

class Customer{
	int id;
	String name;
	Customer(int id,String name){
	this.id=id;
	this.name=name;
	}
}
public class practice5 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
//	Customer obj1=new Customer(123,"moulana");
	ArrayList<Customer> al=new ArrayList<Customer>();
	for(int i=0;i<n;i++) {
		al.add(new Customer(s.nextInt(),s.next()));		
	}
	Iterator i=al.iterator();
	while(i.hasNext()) {
		Customer o=(Customer)i.next();
		System.out.println(o.id+" "+o.name);
	}

}
}
