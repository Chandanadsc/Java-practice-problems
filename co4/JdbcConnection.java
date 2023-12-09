package co4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcConnection {
public static void main(String[] args) {
	try {
		String url
        = "jdbc:mysql://localhost:3306/aoop";// table details
    String username = "root"; // MySQL credentials
    String password = "Chandana27072005!";
    String query
        = "select *from students";
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt =con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from aoop");
	while(rs.next()) {
		String name = rs.getString("student_name");
		String roll = rs.getString("rollno");
		System.out.println("Student Name:"+name+" Roll Number"+roll);
		stmt.close();
		con.close();
		
	}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	// thin driver
	
}
}
