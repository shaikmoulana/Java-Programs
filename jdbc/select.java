package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class select {
	public static void main(String[] args) {
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moulana","root","M1racle@123");
		PreparedStatement s=con.prepareStatement("select * from student");
		ResultSet rs=s.executeQuery();
		while(rs.next()) {
			int sid=rs.getInt("id");
			String sname=rs.getString("name");
			String sbranch=rs.getString("branch");
			String sclg=rs.getString("clg");
			System.out.println(sid+" "+sname+" "+sbranch+" "+sclg);

			//			int id=rs.getInt("vid");
//			String name=rs.getString("name");
//			String place=rs.getString("place");
//			System.out.println(id+" "+name+" "+place);
			
//			System.out.format("%s, %s, %s, %s \n",sid,sname,sbranch,sclg);
		}
		
		con.close();
		
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("query executed");
	}

}
