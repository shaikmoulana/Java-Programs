package jdbc;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner s=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moulana","root","M1racle@123");
//	Statement s=(Statement) con.createStatement();
//	ResultSet i = ((java.sql.Statement) s).executeQuery("select * from student");
//	System.out.println(i+" executed");
	PreparedStatement ps=con.prepareStatement("insert into student (name,branch,clg,id) values(?,?,?,?)");
//	ps.setString(1, "mukesh");
//	ps.setString(2, "cse");
//	ps.setString(3, "kits");
//	ps.setInt(4, 5970);

	ps.setString(1,s.nextLine());
	ps.setString(2, s.nextLine());
	ps.setString(3, s.nextLine());
	ps.setInt(4, s.nextInt());
	
	int i=ps.executeUpdate();
	System.out.println(i+" updated");
	
	con.close();
	}

}
