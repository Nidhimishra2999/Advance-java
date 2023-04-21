package in.co.beans;

public class MarksheetTest {

	public static void main(String[] args) throws Exception {

		TestAdd();
		//TestUpdate();
		//TestDelete();
		

	}

	private static void TestDelete() {
		
		MarksheetBean bean= new MarksheetBean();
		
		bean.setName("");
		
		
		
		
	}

	private static void TestUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		
		bean.setName("Darsh");
		bean.setId(3);
		
		MarksheetModel model = new MarksheetModel();
		
		model.update(bean);
	
		System.out.println("updated");
	}

	private static void TestAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		/*
		 * bean.setId(3); bean.setRoll_No("103"); bean.setName("Darshan");.
		 * bean.setPhysics(00); bean.setChemistry(01); bean.setMaths(02);
		 */
		
		
		MarksheetModel m = new MarksheetModel();
		
		m.add(bean);
		
	    
	     

	}
}
