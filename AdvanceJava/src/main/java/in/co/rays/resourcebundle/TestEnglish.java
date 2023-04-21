package in.co.rays.resourcebundle;

import java.util.ResourceBundle;

public class TestEnglish {

	public static void main(String[] args) throws Exception {
	
		ResourceBundle rb= ResourceBundle.getBundle("in.co.rays.bundle.eng");
		Class.forName(rb.getString("Driver"));
		
		System.out.println(rb.getString("Greeting"));

	}

}
