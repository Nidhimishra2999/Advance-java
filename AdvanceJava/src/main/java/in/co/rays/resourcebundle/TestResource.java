package in.co.rays.resourcebundle;

import java.util.ResourceBundle;

public class TestResource {

	public static void main(String[] args) throws Exception {

		ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.app");
		Class.forName(rb.getString("Driver"));
		String url = rb.getString("url");
		String user = rb.getString("user");
		String pwd = rb.getString("pwd");

		System.out.println(url);
		System.out.println(user);
		System.out.println(pwd);

	}

}
