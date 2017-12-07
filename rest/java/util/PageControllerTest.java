package util;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import primefaces_aqua.util.PageController;

public class PageControllerTest {
	private PageController pageController;
	
	@Before
	public void init(){
		pageController = new PageController();
	}
	
	@After
	public void tearDown(){
		pageController = null;
	}
	
	@Test
	public void navigationTest(){
		assertTrue(pageController.toIndex().equals(new String("index")));
		assertTrue(pageController.toPermissions().equals(new String("permissions")));
		assertTrue(pageController.toQuery().equals(new String("query")));
		assertTrue(pageController.toResponse().equals(new String("response")));
	}
}
