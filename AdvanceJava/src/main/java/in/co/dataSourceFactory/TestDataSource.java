package in.co.dataSourceFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDataSource {

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 50; i++) {
			System.out.println(i);

			String sql = "select id,roll_No,name,physics,chemistry,maths from marksheet";

			Connection conn = jdbcDataSource.getconnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			System.out.println("DB Pool Connection");
			System.out.println("id\troll_No\tname\tphysics\tchemisrty\tmaths");

			while (rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print(rs.getString(2));
				System.out.print(rs.getString(3));
				System.out.print(rs.getInt(4));
				System.out.print(rs.getInt(5));
				System.out.println(rs.getInt(6));

			}
			jdbcDataSource.closeConnection(conn, stmt, rs);
		}

	}
}
