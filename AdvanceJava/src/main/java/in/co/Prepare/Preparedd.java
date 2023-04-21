package in.co.Prepare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Preparedd {

	public static void main(String[] args) throws Exception {
		// Testadd();
		// TestSubs(6, "nisha");
		//TestSearch();
		
		TestNextPk();
		

	}

	private static void TestNextPk() {
		
		
		
		
		
		
	}

	private static void TestSearch() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("select * from employe ");
		
		while(r.next()) {
			
			System.out.println(r.getInt(1));
			System.out.println(r.getString(2));
			System.out.println(r.getString(3));
			System.out.println(r.getInt(4));
			System.out.println(r.getInt(5));
			
			
		}
		
	}

	private static void TestSubs(int id, String fname) throws Exception

	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/nidhi", "root", "root");

		Statement s = c.createStatement();

		PreparedStatement p = c.prepareStatement("update marksheet set fname=? where id=?");

		p.setString(1, fname);
		p.setInt(2, id);

		int i = p.executeUpdate();
		System.out.println(i);

	}

	private static void Testadd() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/nidhi", "root", "root");
		Statement s = c.createStatement();

		PreparedStatement p = c.prepareStatement("insert into marksheet values(?,?,?,?,?,?,?)");

		p.setInt(1, 06);
		p.setString(2, "n2006");
		p.setString(3, "zxc");
		p.setString(4, "asddf");
		p.setInt(5, 20);
		p.setInt(6, 25);
		p.setInt(7, 22);

		int i = p.executeUpdate();
		System.out.println(i);

	}

}
