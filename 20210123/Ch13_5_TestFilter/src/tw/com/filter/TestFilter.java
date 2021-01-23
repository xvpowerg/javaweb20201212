package tw.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
// /*他是所有的Filter
@WebFilter("/*")
public class TestFilter implements Filter {
//只要符合Filter url-pattern的都會執行
// Filter 無順序
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, 
			FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("doFilter!!");
		//如果要顯示畫面必須呼叫 doFilter
		chain.doFilter(req, resp);
		
	}

}
