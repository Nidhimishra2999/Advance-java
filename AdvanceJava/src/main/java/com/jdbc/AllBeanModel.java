package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

import in.co.beanprac.SearchBean;
import in.co.beans.MarksheetBean;

public class AllBeanModel {

	public void testAdd(AllBean b) throws Exception {

		ResourceBundle rs = ResourceBundle.getBundle("in.co.rays.bundle.app");

		Class.forName(rs.getString("Driver"));

		String url = rs.getString("url");
		String user = rs.getString("user");
		String pwd = rs.getString("pwd");

		Connection c = DriverManager.getConnection(url, user, pwd);
		PreparedStatement ps = c.prepareStatement("select * from marksheet");
		ResultSet r = ps.executeQuery();
		while (r.next()) {
			System.out.print("\t" + r.getInt(1));
			System.out.print("\t" + r.getString(2));
			System.out.print("\t" + r.getString(3));
			System.out.print("\t" + r.getInt(4));
			System.out.print("\t" + r.getInt(5));
			System.out.println("\t" + r.getInt(6));

		}

	}

	public void update(AllBean b) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");

		PreparedStatement p = conn.prepareStatement("update marksheet set name= ? where id = ?");

		p.setString(1, b.getName());
		p.setInt(2, b.getId());

		p.executeUpdate();

		conn.close();

	}

	public void delete(AllBean ab) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");

		PreparedStatement p = conn.prepareStatement("delete from marksheet where id = 11");

		int i = p.executeUpdate();

		System.out.println(i);

		conn.close();

	}

	public void Get(AllBean g) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");

		PreparedStatement p = conn.prepareStatement("select * from marksheet where roll_No = 101");

		ResultSet rs = p.executeQuery();
		
		// System.out.println(rs.getInt(1));
		//System.out.println(p.executeQuery());


	}

	
	

	public List Search(SearchBean bean) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from marksheet");

		ArrayList list = new ArrayList();
		SearchBean bean1 = null;

		while (rs.next()) {

			bean1 = new SearchBean();

			bean1.setId(rs.getInt(1));
			bean1.setRoll_no(rs.getString(2));
			bean1.setName(rs.getString(3));
			bean1.setPhysics(rs.getInt(4));
			bean1.setChemistry(rs.getInt(5));
			bean1.setMaths(rs.getInt(6));

			list.add(bean1);
		}

		return list;

	}

}
