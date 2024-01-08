import java.util.*;
public class Prog13
{
	public static void main(String[] args) {

	Scanner s=new Scanner(System.in);
	String m=s.next();
	if(m.equals("feb"))
	{
	    System.out.println("28/29 days");
	    
	}
	else if(m.equals("jan") || m.equals("mar") || m.equals("may") ||m.equals("july") ||m.equals("aug") || m.equals("oct")
	|| m.equals("dec"))
	{
	    System.out.println("31 days");
	    
	}
    else if (m.equals("apr") || m.equals("jun") || m.equals("sep") || m.equals("nov"))
	{
	    System.out.println("30 days");
	    
	}

	
	}
}

