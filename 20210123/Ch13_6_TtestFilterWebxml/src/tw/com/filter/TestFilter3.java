package tw.com.filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter3 implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			System.out.println("TestFilter3 Start");
			chain.doFilter(request, response);
			String msg = request.getAttribute("msg").toString();
			System.out.println("TestFilter3 End:"+msg);
	}
}
