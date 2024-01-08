package jdbc;
import java.sql.*;
import java.util.*;
public class like {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner s=new Scanner(System.in);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moulana","root","M1racle@123");
	PreparedStatement ps=con.prepareStatement("select * from student where name like 'a%'");
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		String n=rs.getString("name");
		System.out.println(n);
	}
}
}
