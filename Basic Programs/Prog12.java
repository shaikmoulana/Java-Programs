import java.util.*;
public class Prog12
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int n2=s.nextInt();
	char c=s.next().charAt(0);
    switch(c){
        case '+': System.out.println(n1+n2);break;
        case '-': System.out.println(n1-n2);break;
        case '*': System.out.println(n1*n2);break;
        case '/': System.out.println(n1/n2);break;
        case '%': System.out.println(n1%n2);break;
        default:
        System.out.println("invalid ");
    }
	
	
	}
}

