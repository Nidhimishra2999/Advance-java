package in.co.beanprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetDataB {

	public void Get(GetBean b) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from marksheet where id=2");

		while (rs.next()) {

			System.out.print(rs.getInt(1) + "\t");

			System.out.print(rs.getInt(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getInt(4) + "\t");
			System.out.print(rs.getInt(5) + "\t");
			System.out.println(rs.getInt(6));

		}
		rs.close();
		s.close();
	}

}
