package tw.com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//asyncSupported 使得Servlet支持非同步化
@WebServlet(urlPatterns = {"/page2"},asyncSupported = true)
public class Page2Servlet extends HttpServlet{
	private ExecutorService service = Executors.newCachedThreadPool();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Page2Servlet!!! 1"+Thread.currentThread().getName());	
			
		AsyncContext ctx = req.startAsync();		
		service.submit(()->{
			System.out.println("Page2Servlet submit start:!!!"+Thread.currentThread().getName());
		 
			try {
				  PrintWriter out = ctx.getResponse().getWriter();	
				  String seccond  = ctx.getRequest().getParameter("seccond");
				  System.out.println("seccond:"+seccond);
				TimeUnit.SECONDS.sleep(Integer.parseInt(seccond) );	
				  out.println("Complete.....");
				  ctx.complete();
			}catch(Exception ex) {				
				System.out.println("Ex:"+ex);
			}
			
		});	
		System.out.println("Page2Servlet!!! 2"+Thread.currentThread().getName());			
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			AsyncContext ctx= req.startAsync();
			service.submit(()->{				
				String number= 	ctx.getRequest().getParameter("number");			
			    System.out.println("number:"+number);
			    try {
			    	PrintWriter out =   ctx.getResponse().getWriter(); 
			    	TimeUnit.SECONDS.sleep(Integer.parseInt(number));
			    	out.println("Post !complete!!");
			    	ctx.complete();
			    }catch(Exception ex) {
			    	System.out.println("ex:"+ex);
			    }
			    
				
			});
	
	}
	@Override
	public void destroy() {
		service.shutdown();
	}
}
