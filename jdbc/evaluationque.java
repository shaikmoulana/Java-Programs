package jdbc;
import java.sql.*;
public class evaluationque {
public static void main(String[] args) throws ClassNotFoundException,SQLException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moulana","root","M1racle@123");
	PreparedStatement ps=con.prepareStatement("update employee set ename=?,role=?,salary=? where eid=?");
	ps.setString(1, "supriya");
	ps.setString(2, "Developer");
	ps.setInt(3, 30000);
	ps.setInt(4, 5960);
	int i=ps.executeUpdate();
	con.close();
	System.out.println("updated");
	
}
}
