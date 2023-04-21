package in.co.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nidhi", "root", "root");

		Statement s = conn.createStatement();

		int i = s.executeUpdate("update marksheet set fname= 'milan' where id = 6");

		//int i = s.executeUpdate("delete from marksheet where id = 6");

		System.out.println(i);

	}

}
