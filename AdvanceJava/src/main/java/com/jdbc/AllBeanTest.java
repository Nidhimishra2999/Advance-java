package com.jdbc;

import in.co.beanprac.DeleteBean;
import in.co.beanprac.DeleteData;
import in.co.beans.MarksheetBean;
import in.co.beans.MarksheetModel;

public class AllBeanTest {
	public static void main(String[] args) throws Exception {
		testAdd();
		// testUpdate();
		// testdelete();
		// testget();
		// testMeritList();

	}
		
		



	private static void testMeritList() {
		
		AllBean BeanS= new AllBean();
		AllBeanModel AllBeanS= new AllBeanModel();
		
		
		
		
		
	}

	private static void testget() throws Exception {
		
		AllBean ag= new AllBean();
		AllBeanModel abmg = new AllBeanModel();
		
		abmg.testAdd(ag);
	
		
	}

	private static void testdelete() throws Exception {

		AllBean ab = new AllBean();
		AllBeanModel de = new AllBeanModel();

		de.delete(ab);

	}

	private static void testUpdate() throws Exception {

		AllBean bean = new AllBean();
		AllBeanModel abm = new AllBeanModel();

		bean.setName("nikita");
		bean.setId(11);

		abm.update(bean);

		System.out.println("updated" + bean);
	}

	private static void testAdd() throws Exception {

		AllBeanModel a = new AllBeanModel();
		AllBean b = new AllBean();

		a.testAdd(b);

	}
}

