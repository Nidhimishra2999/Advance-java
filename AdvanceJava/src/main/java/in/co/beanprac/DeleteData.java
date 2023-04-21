package in.co.beanprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteData {

	public void delete(DeleteBean b) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");
		Statement s = c.createStatement();

		int i = s.executeUpdate("delete from marksheet where id = 2");

		System.out.println(i);
		c.close();
		s.close();

	}

}
