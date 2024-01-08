package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moulana","root","M1racle@123");
	PreparedStatement ps=c.prepareStatement("delete from student where id=?");
	ps.setInt(1,5971);
	int i=ps.executeUpdate();
	c.close();
	System.out.println("deleted");
		
	}

}
