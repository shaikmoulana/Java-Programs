package jdbc;
import java.sql.*;
public class Resultset {
public static void main(String[] args) throws ClassNotFoundException,SQLException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moulana","root","M1racle@123");
	PreparedStatement ps=con.prepareStatement("select * from student");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		
	}
}
}
