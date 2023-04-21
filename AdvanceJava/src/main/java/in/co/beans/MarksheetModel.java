package in.co.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MarksheetModel {

	public void add(MarksheetBean Bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");

		//Statement st = conn.createStatement();
		PreparedStatement p = conn.prepareStatement("select * from marksheet");

//		p.setInt(1, Bean.getId());
//		p.setString(2, Bean.getRoll_No());
//		p.setString(3, Bean.getName());
//		p.setInt(4, Bean.getPhysics());
//		p.setInt(5, Bean.getChemistry());
//		p.setInt(6, Bean.getMaths());

		ResultSet rs = p.executeQuery();
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println(rs.getInt(5));
			System.out.println(rs.getInt(6));
		}
		
		//st.close();
		conn.close();

	}

	public void update(MarksheetBean Bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");

		Statement st = conn.createStatement();
		PreparedStatement p = conn.prepareStatement("update marksheet set name= ? where id = ?");

		p.setString(1, Bean.getName());
		p.setInt(2, Bean.getId());

		int i = p.executeUpdate();
		
		
		st.close();
		conn.close();

	}
}
