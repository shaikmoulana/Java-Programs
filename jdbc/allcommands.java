package jdbc;
import java.sql.*;
public class allcommands {
public static void main(String[] args) throws ClassNotFoundException,SQLException{
	System.out.println("created,inserted,updated and deleted at a time");

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moulana","root","M1racle@123");
	PreparedStatement ct=con.prepareStatement("create table voterlist (vid int,name varchar(20),place varchar(20))");
	PreparedStatement in1=con.prepareStatement("insert into voterlist (name,place,vid) values(?,?,?)");
	PreparedStatement in2=con.prepareStatement("insert into voterlist (name,place,vid) values(?,?,?)");
	PreparedStatement in3=con.prepareStatement("insert into voterlist (name,place,vid) values(?,?,?)");
	in1.setString(1, "moulana");
	in1.setString(2,"guntur");
	in1.setInt(3, 101);
	
	in2.setString(1, "Supriya");
	in2.setString(2,"guntur");
	in2.setInt(3, 102);

	in3.setString(1, "chaitanya");
	in3.setString(2,"westGodavari");
	in3.setInt(3, 103);
	
	boolean b=ct.execute();
	int i1=in1.executeUpdate();
	int i2=in2.executeUpdate();
	int i3=in3.executeUpdate();
	
	System.out.println("Before update:");
	PreparedStatement se=con.prepareStatement("select * from voterlist");
	ResultSet rs=se.executeQuery();
	while(rs.next()) {
		int vid=rs.getInt("vid");
		String name=rs.getString("name");
		String place=rs.getString("place");
		System.out.println(vid+" "+name+" "+place);
	}
	System.out.println();

	System.out.println("after updated:");
	PreparedStatement up=con.prepareStatement("update voterlist set name=? where vid=?");
	up.setString(1, "jayanthi");
	up.setInt(2, 103);
	int u1=up.executeUpdate();
	
	PreparedStatement se1=con.prepareStatement("select * from voterlist");
	ResultSet rs1=se1.executeQuery();
	while(rs1.next()) {
		int vid=rs1.getInt("vid");
		String name=rs1.getString("name");
		String place=rs1.getString("place");
		System.out.println(vid+" "+name+" "+place);
	}
	
	System.out.println();
	System.out.println("After deleting:");
	PreparedStatement del=con.prepareStatement("delete from voterlist where vid=?");
	del.setInt(1, 102);
	int d1=del.executeUpdate();
	PreparedStatement se3=con.prepareStatement("select * from voterlist");
	ResultSet rs2=se3.executeQuery();
	while(rs2.next()) {
		int id=rs2.getInt("vid");
		String name=rs2.getString("name");
		String place=rs2.getString("place");
		System.out.println(id+" "+name+" "+place);
	}
		
	con.close();
	System.out.println("Done");


}
}
