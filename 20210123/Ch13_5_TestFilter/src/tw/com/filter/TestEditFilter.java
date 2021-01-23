package tw.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter("/edit/*")
public class TestEditFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			System.out.println("edit doFilter");
			HttpServletRequest httpRequest = 
					(HttpServletRequest) request;
			HttpServletResponse  httpResponse =(HttpServletResponse)response;
			HttpSession session = httpRequest.getSession();
			String contextPath = httpRequest.getContextPath();
			String servletPath = httpRequest.getServletPath();
			String pathInfo = httpRequest.getPathInfo();
			System.out.println("contextPath:"+contextPath);
			System.out.println("servletPath:"+servletPath);
			//System.out.println("pathInfo:"+pathInfo);
			if (session.getAttribute("user")!= null) {
				chain.doFilter(request, response);	
			}else {
				httpResponse.sendRedirect(contextPath+"/page5");
			}
			
			
			
	}

}
