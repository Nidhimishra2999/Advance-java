package in.co.Prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionHandling {

	public static void main(String[] args) throws Exception {

		for (int i = 10; i < 15; i++) {

			Testadd(i, "shubham", "kumawat", 254136526, 12000000);
			System.out.println(i);
		}

	}

	private static void Testadd(int id, String name, String surname, int number, int salary) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

		conn.setAutoCommit(false);
		Statement st = conn.createStatement();
		// ResultSet rs = st.executeQuery("insert into employe values");

		try {
			PreparedStatement p = conn.prepareStatement("insert into employe values (?,?,?,?,?)");

			p.setInt(1, id);
			p.setString(2, name);
			p.setString(3, surname);
			p.setInt(4, number);
			p.setInt(5, salary);

			int i = p.executeUpdate();
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
