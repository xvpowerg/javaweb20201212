package tw.com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
// /*�L�O�Ҧ���Filter
@WebFilter("/*")
public class TestFilter implements Filter {
//�u�n�ŦXFilter url-pattern�����|����
// Filter �L����
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, 
			FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("doFilter!!");
		//�p�G�n��ܵe�������I�s doFilter
		chain.doFilter(req, resp);
		
	}

}
