package tw.com.istener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import tw.com.dbtools.DBInfo;
@WebListener
public class ContextListenerInitDB implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		ServletContext context = event.getServletContext();
		String url = context.getInitParameter("url");
		String account = context.getInitParameter("account");
		String password = context.getInitParameter("password");
		String sqltype = context.getInitParameter("sqltype");
		DBInfo.initDBInfo(url, password, account, sqltype);
	}
	
}
