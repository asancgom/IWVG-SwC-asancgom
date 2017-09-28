package es.upm.miw.swc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.swc.User;


public class UserTest {
	private User user;
	
	@Before 
	public void before() {
        user = new User(2,"name","surname");
    }
	
	@Test 
	public void testUserIntStringStringWithCapitalLetters() {
		assertEquals(2, user.getNumber());
		assertEquals("Name", user.getName());
		assertEquals("Surname", user.getFamilyName());
	}
	
	@Test 
	public void textUserFullName(){
		assertEquals("Name Surname", user.fullName());
	}

	
}
