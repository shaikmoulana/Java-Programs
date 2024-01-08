package jdbc;
import java.sql.*;
import java.util.*;
public class j1 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moulana","root","M1racle@123");
//		PreparedStatement ps=con.prepareStatement("create table banking (cid int,cname varchar(25),phno int)");
//		boolean b=ps.execute();
//		PreparedStatement ps=con.prepareStatement("insert into banking (cid,cname,phno) values(10,'vijaymaalya',1234567890)");
//		PreparedStatement ps=con.prepareStatement("insert into banking values(9,'neeraj modi',150000000)");
//		    PreparedStatement ps=con.prepareStatement("update banking set phno='987654321' where cid=9");
		PreparedStatement ps=con.prepareStatement("select * from banking");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int cid=rs.getInt("cid");
			String cname=rs.getString("cname");
			String phno=rs.getString("phno");
			System.out.println(cid+" "+cname+" "+phno);	
		}
		con.close();
		System.out.println("updated");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
