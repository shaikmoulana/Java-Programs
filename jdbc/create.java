package jdbc;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
public class create {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/moulana","root","M1racle@123");
//	Statement st=c.createStatement();
//	boolean b=st.execute("create table demo (id int, name varchar(20))");
//	System.out.println(b);

	PreparedStatement ps=c.prepareStatement("create table banking (deposite double,withdraw double,balance double)");
	boolean b=ps.execute();
	System.out.println(b);
	
	
	c.close();

}
}
