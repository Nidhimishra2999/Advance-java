package in.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nidhi", "root", "root");

		Statement st = conn.createStatement();

		int i = st.executeUpdate("insert into marksheet values (6,'n2006','sumit','yadav',20,80,70)");
		System.out.println(i);
	}

}
