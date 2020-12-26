package tw.com.web.tools;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

public class RequestTools {
   
	
	public static String[] getParamaters(HttpServletRequest req,
			String name) {		
		   String[] value = req.getParameterValues(name);				
		   return Optional.ofNullable(value).orElse(new String[0]);		
	}
	
	public static String getParamater(HttpServletRequest req,
			String name ,
			String defaultValue) {		
		    String[]   paramaters = getParamaters(req,name);
		 return paramaters.length >0 ?paramaters[0]:defaultValue; 
	}
	
	
	
	
} 
