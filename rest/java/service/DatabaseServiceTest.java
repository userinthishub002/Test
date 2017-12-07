package service;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import primefaces_aqua.entity.Database;
import primefaces_aqua.service.DatabaseService;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class DatabaseServiceTest {
	private DatabaseService dbService;
	
	@Before
	public void init(){
		dbService = new DatabaseService();
	}
	
	@After
	public void tearDown(){
		dbService = null;
	}
	
	@Test
	public void gettersSettersTest(){
		List<Database> dbList = new ArrayList<Database>();
		dbList.add(new Database(1,"db1","link1"));
		dbList.add(new Database(2,"db2","link2"));
		dbList.add(new Database(3,"db3","link3"));
		
		dbService.setDatabases(dbList);
		assertEquals(dbService.getDatabases(), dbList);
	}
	
	@Test
	public void initTest(){	
		dbService.init();
		assertFalse(dbService.getDatabases().isEmpty());
	}
}
