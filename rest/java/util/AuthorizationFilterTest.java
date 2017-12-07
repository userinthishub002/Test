package util;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import primefaces_aqua.util.AuthorizationFilter;

import static org.mockito.Mockito.*;

public class AuthorizationFilterTest {
	private HttpServletRequest httpServletRequest;
	private HttpServletResponse httpServletResponse;
	private FilterChain filterChain;
	
	//Mocking objects
	@Before
	public void init(){
		httpServletRequest = mock(HttpServletRequest.class);
	    httpServletResponse = mock(HttpServletResponse.class);
	    filterChain = mock(FilterChain.class);
	}
	
	@After
	public void tearDown(){
		httpServletRequest = null;
	    httpServletResponse = null;
	    filterChain = null;
	}
	
	@Test
	public void doFilterTest() throws ServletException, IOException{
		when(httpServletRequest.getRequestURI()).thenReturn("/query.xhtml");
		
		//Emulating the request to our filter;
		AuthorizationFilter authorizationFilter = new AuthorizationFilter();
		authorizationFilter.doFilter(httpServletRequest, httpServletResponse, filterChain);
		
		//Verifying the result
		verify(httpServletResponse).sendRedirect("null/index.xhtml");
	}
}