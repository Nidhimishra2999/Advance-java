package in.co.beanprac;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.jdbc.SearchData;

public class SearchTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		testSearch();
		
	}

	private static void testSearch() throws ClassNotFoundException, SQLException {

		SearchData sd = new SearchData();
		SearchBean sb = new SearchBean();
	
		List l = sd.Search(sb);
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			
			SearchBean bean = (SearchBean) it.next();
			
			System.out.print(bean.getId()+"\t");
			System.out.print(bean.getRoll_no()+"\t");
			System.out.print(bean.getName()+"\t");
			System.out.print(bean.getPhysics()+"\t");
			System.out.print(bean.getChemistry()+"\t");
			System.out.println(bean.getMaths());
			
		}
	}

}
