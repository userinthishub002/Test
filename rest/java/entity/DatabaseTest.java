package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import primefaces_aqua.entity.Database;

public class DatabaseTest {

private Database database;
	
	@Before
	//Creating a new Database object
	public void init(){
		database = new Database(1, "TestName", "TestUrl");
		System.out.println("The test was successful");
		
	}
	
	@After
	//Deleting the link to Database object
	public void tearDown(){
		database = null;
	}
	
	@Test
	//Testing all our getters methods
	public void gettersTest(){
		assertTrue(database.getId() == 1);
		assertTrue(database.getName().equals(new String("TestName")));
		assertTrue(database.getUrl().equals(new String("TestUrl")));
		
	}
	
	@Test
	//Testing all our setters methods
	public void settersTest(){
		database.setId(2);
		assertTrue(database.getId() == 2);
		
		database.setName("TestName2");
		assertTrue(database.getName().equals(new String("TestName2")));
		
		database.setUrl("TestUrl2");
		assertTrue(database.getUrl().equals(new String("TestUrl2")));		
	}

}
