package util;

import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import primefaces_aqua.util.Utils;

public class UtilsTest {
	private Utils util;
	
	@Before
	public void init(){
		util = new Utils();
	}
	
	@After
	public void tearDown(){
		util = null;
	}
	
	@Test
	public void readDbConnectionStrTest(){
		Map<String, String> map = new HashMap<String, String>();

		map = util.readDbConnectionStr();
		
		assertFalse(map.isEmpty());
	}
}
