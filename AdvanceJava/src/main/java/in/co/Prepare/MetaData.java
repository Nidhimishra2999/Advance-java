package in.co.Prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class MetaData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");

		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery("Select id , name from director");

		ResultSetMetaData rsmt = rs.getMetaData();

		System.out.println(rsmt.getCatalogName(1));
		System.out.println(rsmt.getCatalogName(1));

		int columncount = rsmt.getColumnCount();

		System.out.println(columncount);

	}

}
