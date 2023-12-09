package co4;
import java.sql.*;

/*
 * 1. import ---> java.sql
 * 2. load and register the driver--> com.mysql.jdbc.Driver
 * 3. create connection --> Connection
 * 4. create a statement --> Statement
 * 5. execute the query -->
 * 6. Process the result
 * 7. close
 */
public class DemoClass {

	public static void main(String[] args) throws Exception {
	
		String url="jdbc:mysql://localhost:3307//aa1";
		String uname="root";
		String pass = "Chandana27072005!";
		String query = "select name from aa1 where rollno =213";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name= rs.getString("Student_name");
		
		System.out.println(name);
		
		st.close();
		con.close();
	}

}
