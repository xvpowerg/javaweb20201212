package tw.com.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestContextListener implements ServletContextListener  {
	public static  class ImageUtils {
		private static String imagePath;
		
		private static void setImagePath(String path) {
			imagePath = path;
		}
		public static String getImagePath() {
			return imagePath;
		}
		
		
	}
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextInitialized");
		String imagepath = sce.getServletContext().getInitParameter("imagepath");
		ImageUtils.setImagePath(imagepath);
	}
	
	
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextDestroyed");
	}

	
		
}
