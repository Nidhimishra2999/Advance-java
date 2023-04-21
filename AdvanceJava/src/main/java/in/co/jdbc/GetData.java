package in.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet", "root", "root");

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("Select * from marksheet where id = 1");

		while (rs.next()) {

			System.out.print(rs.getInt(1) + "\t");

			System.out.print(rs.getInt(2) + "\t");
			System.out.print(rs.getString(3) + "\t");
			System.out.print(rs.getInt(4) + "\t");
			System.out.print(rs.getInt(5) + "\t");
			System.out.println(rs.getInt(6));

		}
		rs.close();
		st.close();
	}
}
