package in.co.beanprac;

public class DeleteTest {
	
	public static void main(String[] args) throws Exception {
		
		testDelete();
		
	}

	private static void testDelete() throws Exception {
	 DeleteData d= new DeleteData();
	 DeleteBean b = new DeleteBean();
	 d.delete(b);
		
	}

}
