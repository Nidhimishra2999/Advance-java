package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.co.beanprac.SearchBean;

public class SearchData {
	
	public List Search(SearchBean bean) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","root");
		Statement s=c.createStatement();
		ResultSet rs = s.executeQuery("select * from marksheet limit 0,10");
		
		ArrayList list = new ArrayList();
		SearchBean bean1 = null;
		
		while(rs.next()) {
			
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
