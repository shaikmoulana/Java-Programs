package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner s=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/moulana","root","M1racle@123");
//	PreparedStatement ps=c.prepareStatement("update student set id=? where name=?");
//	ps.setInt(1, 5971);
//	ps.setString(2, "mukesh");
	
	PreparedStatement ps=c.prepareStatement("update student set branch=? where id=?");
	ps.setString(1,s.nextLine());
	ps.setInt(2,s.nextInt());
	
	int res=ps.executeUpdate();
	c.close();
	System.out.println("updated");
	
	}

}
