package jdbc;
import java.sql.*;
import java.util.*;
public class _new {
public static void main(String[] args) throws ClassNotFoundException, SQLException{
	Scanner s=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moulana","root","M1racle@123");
	PreparedStatement ps=con.prepareStatement("create table family (no int,name varchar(20),age int)");
	boolean x=ps.execute();
	System.out.println("Enter how many rows to insert:");
	int c=s.nextInt();
	System.out.println("enter name, no, age:");
	while(c>0) {
		PreparedStatement in=con.prepareStatement("insert into family (name,no,age) values(?,?,?) ");
		in.setString(1, s.next());
		in.setInt(2, s.nextInt());
		in.setInt(3, s.nextInt());
		int i=in.executeUpdate();
		c--;
	}
	con.close();
	System.out.println("done");
}
}
