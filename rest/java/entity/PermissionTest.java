package entity;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import primefaces_aqua.entity.Permission;

public class PermissionTest {

private Permission permission;
	
	@Before
	//Creating a new Permission object
	public void init(){
		permission = new Permission(1, 
				"Test database", 
				"Test owner", 
				"Test role", 
				"Test table name", 
				"Test table priveleges", 
				new Date(9999), 
				"Test note");
	}

	@After
	//Deleting the link to Database object
	public void tearDown(){
		permission = null;
	}
	
	@Test
	//Testing all our getters and setters methods
	public void gettersSettersTest(){
		permission.setId(2);
		assertTrue(permission.getId() == 2);
		
		permission.setDatabase("Test database - 2");
		assertTrue(permission.getDatabase().equals(new String("Test database - 2")));
		
		permission.setOwner("Test owner - 2");
		assertTrue(permission.getOwner().equals(new String("Test owner - 2")));
		
		permission.setRole("Test role - 2");
		assertTrue(permission.getRole().equals(new String("Test role - 2")));
		
		permission.setTableName("Test table name - 2");
		assertTrue(permission.getTableName().equals(new String("Test table name - 2")));
		
		permission.setTablePrivileges("Test table priveleges - 2");
		assertTrue(permission.getTablePrivileges().equals(new String("Test table priveleges - 2")));
		
		permission.setUpdateDate(new Date(3333));
		assertEquals(permission.getUpdateDate(), new Date(3333));
		
		permission.setNote("Test note - 2");
		assertTrue(permission.getNote().equals(new String("Test note - 2")));
	}
	
	@Test
	//Testing constructor
	public void constructorTest(){		
		assertTrue(permission.getId() == 1);
		assertTrue(permission.getDatabase().equals(new String("Test database")));
		assertTrue(permission.getOwner().equals(new String("Test owner")));
		assertTrue(permission.getRole().equals(new String("Test role")));
		assertTrue(permission.getTableName().equals(new String("Test table name")));
		assertTrue(permission.getTablePrivileges().equals(new String("Test table priveleges")));
		assertEquals(permission.getUpdateDate(), new Date(9999));
		assertTrue(permission.getNote().equals(new String("Test note")));
	}

}
