package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//class bank{
//	double dep(double d) {
//		return d;
//	}
//
//}

public class banktaskinsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		bank o=new bank();
//		o.dep(s.nextDouble());
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/moulana","root","M1racle@123");
		PreparedStatement ps=con.prepareStatement("insert into banking (deposite,withdraw,balance) values(?,?,?)");
		ps.setDouble(1, 2000);
		ps.setDouble(2, 300);
		ps.setDouble(3, s.nextDouble());
//		PreparedStatement ps=con.prepareStatement("delete from banking where deposite=0");
		int i=ps.executeUpdate();
		con.close();
	             
	}
}
