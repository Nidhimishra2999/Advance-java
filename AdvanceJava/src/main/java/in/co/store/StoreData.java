package in.co.store;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoreData {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");

		CallableStatement cs = c.prepareCall("{CALL mark(?)}");

		cs.registerOutParameter(1, Types.INTEGER);

		cs.execute();

		int count = cs.getInt(1);

		System.out.println(count);

	}

}
