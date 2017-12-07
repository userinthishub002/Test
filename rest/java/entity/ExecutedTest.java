package entity;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import primefaces_aqua.entity.Executed;

public class ExecutedTest {

private Executed executed;
	
	@Before
	//Creating a new Executed object
	public void init(){
		executed = new Executed();
	}
	
	@After
	//Deleting the link to Executed object
	public void tearDown(){
		executed = null;
	}
	
	@Test
	//Testing all our getters and setters methods
	public void gettersSettersTest(){
		executed.setId(1);
		assertTrue(executed.getId() == 1);
		
		executed.setSql("Test query");
		assertTrue(executed.getSql().equals(new String("Test query")));

		executed.setError("Test error");
		assertTrue(executed.getError().equals(new String("Test error")));

		executed.setRowCount(2);
		assertEquals(executed.getRowCount(),2);
		
		executed.setStatus("Test status");
		assertTrue(executed.getStatus().equals(new String("Test status")));

		executed.setTag("Test tag");
		assertTrue(executed.getTag().equals(new String("Test tag")));
		
		executed.setDateTime(new Date(100000));
		assertEquals(executed.getDateTime(), new Date(100000));	
	}
	
	@Test
	//Testing constructor
	public void constructorTest(){
		executed = new Executed(1, 
					new Date(999), 
					"Test sql", 
					2, 
					"Test tag", 
					"Test error", 
					"Test status");
		
		assertTrue(executed.getId() == 1);
		assertEquals(executed.getDateTime(), new Date(999));	
		assertTrue(executed.getSql().equals(new String("Test sql")));
		assertEquals(executed.getRowCount(),2);
		assertTrue(executed.getTag().equals(new String("Test tag")));
		assertTrue(executed.getError().equals(new String("Test error")));		
		assertTrue(executed.getStatus().equals(new String("Test status")));
	}

}
