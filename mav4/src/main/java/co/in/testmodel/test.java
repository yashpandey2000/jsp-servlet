package co.in.testmodel;

import java.sql.SQLException;

import co.in.bean.regisbean;
import co.in.model.regismodel;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		testregistration();

	}

	private static void testregistration() throws ClassNotFoundException, SQLException {
		
		regisbean bean = new regisbean();
		
//		bean.setFullname("yash");
//		bean.setContact("98605055");
//		bean.setEmailid("yash@2000gmail.com");
//		bean.setPassword("12345");
//		bean.setConfirmpassword("12345");
		
	bean.setId("1");
//		
		regismodel model = new regismodel();
//		
           model.register(bean);
		
	}

}
